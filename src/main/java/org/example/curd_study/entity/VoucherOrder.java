package org.example.curd_study.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class VoucherOrder {
    private Long id;
    private Long userId;
    private Long voucherId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private int status;
}
