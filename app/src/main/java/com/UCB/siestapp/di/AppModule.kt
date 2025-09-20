package com.UCB.siestapp.di

import com.UCB.siestapp.features.dollar.datasource.RealTimeRemoteDataSource
import com.UCB.siestapp.features.dollar.data.repositoy.DollarRepository
import com.UCB.siestapp.features.dollar.domain.repository.IDollarRepository
import com.UCB.siestapp.features.dollar.domain.usecase.FetchDollarUseCase
import com.UCB.siestapp.features.dollar.presentation.DollarViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single { RealTimeRemoteDataSource() }
    single<IDollarRepository> { DollarRepository(get()) }

    factory { FetchDollarUseCase(get()) }

    viewModel { DollarViewModel(get()) }
}
