package com.bento.api.common.data

interface WrappedData<T> {
    fun getValue(): T
}
