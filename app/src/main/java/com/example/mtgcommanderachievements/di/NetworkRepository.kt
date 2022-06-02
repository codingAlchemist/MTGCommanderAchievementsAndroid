package com.example.mtgcommanderachievements.di

import com.example.mtgcommanderachievements.api.AchievementsService
import com.example.mtgcommanderachievements.api.BaseApiResponse
import javax.inject.Inject

class NetworkRepository @Inject constructor(private val achievementsService: AchievementsService):BaseApiResponse() {

}