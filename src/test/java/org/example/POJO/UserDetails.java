package org.example.POJO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserDetails {
    private String email;
    private String password;
    private String repeatPassword;
    private String securityQue;
    private String securityAns;
}
