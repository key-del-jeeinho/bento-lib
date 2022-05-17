package com.bento.api.common.actor.publisher

import com.bento.api.common.data.message.Message

interface Publisher {
    fun publish(message: Message)
}