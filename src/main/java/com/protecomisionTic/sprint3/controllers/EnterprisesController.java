package com.protecomisionTic.sprint3.controllers;

import com.protecomisionTic.sprint3.entity.Enterprises;
import com.protecomisionTic.sprint3.services.EnterpriseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EnterprisesController {

    @Autowired
    private EnterpriseServices enterpriseServices;

    @PostMapping("/saveEnterprise")
    private Enterprises saveEnterprise(@RequestBody Enterprises enterprise){
        return enterpriseServices.saveEnterprise(enterprise);
    }

    @PostMapping("/saveEnterprises")
    private List<Enterprises> saveEnterprises (@RequestBody List<Enterprises> enterprises){
        return enterpriseServices.saveEnterprises(enterprises);
    }

    @GetMapping("/enterprises")
    private List<Enterprises> FindEnterprises(){
        return enterpriseServices.getEnterprises();
    }

    @GetMapping("/enterprise/{id}")
    private Enterprises findEnterpriseById (@PathVariable Integer id) {
        return enterpriseServices.findEnterpriceById(id);
    }

    @PutMapping("/editEnterprise")
    private Enterprises editEnterprise(@RequestBody Enterprises enterprise){
        return enterpriseServices.updateEnterprise(enterprise);
    }

    @DeleteMapping("/deleteEnterprise/{id}")
    public String deleteEnterprise (@PathVariable Integer id) {
        return enterpriseServices.deleteEnterprise(id);
    }


}
