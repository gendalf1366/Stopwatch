package ru.gendalf13666.stopwatch.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlinx.coroutines.CoroutineScope
import ru.gendalf13666.stopwatch.domain.StopwatchStateHolder

class StopWatchViewModelFactory(
    private val stopwatchStateHolder: StopwatchStateHolder,
    private val scope: CoroutineScope
) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
        StopWatchViewModel(stopwatchStateHolder, scope) as T
}
