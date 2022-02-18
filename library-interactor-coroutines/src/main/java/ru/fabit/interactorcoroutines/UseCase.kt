package ru.fabit.interactorcoroutines

abstract class UseCase<Params : UseCaseParams, ReturnType> {
    abstract suspend fun build(params: Params): ReturnType
}