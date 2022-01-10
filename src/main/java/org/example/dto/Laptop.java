package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Laptop {
    private Integer code;
    private String model;
    private Integer speed;
    private Integer ram;
    private Integer hd;
    private Double price;
    private Integer screen;
}
