package com.bento.api.common.data.message

import com.bento.api.common.data.payload.Payload

interface PayloadFormatter<T, R> {
    fun format(data: T): Payload<R>
}