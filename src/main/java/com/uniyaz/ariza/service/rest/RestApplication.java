package com.uniyaz.ariza.service.rest;

import com.sun.jersey.spi.container.servlet.ServletContainer;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/rest/*", name = "RestServlet",
        initParams =
                {
                        @WebInitParam(name = "com.sun.jersey.config.property.packages", value = "com.uniyaz.ariza.service.rest"),
                        @WebInitParam(name = "com.sun.jersey.api.json.POJOMappingFeature", value = "true"),
                })
public class RestApplication extends ServletContainer {
}