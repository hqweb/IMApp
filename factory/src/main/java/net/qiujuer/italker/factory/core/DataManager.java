package net.qiujuer.italker.factory.core;

import net.qiujuer.italker.factory.core.http.HttpHelper;
import net.qiujuer.italker.factory.model.api.account.LoginModel;

import javax.inject.Inject;

/**
 * author hq
 * data  2019/6/12
 */
public class DataManager implements HttpHelper{


    private HttpHelper mHttpHelper;

    public DataManager(HttpHelper httpHelper) {
        mHttpHelper = httpHelper;
    }

    @Override
    public void setLoginAccount(LoginModel account) {
        mHttpHelper.setLoginAccount(account);
    }
}
