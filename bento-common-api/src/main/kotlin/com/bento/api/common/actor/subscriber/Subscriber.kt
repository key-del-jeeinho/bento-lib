package com.bento.api.common.actor.subscriber

interface Subscriber<T> {
    fun subscribe(data: T)
}