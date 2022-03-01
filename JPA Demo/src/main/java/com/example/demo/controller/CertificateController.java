package com.example.demo.controller;

import com.example.demo.entity.Certificate;
import com.example.demo.services.CertificateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/certificate")
public class CertificateController {

    final CertificateService certificateService;

    public CertificateController(CertificateService certificateService) {
        this.certificateService = certificateService;
    }

    @GetMapping("/getCertificateById/{id}")
    public Certificate getCertificateById(@PathVariable Integer id){
        return certificateService.getCertificateById(id);
    }
}
