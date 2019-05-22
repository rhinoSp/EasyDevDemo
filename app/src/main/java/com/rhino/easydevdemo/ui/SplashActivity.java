package com.rhino.easydevdemo.ui;

import android.Manifest;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.text.TextUtils;

import com.rhino.easydev.base.BaseSimpleTitleHttpActivity;
import com.rhino.easydevdemo.R;
import com.rhino.easydevdemo.constant.Cache;
import com.rhino.easydevdemo.constant.FileConfig;
import com.rhino.easydevdemo.databinding.ActivitySplashBinding;
import com.rhino.easydevdemo.http.HttpApi;
import com.rhino.easydevdemo.http.result.BaseResult;
import com.rhino.ui.utils.FileUtils;
import com.rhino.ui.utils.ui.ColorUtils;
import com.rhino.ui.utils.ui.ToastUtils;

import io.reactivex.functions.Consumer;

/**
 * <p>欢迎界面</p>
 *
 * @author rhino
 * @since Create on 2019/4/14.
 **/
public class SplashActivity extends BaseSimpleTitleHttpActivity<ActivitySplashBinding> {

    private static final String[] PERMISSIONS = new String[]{
            Manifest.permission.INTERNET,
            Manifest.permission.ACCESS_NETWORK_STATE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.READ_PHONE_STATE
    };

    @Override
    public void setContent() {
        setContentView(R.layout.activity_splash);
    }

    @Override
    public void initView() {
        mActionBarHelper.setBackgroundColor(ColorUtils.WHITE);
        mActionBarHelper.setTitleVisible(false);
        checkPermission();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        FileUtils.makeDirectory(FileConfig.FOLDERS);
        showNextPage();
    }

    private void showNextPage() {
        String account = Cache.getAccount();
        String password = Cache.getPassword();
        if (!TextUtils.isEmpty(account) && !TextUtils.isEmpty(password) && Cache.isRememberPassword()) {
            // 登录
            httpUtils.request(HttpApi.api().login(), null, new Consumer<BaseResult<String>>() {
                @Override
                public void accept(BaseResult<String> result) throws Exception {
                    UiUtils.showMainPage(SplashActivity.this);
                    finish();
                }
            }, new Consumer<Throwable>() {
                @Override
                public void accept(Throwable throwable) throws Exception {
                    ToastUtils.show("登录失败！");
//                    UiUtils.showLoginPage(SplashActivity.this);
                    UiUtils.showMainPage(SplashActivity.this);
                    finish();
                }
            });
        } else {
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    if (!isFinishing()) {
                        UiUtils.showMainPage(SplashActivity.this);
                        finish();
                    }
                }
            }, 1000);
        }
    }

    private void checkPermission() {
        ActivityCompat.requestPermissions(this, PERMISSIONS, 0);
    }

}
