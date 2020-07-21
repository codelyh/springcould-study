package com.zq.lyh.supermaker.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private Integer userId;
    private Integer age;
    private String name;
}
