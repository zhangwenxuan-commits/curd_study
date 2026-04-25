package org.example.curd_study.entity;

import lombok.Data;
import java.time.LocalDateTime;
@Data
public class User {
private Long id;
private String nickname;
private String password;
private String phone;
private LocalDateTime createTime;
private LocalDateTime updateTime;
}
