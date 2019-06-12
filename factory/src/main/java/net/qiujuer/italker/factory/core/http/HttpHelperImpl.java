package net.qiujuer.italker.factory.core.http;

import net.qiujuer.italker.factory.model.api.account.LoginModel;
import net.qiujuer.italker.factory.net.RemoteService;

/**
 * author hq
 * data  2019/6/12
 */
public class HttpHelperImpl implements HttpHelper {

    private RemoteService remoteService;


    HttpHelperImpl(RemoteService geeksApis) {
        remoteService = geeksApis;
    }


    @Override
    public void setLoginAccount(LoginModel account) {
        remoteService.accountLogin(account);
    }
}
