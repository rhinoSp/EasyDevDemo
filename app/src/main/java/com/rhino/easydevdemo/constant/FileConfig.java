package com.rhino.easydevdemo.constant;

import com.rhino.easydevdemo.AppApplication;

import java.io.File;

/**
 * @author rhino
 * @since Create on 2019/4/14.
 **/
public class FileConfig {

    /**
     * 配置目录
     */
    public static final String CONFIG_FOLDER_NAME = "config";
    /**
     * 图片目录
     */
    public static final String PICTURE_FOLDER_NAME = "image";
    /**
     * 日志目录
     */
    public static final String LOG_FOLDER_NAME = "log";
    /**
     * 升级apk文件名称
     */
    public static final String UPDATE_FILE_NAME = "update.apk";

    /**
     * 存储根目录
     */
    public static final String ROOT_PATH = AppApplication.getInstance().getExternalFilesDir(null).getParent();
    /**
     * 配置文件夹路径
     */
    public static final String CONFIG_FOLDER_PATH = ROOT_PATH + File.separator + CONFIG_FOLDER_NAME;
    /**
     * 图片文件夹路径
     */
    public static final String PICTURE_FOLDER_PATH = ROOT_PATH + File.separator + PICTURE_FOLDER_NAME;
    /**
     * 日志文件夹路径
     */
    public static final String LOG_FOLDER_PATH = ROOT_PATH + File.separator + LOG_FOLDER_NAME;
    /**
     * 升级文件全路径
     */
    public static final String UPDATE_APK_FILE_PATH = ROOT_PATH + File.separator + UPDATE_FILE_NAME;

    public static final String[] FOLDERS = new String[]{
            CONFIG_FOLDER_PATH,
            PICTURE_FOLDER_PATH,
            LOG_FOLDER_PATH
    };

}
