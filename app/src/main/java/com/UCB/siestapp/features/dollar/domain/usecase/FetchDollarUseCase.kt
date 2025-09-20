package com.UCB.siestapp.features.dollar.domain.usecase

import com.UCB.siestapp.features.dollar.domain.model.DollarModel
import com.UCB.siestapp.features.dollar.domain.repository.IDollarRepository
import kotlinx.coroutines.flow.Flow

class FetchDollarUseCase(
    val repository: IDollarRepository
) {
    suspend fun invoke(): Flow<DollarModel> {
        return repository.getDollar()
    }
}