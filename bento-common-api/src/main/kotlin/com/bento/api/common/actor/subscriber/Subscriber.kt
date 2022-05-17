package com.bento.api.common.actor.subscriber

import com.bento.api.common.data.message.Message

interface Subscriber {
    fun publish(message: Message)
}