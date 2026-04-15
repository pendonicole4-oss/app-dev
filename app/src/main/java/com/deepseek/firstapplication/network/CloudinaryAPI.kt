package com.deepseek.firstapplication.network
import com.deepseek.firstapplication.models.CloudinaryResponse
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.Response


interface CloudinaryAPI{
    @Multipart
    @POST("v1_1/         /image/upload")  //space is for your cloud name
    suspend fun uploadImage(
        @Part file: MultipartBody.Part,
        @Part ("upload_preset") uploadPreset: RequestBody
    ): Response<CloudinaryResponse>

}