package com.bento.api.common.data.payload

interface PayloadFactory<T> {
    fun create(value: T): Payload<T>
}