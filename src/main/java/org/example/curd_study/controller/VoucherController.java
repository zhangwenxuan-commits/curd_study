package org.example.curd_study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/voucher")
public class VoucherController {
@GetMapping("/health")
    public String health() {
    return "health";
}
}
