package org.example.curd_study.service;

import org.example.curd_study.entity.Voucher;

public interface VoucherService {
    Voucher getById(Long id);
    Voucher create(Voucher voucher);
    boolean deleteById(Long id);
}
