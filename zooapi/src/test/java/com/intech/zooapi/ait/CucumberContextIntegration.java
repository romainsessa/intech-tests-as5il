package com.intech.zooapi.ait;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import io.cucumber.spring.CucumberContextConfiguration;

/**
 * Mise en place de la configuration nécessaire pour l'intégration Spring
 * @author romain
 * Source : https://github.com/cucumber/cucumber-jvm/tree/main/examples/spring-java-junit5
 */
@CucumberContextConfiguration
@SpringBootTest
@AutoConfigureMockMvc
public class CucumberContextIntegration {
	

}
