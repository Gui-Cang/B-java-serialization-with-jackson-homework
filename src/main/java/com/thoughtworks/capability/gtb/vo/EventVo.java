package com.thoughtworks.capability.gtb.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.thoughtworks.capability.gtb.serializer.UserCustomSerializer;
import com.thoughtworks.capability.gtb.serializer.UserDeserializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventVo {

  private String id;
  private String name;
  private EventType type;
  @JsonFormat(with = WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS)
  private Date time;
  @JsonUnwrapped
//  @JsonSerialize( using = UserCustomSerializer.class)
 // @JsonDeserialize ( using = UserDeserializer.class)
  private UserVo user;
}
