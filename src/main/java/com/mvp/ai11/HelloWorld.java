package com.mvp.ai11;
import org.apache.camel.builder.RouteBuilder;
import org.apache.commons.lang3.StringUtils;

import com.library.ai11lib.Example;

public class HelloWorld extends RouteBuilder {
    @Override
    public void configure() throws Exception {
    	Example obj = new Example();
        from("timer:java?period=1s")
            .setBody(constant("Hello Camel K from Java!" +obj.getHelloWorld() +StringUtils.lowerCase("Welcome")))
            .log("${body}");
    }
}