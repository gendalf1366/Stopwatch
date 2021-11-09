package ru.gendalf13666.stopwatch.domain

interface ITimestampProvider {
    fun getMilliseconds(): Long
}
