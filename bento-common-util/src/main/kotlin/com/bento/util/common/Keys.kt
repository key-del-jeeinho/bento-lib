package com.bento.util.common

import com.bento.api.common.data.key.KeyFactory
import kotlin.reflect.KClass

@Suppress("unchecked_cast")
object Keys {
    private val keyFactories: MutableMap<KClass<out Any>, KeyFactory<out Any>> = mutableMapOf()
    fun <T: Any> addRoutingKeyFactory(clazz: KClass<T>, keyFactory: KeyFactory<T>) { this.keyFactories[clazz] = keyFactory }

    fun <T: Any> of(value: T) = keyFactories[value::class]
        ?.let { it as KeyFactory<T> }?.create(value)
        ?: throw UnsupportedOperationException("No KeyFactory found for ${value::class}")
}