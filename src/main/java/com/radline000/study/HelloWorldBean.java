package com.radline000.study;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok => Get, Setter
// AllArgsConstructor => 생성자 생성
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorldBean {
  private String message;

}
