package com.example.its.web.user;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
public class UserForm {
  @NotBlank
  @com.example.its.web.validation.UniqueUsername
  private String username;

  @NotBlank
  @Size(min = 8, max = 128)
  private String password;
}
