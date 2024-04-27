package de.frachtwerk.essencium.backend.configuration.properties;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@EqualsAndHashCode(callSuper = false)
@Configuration
@ConfigurationProperties(prefix = "essencium.jpa")
public class AppConfigJpaProperties {
  private final boolean camelCaseToUnderscore = false;
  private final String tablePrefix = "FW_";
}
