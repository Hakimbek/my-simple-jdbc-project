package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PC {
    Integer code;
    String model;
    Integer speed;
    Integer ram;
    Integer hd;
    String cd;
    Double price;
}
