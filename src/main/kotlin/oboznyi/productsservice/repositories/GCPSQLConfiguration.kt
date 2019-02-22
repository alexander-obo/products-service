package oboznyi.productsservice.repositories

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Configuration
open class GCPSQLConfiguration(private val properties: GCPSQLConfigurationProperties) {

    @Bean
    open fun dataSource(): DataSource {
        val config = HikariConfig()
        config.jdbcUrl = String.format("jdbc:postgresql:///%s", properties.dbName)
        config.username = properties.dbUser
        config.password = properties.dbPassword
        config.addDataSourceProperty("socketFactory", properties.socketFactory)
        config.addDataSourceProperty("cloudSqlInstance", properties.instanceName)
        return HikariDataSource(config)
    }

}
