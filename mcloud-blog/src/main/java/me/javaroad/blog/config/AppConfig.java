package me.javaroad.blog.config;

import me.javaroad.data.entity.config.JpaAuditingConfig;
import me.javaroad.web.config.Swagger2Config;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author heyx
 */
@Import({
    Swagger2Config.class,
    JpaAuditingConfig.class
})
@Configuration
public class AppConfig {

}
