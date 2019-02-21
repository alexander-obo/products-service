package oboznyi.productsservice

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.context.annotation.Bean
import javax.sql.DataSource

@SpringBootApplication
open class Application : SpringBootServletInitializer() {

    private val DB_NAME = "postgres"
    private val DB_USER = "postgres"
    private val DB_PASS = "postgres"
    private val CLOUD_SQL_INSTANCE_NAME = "products-service-232213:us-west2:products-storage-psql"

    @Bean
    open fun dataSource(): DataSource {
        val config = HikariConfig()
        config.jdbcUrl = String.format("jdbc:postgresql:///%s", DB_NAME)
        config.username = DB_USER
        config.password = DB_PASS
        config.addDataSourceProperty("socketFactory", "com.google.cloud.sql.postgres.SocketFactory")
        config.addDataSourceProperty("cloudSqlInstance", CLOUD_SQL_INSTANCE_NAME)
        return HikariDataSource(config)
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(Application().javaClass, *args)
}
