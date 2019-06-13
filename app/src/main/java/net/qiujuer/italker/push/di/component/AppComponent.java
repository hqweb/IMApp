package net.qiujuer.italker.push.di.component;

import net.qiujuer.italker.push.App;
import net.qiujuer.italker.push.di.moudle.AbstractAllActivityModule;
import net.qiujuer.italker.push.di.moudle.AbstractAllFragmentModule;
import net.qiujuer.italker.push.di.moudle.AppMoudle;
import net.qiujuer.italker.push.di.moudle.HttpModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * author hq
 * data  2019/6/12
 */

@Singleton
@Component(modules = {AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        AbstractAllActivityModule.class,
        AbstractAllFragmentModule.class,
        AppMoudle.class,
        HttpModule.class})
public interface AppComponent {

    /**
     * 注入App实例
     *
     * @param app app
     */
    void inject(App app);

}
