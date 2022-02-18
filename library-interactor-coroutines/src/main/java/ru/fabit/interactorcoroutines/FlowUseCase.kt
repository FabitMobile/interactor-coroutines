package ru.fabit.interactorcoroutines

import kotlinx.coroutines.flow.Flow

abstract class FlowUseCase<Params : UseCaseParams, ReturnType>: UseCase<Params, Flow<ReturnType>>()