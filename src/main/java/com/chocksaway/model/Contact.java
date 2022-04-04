package com.chocksaway.model;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    private String name;
    private String address;
    private int age;
    private String hobby;
}
