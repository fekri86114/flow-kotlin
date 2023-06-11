package info.fekri.flow

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map

class MainViewModel(): ViewModel() {
    private val _counter = MutableStateFlow(0)
    val counter : StateFlow<Int> get() = _counter

    fun incrementCounter() {
        _counter.value ++
    }

}