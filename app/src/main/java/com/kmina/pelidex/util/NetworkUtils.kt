package com.kmina.pelidex.util

import android.net.Uri
import java.net.MalformedURLException
import java.net.URL

class NetworkUtils {

    val MOVIES_API_URL = "http://www.omdbapi.com/"
    val TOKEN_API = "55b04979"

    fun builSearchUtl(movieName:String){
        val builUri = Uri.parse(MOVIES_API_URL)
            .buildUpon()
            .appendQueryParameter("apikey", TOKEN_API)
            .appendQueryParameter("t", movieName)
            .build()
        return try{
            URL(builUri.toString());
        }catch (e:MalformedURLException){
            URL("");
        }
    }
}