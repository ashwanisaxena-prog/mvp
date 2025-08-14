package com.mvp.ai11;
import org.apache.camel.builder.RouteBuilder;

public class HelloWorld extends RouteBuilder {
    @Override
    public void configure() throws Exception {
    	com.mvp.ai11.Example obj = new com.mvp.ai11.Example();
        from("timer:java?period=1s")
            .setBody(constant("Hello Camel K from Java!" + obj.getName()))
            .log("${body}");
    }
}