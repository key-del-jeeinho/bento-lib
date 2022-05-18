package com.bento.api.common.actor.publisher

interface TypedMessagePublisher<K, V>: MessagePublisher {
    fun publish(routingKey: K, data: V)
}