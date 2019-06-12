package net.qiujuer.italker.push.di.moudle;

import net.qiujuer.italker.common.widget.recycler.RecyclerAdapter;
import net.qiujuer.italker.push.activities.AccountActivity;
import net.qiujuer.italker.push.activities.SearchActivity;
import net.qiujuer.italker.push.di.component.BaseFragmentComponent;
import net.qiujuer.italker.push.frags.account.LoginFragment;
import net.qiujuer.italker.push.frags.account.RegisterFragment;
import net.qiujuer.italker.push.frags.main.ActiveFragment;
import net.qiujuer.italker.push.frags.main.ContactFragment;
import net.qiujuer.italker.push.frags.main.GroupFragment;
import net.qiujuer.italker.push.frags.message.ChatGroupFragment;
import net.qiujuer.italker.push.frags.message.ChatUserFragment;
import net.qiujuer.italker.push.frags.search.SearchGroupFragment;
import net.qiujuer.italker.push.frags.search.SearchUserFragment;
import net.qiujuer.italker.push.frags.user.UpdateInfoFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * author hq
 * data  2019/6/12
 */
@Module(subcomponents = BaseFragmentComponent.class)
public abstract class AbstractAllFragmentModule {

    @ContributesAndroidInjector(modules = LoginFragmentModule.class)
    abstract LoginFragment contributesLoginFragmentInject();

    @ContributesAndroidInjector(modules = LoginFragmentModule.class)
    abstract RegisterFragment contributesRegisterFragmentInject();

    @ContributesAndroidInjector(modules = LoginFragmentModule.class)
    abstract ActiveFragment contributesActiveFragmentInject();

    @ContributesAndroidInjector(modules = LoginFragmentModule.class)
    abstract ContactFragment contributesContactFragmentInject();

    @ContributesAndroidInjector(modules = LoginFragmentModule.class)
    abstract GroupFragment contributesGroupFragmentInject();

    @ContributesAndroidInjector(modules = LoginFragmentModule.class)
    abstract SearchGroupFragment contributesSearchGroupFragmentInject();

    @ContributesAndroidInjector(modules = LoginFragmentModule.class)
    abstract SearchUserFragment contributesSearchUserFragmentInject();

    @ContributesAndroidInjector(modules = LoginFragmentModule.class)
    abstract UpdateInfoFragment contributesUpdateInfoFragmentInject();

    @ContributesAndroidInjector(modules = LoginFragmentModule.class)
    abstract ChatGroupFragment contributesChatGroupFragmentInject();

    @ContributesAndroidInjector(modules = LoginFragmentModule.class)
    abstract ChatUserFragment contributesChatUserFragmentInject();




}
