package com.example.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Collections {

    private List<String> list;
    private Set<String> set;
    private Map<String, Long> map;
    private Properties properties;

}
