package org.example.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Printer {
    Integer code;
    String model;
    String color;
    String type;
    Double price;
}
