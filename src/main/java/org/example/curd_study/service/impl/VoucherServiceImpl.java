package org.example.curd_study.service.impl;

import org.example.curd_study.entity.Voucher;
import org.example.curd_study.mapper.VoucherMapper;
import org.example.curd_study.service.VoucherService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.time.LocalDateTime;

@Service
public class VoucherServiceImpl implements VoucherService {
    private final VoucherMapper voucherMapper;

    public VoucherServiceImpl(VoucherMapper voucherMapper) {
        this.voucherMapper = voucherMapper;
    }

    @Override
    public Voucher getById(Long id) {
        Assert.notNull(id, "id 不能为空");
        return voucherMapper.selectById(id);
    }

    @Override
    @Transactional
    public Voucher create(Voucher voucher) {
        Assert.notNull(voucher, "voucher 不能为空");
        LocalDateTime now = LocalDateTime.now();

        if (voucher.getCreateTime() == null) {
            voucher.setCreateTime(now);
        }
        voucher.setUpdateTime(now);

        int rows = voucherMapper.insert(voucher);
        Assert.state(rows == 1, "新增优惠券失败");
        return voucher;
    }

    @Override
    @Transactional
    public boolean deleteById(Long id) {
        Assert.notNull(id, "id 不能为空");
        return voucherMapper.deleteById(id) == 1;
    }
    @Override
    @Transactional
    public Voucher update(Long id, Voucher voucher) {
        Assert.notNull(id, "id 不能为空");
        Assert.notNull(voucher, "新增优惠券不能为空");
        LocalDateTime now = LocalDateTime.now();
        voucher.setId(id);
        voucher.setUpdateTime(now);
        int  rows = voucherMapper.update(voucher);
        if(rows!=1){return null;}
        return voucherMapper.selectById(id);

    }
}
