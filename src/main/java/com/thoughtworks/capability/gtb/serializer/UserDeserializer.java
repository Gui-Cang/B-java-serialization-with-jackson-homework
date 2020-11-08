package com.thoughtworks.capability.gtb.serializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.thoughtworks.capability.gtb.vo.UserVo;

import java.io.IOException;

public class UserDeserializer extends StdDeserializer<JsonParser> {

    protected UserDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public JsonParser deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        return null;
    }

}
