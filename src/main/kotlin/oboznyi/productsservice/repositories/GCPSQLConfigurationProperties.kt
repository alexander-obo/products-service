package oboznyi.productsservice.repositories

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties("gcp.sql")
class GCPSQLConfigurationProperties {

    lateinit var dbName: String
    lateinit var dbUser: String
    lateinit var dbPassword: String
    lateinit var instanceName: String
    lateinit var socketFactory: String

}
