package oboznyi.productsservice.services

import oboznyi.productsservice.models.Product
import oboznyi.productsservice.repositories.ProductRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class GCPProductsService(private val productRepository: ProductRepository) : ProductsService {

    override fun getAll(): List<Product> = productRepository.findAll().toList()

    override fun getById(id: Int): Optional<Product> = productRepository.findById(id)

    override fun add(product: Product): Product = productRepository.save(product)

    override fun delete(id: Int) = productRepository.deleteById(id)

    override fun update(id: Int, product: Product) {
        val productFromRepo = productRepository.findById(id).get()
        productFromRepo.let {
            it.name = product.name ?: it.name
            it.price = product.price ?: it.price
            it.count = product.count ?: it.count
        }
        productRepository.save(productFromRepo)
    }

}
