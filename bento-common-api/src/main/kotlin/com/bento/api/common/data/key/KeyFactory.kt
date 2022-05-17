package com.bento.api.common.data.key

interface KeyFactory<T> {
    fun create(value: T): Key<T>
}