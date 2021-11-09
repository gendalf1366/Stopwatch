package ru.gendalf13666.stopwatch.domain

class TimestampProviderImpl : ITimestampProvider {
    override fun getMilliseconds(): Long =
        System.currentTimeMillis()
}
