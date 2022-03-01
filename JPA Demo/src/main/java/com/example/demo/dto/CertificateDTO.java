package com.example.demo.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CertificateDTO {
    private int certificatedID;

    private String certificateName;

    private String certificateRank;

    private Date certificatedDate;

    private int employee_id;

    public CertificateDTO(int certificatedID, String certificateName, String certificateRank, Date certificatedDate, int employee_id) {
        this.certificatedID = certificatedID;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certificatedDate = certificatedDate;
        this.employee_id = employee_id;
    }
}
