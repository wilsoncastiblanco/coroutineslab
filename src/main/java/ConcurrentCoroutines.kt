import kotlinx.coroutines.*
import kotlin.concurrent.thread


fun main() = runBlocking { // this: CoroutineScope
    repeat(1_000_000) { counter ->
        launch {
            println(" $counter")
        }
    }
}



