package org.example.curd_study;

import org.example.curd_study.entity.Voucher;
import org.example.curd_study.mapper.VoucherMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoucherMapperTest {
    @Autowired
    private VoucherMapper voucherMapper;
    @Test
    void testSelectById() {
        Voucher voucher = voucherMapper.selectById(1L);
        System.out.println(voucher);
    }
    @Test
    void testInsert() {
        Voucher voucher = new Voucher();
        voucher.setCouponName("test-coupon");
        voucher.setStock(10L);
        voucher.setCreateTime(LocalDateTime.now());
        voucher.setUpdateTime(LocalDateTime.now());
        voucher.setStartTime(LocalDateTime.now());
        voucher.setEndTime(LocalDateTime.now().plusDays(7));

        int rows = voucherMapper.insert(voucher);
        assertEquals(1, rows);
    }
}
