package com.example.callwebservicewithkeycloakauth

import io.reactivex.Single
import retrofit2.http.GET

interface Webservice{

    @GET("privateAccess/")
    fun requestPrivateAccess(): Single<String>

    @GET("publicAccess/")
    fun requestPublicAccess(): Single<String>
}