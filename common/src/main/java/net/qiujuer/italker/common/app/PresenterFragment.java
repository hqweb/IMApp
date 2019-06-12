package net.qiujuer.italker.common.app;

import android.content.Context;

import net.qiujuer.italker.factory.presenter.BaseContract;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.support.AndroidSupportInjection;

/**
 * @author qiujuer Email:qiujuer@live.cn
 * @version 1.0.0
 */
public abstract class PresenterFragment<Presenter extends BaseContract.Presenter> extends Fragment
        implements BaseContract.View {

    @Inject
    protected Presenter mPresenter;

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }

        super.onAttach(context);

        // 在界面onAttach之后就触发初始化Presenter
      //  initPresenter();
    }

    /**
     * 初始化Presenter
     *
     * @return Presenter
     */
   // protected abstract Presenter initPresenter();

    @Override
    public void showError(int str) {
        // 显示错误, 优先使用占位布局
        if (mPlaceHolderView != null) {
            mPlaceHolderView.triggerError(str);
        } else {
            Application.showToast(str);
        }
    }

    @Override
    public void showLoading() {
        if (mPlaceHolderView != null) {
            mPlaceHolderView.triggerLoading();
        }
    }

//    @Override
//    public void setPresenter(Presenter presenter) {
//        // View中赋值Presenter
//        mPresenter = presenter;
//    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter != null)
            mPresenter.destroy();
    }
}
