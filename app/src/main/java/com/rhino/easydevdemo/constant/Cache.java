package com.rhino.easydevdemo.constant;

import com.rhino.easydevdemo.BuildConfig;
import com.rhino.ui.utils.SharedPreferencesUtils;

/**
 * @author rhino
 * @since Create on 2019/4/14.
 **/
public class Cache {

    public static void saveAccount(String account) {
        SharedPreferencesUtils.getInstance().putString("user_account", account);
    }

    public static void savePassword(String password) {
        SharedPreferencesUtils.getInstance().putString("user_password", password);
    }

    public static void saveShowPassword(boolean showPassword) {
        SharedPreferencesUtils.getInstance().putBoolean("show_password", showPassword);
    }

    public static void saveRememberPassword(boolean rememberPassword) {
        SharedPreferencesUtils.getInstance().putBoolean("remember_password", rememberPassword);
    }

    public static String getAccount() {
        return SharedPreferencesUtils.getInstance().getString("user_account", BuildConfig.DEBUG ? "111" : "");
    }

    public static String getPassword() {
        return SharedPreferencesUtils.getInstance().getString("user_password", BuildConfig.DEBUG ? "111" : "");
    }

    public static boolean isShowPassword() {
        return SharedPreferencesUtils.getInstance().getBoolean("show_password", BuildConfig.DEBUG);
    }

    public static boolean isRememberPassword() {
        return SharedPreferencesUtils.getInstance().getBoolean("remember_password", BuildConfig.DEBUG);
    }

}
