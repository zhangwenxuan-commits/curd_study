package org.example.curd_study.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.curd_study.entity.Voucher;

@Mapper
public interface VoucherMapper {
    int insert(Voucher voucher);
    int deleteById(Long id);
    Voucher selectById(Long id);
    int update(Voucher voucher);
}
