package com.bento.api.common.data.key

interface KeyFormatter<T, R> {
    fun format(data: T): Key<R>
}