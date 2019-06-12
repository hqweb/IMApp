package net.qiujuer.italker.push.di.moudle;

import net.qiujuer.italker.push.LaunchActivity;
import net.qiujuer.italker.push.activities.AccountActivity;
import net.qiujuer.italker.push.activities.GroupCreateActivity;
import net.qiujuer.italker.push.activities.MainActivity;
import net.qiujuer.italker.push.activities.MessageActivity;
import net.qiujuer.italker.push.activities.PersonalActivity;
import net.qiujuer.italker.push.activities.SearchActivity;
import net.qiujuer.italker.push.activities.UserActivity;
import net.qiujuer.italker.push.di.component.BaseActivityComponent;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * author hq
 * data  2019/6/12
 */

@Module(subcomponents = {BaseActivityComponent.class})
public abstract class AbstractAllActivityModule {

    @ContributesAndroidInjector(modules = AccountActivityMoudle.class)
    abstract AccountActivity contributesAccountActivityInjector();

    @ContributesAndroidInjector(modules = GroupCreateActivityMoudle.class)
    abstract GroupCreateActivity contributesGroupCreateActivityInjector();

    @ContributesAndroidInjector(modules = AccountActivityMoudle.class)
    abstract MainActivity contributesMainActivityInjector();

    @ContributesAndroidInjector(modules = AccountActivityMoudle.class)
    abstract MessageActivity contributesMessageActivityInjector();

    @ContributesAndroidInjector(modules = AccountActivityMoudle.class)
    abstract PersonalActivity contributesPersonalActivityInjector();

    @ContributesAndroidInjector(modules = AccountActivityMoudle.class)
    abstract SearchActivity contributesSearchActivityInjector();

    @ContributesAndroidInjector(modules = AccountActivityMoudle.class)
    abstract UserActivity contributesUserActivityInjector();

    @ContributesAndroidInjector(modules = AccountActivityMoudle.class)
    abstract LaunchActivity contributesLaunchActivityInjector();

}
