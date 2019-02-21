package oboznyi.productsservice.web.controllers

import oboznyi.productsservice.models.Product
import oboznyi.productsservice.services.ProductsService
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleController(private val productsService: ProductsService) {

    @RequestMapping("/all")
    fun getAllProducts(): List<Product> {
        return productsService.getAll()
    }

    @RequestMapping("/byId/{id}")
    fun getProductById(@PathVariable("id") id: Int): Product? {
        val optionalProduct = productsService.getById(id)
        return if (optionalProduct.isPresent) {
            optionalProduct.get()
        } else null
    }

}
