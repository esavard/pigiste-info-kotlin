package info.pigiste.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PigisteInfoApplication

fun main(args: Array<String>) {
    runApplication<PigisteInfoApplication>(*args)
}
