package com.example.mtgcommanderachievements.api

import com.example.mtgcommanderachievements.models.Achievement
import retrofit2.Response
import retrofit2.http.GET

interface AchievementsService {

    @GET("/achievement")
    suspend fun getAllAchievements():Response<List<Achievement>>
}