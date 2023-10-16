package com.protecomisionTic.sprint3.services;

import com.protecomisionTic.sprint3.entity.Enterprises;
import com.protecomisionTic.sprint3.repository.EnterPriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class EnterpriseServices {

    @Autowired
    public EnterPriseRepository enterPriseRepository;

    public List<Enterprises> getEnterprises(){
        return enterPriseRepository.findAll();
    }

    public Enterprises findEnterpriceById (Integer id) {
        return enterPriseRepository.findById(id).orElse(null);
    }

    public Enterprises saveEnterprise(Enterprises enterprise){
        return enterPriseRepository.save(enterprise);
    }

    public List<Enterprises> saveEnterprises(List<Enterprises> enterprises){
        return  enterPriseRepository.saveAll(enterprises);
    }

    public Enterprises updateEnterprise(Enterprises enterprise) {
        Enterprises existingEnterprise = enterPriseRepository.findById(enterprise.getId()).orElse(null);
        existingEnterprise.setCompanyName(enterprise.getCompanyName());
        existingEnterprise.setNit(enterprise.getNit());
        existingEnterprise.setCompanyAdress(enterprise.getCompanyAdress());
        existingEnterprise.setPhoneNumber(enterprise.getPhoneNumber());
        existingEnterprise.setEmployeeNumbers(enterprise.getEmployeeNumbers());
        return enterPriseRepository.save(existingEnterprise);
    }

    public String deleteEnterprise (Integer id){
        enterPriseRepository.deleteById(id);
        return "Has elminado la Empresa con ID: " + id;
    }
}
