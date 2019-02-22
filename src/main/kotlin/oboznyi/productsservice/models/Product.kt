package oboznyi.productsservice.models

import java.math.BigDecimal
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(schema = "public", name = "products")
class Product(
    @Id
    val id: Int = 0,
    var name: String = "",
    var price: BigDecimal = BigDecimal.ZERO,
    var count: Int = 0
)
