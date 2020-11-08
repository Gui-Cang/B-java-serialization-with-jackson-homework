package com.thoughtworks.capability.gtb.serializer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.thoughtworks.capability.gtb.vo.PersonVo;

import java.io.IOException;

public class PersonCustomSerializer extends StdSerializer<PersonVo>{
    public PersonCustomSerializer() {
        super(PersonVo.class);
    }

    @Override
    public void serialize(PersonVo value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        if (value.getId() == "1") {
            gen.writeNumber(0);
        }
    }
}
