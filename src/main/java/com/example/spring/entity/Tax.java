package com.example.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tax {

    private Double income;
    private Double pension;
    private Double total;
    private Boolean isNormal;

}
