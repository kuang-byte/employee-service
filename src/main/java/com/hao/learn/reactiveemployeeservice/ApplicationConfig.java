package com.hao.learn.reactiveemployeeservice;

import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionFactory;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@Configuration
@EnableR2dbcRepositories
public class ApplicationConfig extends AbstractR2dbcConfiguration {

  @Override
  public ConnectionFactory connectionFactory() {
    return new PostgresqlConnectionFactory(
        PostgresqlConnectionConfiguration.builder()
            .host("localhost")
            .port(5432)
            .username("postgres")
            .password("password")
            .database("employee")
            .build()
    );
  }
}
