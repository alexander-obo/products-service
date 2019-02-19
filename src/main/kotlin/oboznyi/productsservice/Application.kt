package oboznyi.productsservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class Application {
}

fun main(args: Array<String>) {
    println("Products Service starting...")
    SpringApplication.run(Application().javaClass, *args)
}