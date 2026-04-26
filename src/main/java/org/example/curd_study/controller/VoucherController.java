package org.example.curd_study.controller;

import jakarta.validation.Valid;
import org.example.curd_study.entity.Voucher;
import org.example.curd_study.service.VoucherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/voucher")
public class VoucherController {
    private final VoucherService voucherService;

    public VoucherController(VoucherService voucherService) {
        this.voucherService = voucherService;
    }

    @GetMapping("/health")
    public String health() {
        return "health";
    }

    @GetMapping("/{id}")
    public ResponseEntity<Voucher> getById(@PathVariable Long id) {
        Voucher voucher = voucherService.getById(id);
        if (voucher == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(voucher);
    }

    @PostMapping
    public ResponseEntity<Voucher> create(@Valid @RequestBody Voucher voucher) {
        Voucher savedVoucher = voucherService.create(voucher);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedVoucher);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        boolean deleted = voucherService.deleteById(id);
        if (!deleted) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<Voucher> update(@PathVariable Long id, @Valid @RequestBody Voucher voucher) {
        Voucher updatedVoucher=voucherService.update(id, voucher);
        if(updatedVoucher==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedVoucher);
    }
}
