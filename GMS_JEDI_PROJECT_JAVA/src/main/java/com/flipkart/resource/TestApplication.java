package com.flipkart.resource;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class TestApplication extends Application<TestConfiguration> {

    public static void main(final String[] args) throws Exception {
        new TestApplication().run(args);
    }

    @Override
    public void run(TestConfiguration helloConfiguration, Environment environment) throws Exception {
        environment.jersey().register(testing_resource.class);
    }

}
