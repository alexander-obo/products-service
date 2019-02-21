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
    val name: String = "",
    val price: BigDecimal = BigDecimal.ZERO,
    val count: Int = 0
)
