package com.rhino.easydevdemo.utils;

import android.app.Activity;
import android.content.Intent;

import com.rhino.easydevdemo.ui.LoginActivity;
import com.rhino.easydevdemo.ui.MainActivity;

/**
 * @author rhino
 * @since Create on 2019/4/14.
 **/
public class UiUtils {


    public static void showLoginPage(Activity activity) {
        activity.startActivity(new Intent(activity, LoginActivity.class));
    }

    public static void showMainPage(Activity activity) {
        activity.startActivity(new Intent(activity, MainActivity.class));
    }

}
