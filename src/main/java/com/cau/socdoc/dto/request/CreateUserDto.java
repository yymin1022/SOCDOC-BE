package com.cau.socdoc.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreateUserDto {

    private String userId;
    private String userName;
    private String userEmail;
    private String address1; // 서울시
    private String address2; // 동작구
}
