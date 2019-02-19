package oboznyi.productsservice.web.controllers

import oboznyi.productsservice.models.Product
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal

@RestController
class SimpleController {

    @RequestMapping("/simple")
    fun method(): Product {
        return Product("1", "pizza", BigDecimal.valueOf(75.0))
    }

}
