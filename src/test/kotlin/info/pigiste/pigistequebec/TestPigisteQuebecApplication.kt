package info.pigiste.pigistequebec

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
    fromApplication<PigisteQuebecApplication>().with(TestcontainersConfiguration::class).run(*args)
}
