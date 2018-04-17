package me.fengmlo.updatelibrary;


import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * 用于Retrofit的服务器Api类
 *
 * @author fengmlo
 */
public interface ServerApi {

    @GET("catch-doll-item-platform/appVersion/checkAppVersion")
    Observable<BaseHttpResponse<CheckUpdateResponse>> checkUpdate(@QueryMap Map<String, String> request);
}
