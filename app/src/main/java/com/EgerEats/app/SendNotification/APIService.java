package com.EgerEats.app.SendNotification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAARSX64IE:APA91bEy7UtAa25Z6R9kOxtjQbM0LDGeQ_5DtpkAKvlZMQL12__SdcnjPyC2whWGgW2o989sgeiZ-uGKg5oBJa60U35aaHVOaH4HXRAuvadjH7251HoXODxOXc_YUW-6s2vClZ5f8clo"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);
}
