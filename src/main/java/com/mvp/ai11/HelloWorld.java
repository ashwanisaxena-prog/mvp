package com.mvp.ai11;
import org.apache.camel.builder.RouteBuilder;
import org.apache.commons.lang3.StringUtils;

public class HelloWorld extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:java?period=1s")
            .setBody(constant("Hello Camel K from Java!" + StringUtils.lowerCase("Welcome")))
            .log("${body}");
    }
}