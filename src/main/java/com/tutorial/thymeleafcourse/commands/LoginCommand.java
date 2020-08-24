package com.tutorial.thymeleafcourse.commands;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

@Getter
@Setter
public class LoginCommand {

    @NotEmpty
    private String userName;

    @NotEmpty
    private String password;
}
