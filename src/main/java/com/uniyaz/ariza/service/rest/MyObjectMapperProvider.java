package com.uniyaz.ariza.service.rest;

import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.sun.xml.ws.developer.SerializationFeature;
import org.codehaus.jackson.map.ObjectMapper;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

@Provider
public class MyObjectMapperProvider implements ContextResolver<ObjectMapper> {

    final ObjectMapper objectMapper;

    public MyObjectMapperProvider() {
        objectMapper = new ObjectMapper();
        /* Register JodaModule to handle Joda DateTime Objects. */
        objectMapper.registerModule(new JodaModule());
        /* We want dates to be treated as ISO8601 not timestamps. */
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    }

    @Override
    public ObjectMapper getContext(Class<?> arg0) {
        return objectMapper;
    }
}