package com.rhino.easydevdemo;

import com.rhino.ui.base.BaseApplication;
import com.rhino.ui.utils.SharedPreferencesUtils;

/**
 * @author rhino
 * @since Create on 2019/4/14.
 **/
public class AppApplication extends BaseApplication {
    @Override
    public boolean isDebug() {
        return BuildConfig.DEBUG;
    }

    @Override
    public void baseInit() {
        super.baseInit();
        SharedPreferencesUtils.getInstance().init(getApplicationContext());
    }
}
