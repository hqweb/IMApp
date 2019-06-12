package net.qiujuer.italker.factory.presenter.message;

import net.qiujuer.italker.factory.data.helper.GroupHelper;
import net.qiujuer.italker.factory.data.message.MessageGroupRepository;
import net.qiujuer.italker.factory.data.message.MessageRepository;
import net.qiujuer.italker.factory.model.db.Group;
import net.qiujuer.italker.factory.model.db.Message;
import net.qiujuer.italker.factory.model.db.view.MemberUserModel;
import net.qiujuer.italker.factory.persistence.Account;

import java.util.List;

import javax.inject.Inject;

/**
 * 群聊天的逻辑
 *
 * @author qiujuer Email:qiujuer@live.cn
 * @version 1.0.0
 */
public class ChatGroupPresenter extends ChatPresenter<ChatContract.GroupView>
        implements ChatContract.Presenter<ChatContract.GroupView> {

    @Inject
    public ChatGroupPresenter() {
        // 数据源，View，接收者，接收者的类型
        super(Message.RECEIVER_TYPE_GROUP);
    }

    @Override
    public String setReceiverId(String receiverId) {
        super.setReceiverId(receiverId);
        mSource = new MessageGroupRepository(receiverId);
        return receiverId;
    }

    @Override
    public void start() {
        super.start();

        // 拿群的信息
        Group group = GroupHelper.findFromLocal(mReceiverId);
        if (group != null) {
            // 初始化操作
            ChatContract.GroupView view = getView();

            boolean isAdmin = Account.getUserId().equalsIgnoreCase(group.getOwner().getId());
            view.showAdminOption(isAdmin);

            // 基础信息初始化
            view.onInit(group);

            // 成员初始化
            List<MemberUserModel> models = group.getLatelyGroupMembers();
            final long memberCount = group.getGroupMemberCount();
            // 没有显示的成员的数量
            long moreCount = memberCount - models.size();
            view.onInitGroupMembers(models, moreCount);
        }

    }

}