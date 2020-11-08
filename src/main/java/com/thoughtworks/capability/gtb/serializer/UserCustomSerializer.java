package com.thoughtworks.capability.gtb.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.thoughtworks.capability.gtb.vo.UserVo;

import java.io.IOException;

public class UserCustomSerializer extends StdSerializer<UserVo> {
    public UserCustomSerializer() {
        super(UserVo.class);
    }

    @Override
    public void serialize(UserVo value, JsonGenerator gen, SerializerProvider provider) throws IOException {

    }
}
