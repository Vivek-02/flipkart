package com.demo.flipkart.dao;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonForm {


    @NotNull
    @Size(min=2, max=10)
    private String name;

    @NotNull
    @Min(18)
    private Integer age;
}
