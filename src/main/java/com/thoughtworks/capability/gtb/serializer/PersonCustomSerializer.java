package com.thoughtworks.capability.gtb.serializer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

/**
 * 自定义Person序列化
 * @author DK
 */
public class PersonCustomSerializer extends StdSerializer<Integer>{
    public PersonCustomSerializer() {
        super(Integer.class);
    }

    @Override
    public void serialize(Integer value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        if (value == null) {
            gen.writeNumber(0);
        }
    }
}
