package com.rhino.easydevdemo.ui;

import com.rhino.easydev.base.BaseSimpleTitleHttpActivity;
import com.rhino.easydevdemo.R;
import com.rhino.easydevdemo.databinding.ActivityLoginBinding;
import com.rhino.ui.utils.ui.ColorUtils;

/**
 * <p>登录界面</p>
 *
 * @author rhino
 * @since Create on 2019/4/14.
 **/
public class LoginActivity extends BaseSimpleTitleHttpActivity<ActivityLoginBinding> {

    @Override
    public void setContent() {
        setContentView(R.layout.activity_login);
    }

    @Override
    public void initView() {
        mActionBarHelper.setBackgroundColor(ColorUtils.WHITE);
        mActionBarHelper.setTitleVisible(false);
    }
}
