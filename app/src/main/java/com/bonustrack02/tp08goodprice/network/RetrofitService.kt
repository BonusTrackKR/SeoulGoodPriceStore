package com.bonustrack02.tp08goodprice.network

import com.bonustrack02.tp08goodprice.BuildConfig
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface RetrofitService {
    @GET("/{key}/json/ListPriceModelStoreService/{startIndex}/{endIndex}/{inDutyCode}")
    fun getStoreJson(
        @Path("key") key: String,
        @Path("startIndex") startIndex: Int,
        @Path("endIndex") endIndex: Int,
        @Path("inDutyCode") inDutyCode: String
    ): Call<RetrofitResponse>

    @GET("/v2/local/search/keyword.json")
    @Headers("Authorization: KakaoAK ${BuildConfig.KAKAORESTAPIKEY}")
    fun getLocationByKakaoKeyword(
        @Query("query") query: String,
    ): Call<ResponseKeyword>
}