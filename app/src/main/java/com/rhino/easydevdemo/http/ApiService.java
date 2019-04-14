package com.rhino.easydevdemo.http;


import com.rhino.easydevdemo.http.result.BaseResult;

import io.reactivex.Observable;
import retrofit2.http.POST;


/**
 * @author rhino
 * @since Create on 2019/4/14.
 **/
public interface ApiService {

    String BASE_URL = "http://www.51jiaji.cn:802/crm/";

    @POST("login")
    Observable<BaseResult<String>> login();

    @POST("MP/GetVersion")
    Observable<BaseResult<String>> getVersion();

}