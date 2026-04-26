package org.example.curd_study.entity;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Voucher {
    private Long id;
    private String couponName;
    private Long stock;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
