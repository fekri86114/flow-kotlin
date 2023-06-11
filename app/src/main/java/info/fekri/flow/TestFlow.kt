package info.fekri.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectIndexed
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val flow = flowOf(1, 2, 3, 4, 5)

    // collect
    flow.collect { value ->
        println("Collect: $value")
        delay(1000)
    }

    // collectLatest
    flow.collectLatest { value ->
        println("CollectLatest: $value")
        delay(1000)
    }

    // collectIndexed
    flow.collectIndexed { index, value ->
        println("CollectedIndex - Index: $index - $value")
    }
}