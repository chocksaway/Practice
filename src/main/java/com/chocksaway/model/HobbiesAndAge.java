package com.chocksaway.model;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HobbiesAndAge {
    private String hobbies;
    private int age;
}
