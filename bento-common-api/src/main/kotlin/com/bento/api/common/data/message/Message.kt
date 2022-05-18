package com.bento.api.common.data.message

import com.bento.api.common.data.key.Key
import com.bento.api.common.data.payload.Payload

interface Message {
    fun getKey(): Key<*>
    fun getPayload(): Payload<*>
}