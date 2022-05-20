package com.bento.util.common

import com.bento.api.common.data.payload.PayloadFactory
import kotlin.reflect.KClass

@Suppress("unchecked_cast")
object Payloads {
    private val payloadFactories: MutableMap<KClass<out Any>, PayloadFactory<out Any>> = mutableMapOf()
    fun <T: Any> addPayloadFactory(clazz: KClass<T>, payloadFactory: PayloadFactory<T>) { this.payloadFactories[clazz] = payloadFactory }

    fun <T: Any> of(value: T) = payloadFactories[value::class]
        ?.let { it as PayloadFactory<T> }?.create(value)
        ?: throw UnsupportedOperationException("No PayloadFactory found for ${value::class}")
}