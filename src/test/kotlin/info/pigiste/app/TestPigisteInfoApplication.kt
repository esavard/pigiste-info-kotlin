package info.pigiste.app

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
    fromApplication<PigisteInfoApplication>().with(TestcontainersConfiguration::class).run(*args)
}
