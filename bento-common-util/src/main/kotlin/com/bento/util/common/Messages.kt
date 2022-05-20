package com.bento.util.common

import com.bento.api.common.data.key.Key
import com.bento.api.common.data.message.MessageFactory
import com.bento.api.common.data.payload.Payload

object Messages {
    private lateinit var messageFactory: MessageFactory
    fun setMessageFactory(messageFactory: MessageFactory) { this.messageFactory = messageFactory }

    private fun of(first: Key<*>, second: Payload<*>) = messageFactory.create(first, second)
    fun <K: Any, P: Any>of(first: K, second: P) =
        ((if (first !is Key<*>) Keys.of(first) else first) to ( if(second !is Payload<*>) Payloads.of(second) else second))
            .let { of(it.first, it.second) }
}