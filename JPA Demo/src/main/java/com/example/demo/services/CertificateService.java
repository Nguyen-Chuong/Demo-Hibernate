package com.example.demo.services;

import com.example.demo.entity.Certificate;

public interface CertificateService {

    Certificate getCertificateById(Integer id);

    void addCertificate(Certificate c);
}
