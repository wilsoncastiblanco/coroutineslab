import javafx.application.Application.launch
import kotlinx.coroutines.*

fun main()  {
     val job = Job()
     val scopeIO = CoroutineScope(job + Dispatchers.Main)
    scopeIO.launch {
        doWorld()
        doMars()
    }
    println("Hello,")
}

suspend fun doWorld() {
    delay(5000L)
    println("World!")
}

suspend fun doMars() {
    delay(5000L)
    println("Mars!")
}