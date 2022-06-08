package ru.fabit.interactorcoroutines

import kotlinx.coroutines.flow.Flow

abstract class EmptyParamsFlowUseCase<ReturnType>: UseCase<EmptyParams, Flow<ReturnType>>() {
    override suspend fun build(params: EmptyParams): Flow<ReturnType> {
        return build()
    }

    abstract suspend fun build(): Flow<ReturnType>
}