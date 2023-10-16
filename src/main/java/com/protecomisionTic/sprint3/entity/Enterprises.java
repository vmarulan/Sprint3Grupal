package com.protecomisionTic.sprint3.entity;

import jakarta.persistence.*;

@Entity
@Table(name="enterprises")
public class Enterprises {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String companyName;
    private int nit;
    private String phoneNumber;
    private String companyAdress;
    private int employeeNumbers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyAdress() {
        return companyAdress;
    }

    public void setCompanyAdress(String companyAdress) {
        this.companyAdress = companyAdress;
    }

    public int getEmployeeNumbers() {
        return employeeNumbers;
    }

    public void setEmployeeNumbers(int employeeNumbers) {
        this.employeeNumbers = employeeNumbers;
    }
}
