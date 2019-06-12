package net.qiujuer.italker.factory.presenter;

/**
 * @author qiujuer Email:qiujuer@live.cn
 * @version 1.0.0
 */
public class BasePresenter<T extends BaseContract.View> implements BaseContract.Presenter<T> {


    protected T mView;

    public BasePresenter() {

    }


//    public BasePresenter(T view) {
//        setView(view);
//    }



    @Override
    public void attachView(T view) {
        mView = view;
    }
    /**
     * 设置一个View，子类可以复写
     */
    @SuppressWarnings("unchecked")
//    protected void setView(T view) {
//        this.mView = view;
//        this.mView.setPresenter(this);
//    }

    /**
     * 给子类使用的获取View的操作
     * 不允许复写
     *
     * @return View
     */
    protected final T getView() {
        return mView;
    }

    @Override
    public void start() {
        // 开始的时候进行Loading调用
        T view = mView;
        if (view != null) {
            view.showLoading();
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public void destroy() {
        T view = mView;
        mView = null;
        if (view != null) {
            // 把Presenter设置为NULL
          //  view.setPresenter(null);
        }
    }




}
