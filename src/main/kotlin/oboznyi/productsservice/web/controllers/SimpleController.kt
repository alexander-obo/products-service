package oboznyi.productsservice.web.controllers

import oboznyi.productsservice.models.Product
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal
import kotlin.random.Random

@RestController
class SimpleController {

    @RequestMapping("/simple")
    fun method(): Product {
        val price = ((Random.nextDouble(10.0, 100.0) * 100).toInt()) / 100.0;
        return Product("1", "pizza", BigDecimal.valueOf(price))
    }

}
