package ru.fabit.interactorcoroutines

abstract class EmptyParamsUseCase<ReturnType>: UseCase<EmptyParams, ReturnType>() {
    override suspend fun build(params: EmptyParams): ReturnType {
        return build()
    }

    abstract suspend fun build(): ReturnType
}