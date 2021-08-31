package com.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;

@SuppressWarnings("AlibabaClassMustHaveAuthor")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Person {
    @NotBlank(message = "序号不能为空！")
    private int id ;
    @NotBlank(message = "人名不能为空！")
    private String name;
    @NotBlank(message = "年龄不能为空！")
    private int  age;
}