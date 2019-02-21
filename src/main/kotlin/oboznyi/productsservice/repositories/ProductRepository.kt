package oboznyi.productsservice.repositories

import oboznyi.productsservice.models.Product
import org.springframework.data.repository.CrudRepository

interface ProductRepository : CrudRepository<Product, Int> {
}