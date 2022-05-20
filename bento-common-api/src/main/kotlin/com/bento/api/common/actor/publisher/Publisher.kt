package com.bento.api.common.actor.publisher

interface Publisher<T> {
    fun publish(data: T)
}