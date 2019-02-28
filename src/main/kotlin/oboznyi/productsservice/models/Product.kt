package oboznyi.productsservice.models

import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(schema = "public", name = "products")
class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,
    var name: String? = null,
    var price: BigDecimal? = null,
    var count: Int? = null
)
