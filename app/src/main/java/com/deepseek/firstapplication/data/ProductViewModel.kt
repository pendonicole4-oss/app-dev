package com.deepseek.firstapplication.data

import android.content.Context
import android.net.Uri
import androidx.navigation.NavHostController
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import java.io.InputStream

class ProductViewModel( var navController: NavHostController,var context: Context){
    fun uploadProduct(imageUri: Uri?, name: String, price: String, description: String) {}

    var cloudinaryUrl="https://api.cloudinary.com/v1_1/dootpvzq8/image/upload" //use your cloud name
    val uploadPreset="products" //the name of the folder in cloudify


    //upload product
    //update product
    //delete product
    //fetch product

    //upload image to cloudinary
    private fun uploadToCloudinary(context: Context, uri: Uri): String {

        val inputStream: InputStream? = context.contentResolver.openInputStream(uri)
        val fileBytes = inputStream?.readBytes()
            ?: throw Exception("Image read failed")

        val requestBody = MultipartBody.Builder().setType(MultipartBody.FORM)
            .addFormDataPart(
                "file",
                "image.jpg",
                RequestBody.create("image/*".toMediaTypeOrNull(), fileBytes)
            )
            .addFormDataPart("upload_preset", uploadPreset)
            .build()

        val request = Request.Builder()
            .url(cloudinaryUrl)
            .post(requestBody)
            .build()

        val response = OkHttpClient().newCall(request).execute()

        if (!response.isSuccessful) throw Exception("Upload failed")

        val responseBody = response.body?.string()

        val secureUrl = Regex("\"secure_url\":\"(.*?)\"")
            .find(responseBody ?: "")?.groupValues?.get(1)

        return secureUrl ?: throw Exception("Failed to get image URL")
    }



}