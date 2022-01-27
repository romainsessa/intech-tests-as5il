	package com.intech.zooapi.ait;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

/**
 * Runner pour le lancement des tests
 * @author romain
 * Source : https://github.com/cucumber/cucumber-jvm/tree/main/examples/spring-java-junit5
 */
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("com/intech/zooapi")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com/intech/zooapi")
public class RunCucumberTest {

}
