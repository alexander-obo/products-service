package oboznyi.productsservice.services

import oboznyi.productsservice.models.Product
import java.util.*

interface ProductsService {

    fun getAll(): List<Product>

    fun getById(id: Int): Optional<Product>

    fun add(product: Product): Product

}
