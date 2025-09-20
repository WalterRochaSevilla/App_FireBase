package com.UCB.siestapp.features.dollar.domain.repository

import com.UCB.siestapp.features.dollar.domain.model.DollarModel
import kotlinx.coroutines.flow.Flow

interface IDollarRepository {
    suspend fun getDollar(): Flow<DollarModel>
}