package com.example.demo.services.serviceImpl;

import com.example.demo.entity.Certificate;
import com.example.demo.repository.CertificateRepository;
import com.example.demo.services.CertificateService;
import org.springframework.stereotype.Service;

@Service
public class CertificateServiceImpl implements CertificateService {

    private final CertificateRepository certificateRepository;

    public CertificateServiceImpl(CertificateRepository certificateRepository) {
        this.certificateRepository = certificateRepository;
    }

    @Override
    public Certificate getCertificateById(Integer id){
        return certificateRepository.getCertificateById(id);
    }

    @Override
    public void addCertificate(Certificate c){

    }
}
