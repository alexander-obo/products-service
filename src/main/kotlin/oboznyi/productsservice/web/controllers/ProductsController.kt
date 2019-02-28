package oboznyi.productsservice.web.controllers

import oboznyi.productsservice.models.Product
import oboznyi.productsservice.services.ProductsService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/products")
class ProductsController(private val productsService: ProductsService) {

    @RequestMapping(method = [RequestMethod.GET])
    fun getProducts(): List<Product> = productsService.getAll().toList()

    @RequestMapping(path = ["/{id}"], method = [RequestMethod.GET])
    fun getProductById(@PathVariable("id") id: Int): Product {
        val optionalProduct = productsService.getById(id)
        if (optionalProduct.isPresent)
            return optionalProduct.get()
        throw ResponseStatusException(HttpStatus.NOT_FOUND, "Product with ID [$id] not found")
    }

    @RequestMapping(method = [RequestMethod.POST])
    fun addProduct(product: Product): Product = productsService.add(product)

    @RequestMapping(path = ["/{id}"], method = [RequestMethod.DELETE])
    fun deleteProduct(@PathVariable("id") id: Int) = productsService.delete(id)

    @RequestMapping(path = ["/{id}"], method = [RequestMethod.PUT])
    fun updateProductById(@PathVariable("id") id: Int, product: Product) = productsService.update(id, product)

}