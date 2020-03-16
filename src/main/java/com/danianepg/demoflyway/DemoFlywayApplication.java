package com.danianepg.demoflyway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoFlywayApplication {

  /**
   * When running with maven plugin
   * mvn flyway:validate
   * mvn flyway:repair
   * mvn flyway:migrate
   *
   * @param args
   */

  public static void main(final String[] args) {
    System.exit(SpringApplication.exit(SpringApplication.run(DemoFlywayApplication.class, args)));
  }

}
