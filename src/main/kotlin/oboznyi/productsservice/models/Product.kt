package oboznyi.productsservice.models

import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(schema = "public", name = "products")
class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    var name: String = "",
    var price: BigDecimal = BigDecimal.ZERO,
    var count: Int = 0
)
