package com.bento.api.common.data.payload

interface PayloadFormatter<T, R> {
    fun format(data: T): Payload<R>
}