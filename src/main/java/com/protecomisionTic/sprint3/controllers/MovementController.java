package com.protecomisionTic.sprint3.controllers;

import com.protecomisionTic.sprint3.entity.Movements;
import com.protecomisionTic.sprint3.services.MovementServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovementController {

    @Autowired
    private MovementServices movementServices;

    @PostMapping("/movement")
    private Movements saveMovement(@RequestBody Movements movement){
        return movementServices.saveMovement(movement);
    }

    @PostMapping("/movements")
    private List<Movements> saveMovements (List<Movements> movements){
        return movementServices.saveMovements(movements);
    }

    @GetMapping("/movements")
    private List<Movements> findMovements(){
        return movementServices.getMovements();
    }

    @GetMapping("/movement/{id}")
    private Movements findMovementsById(@PathVariable Integer id){
        return movementServices.findMovementsById(id);
    }
    @PutMapping("/editMovement")
    private Movements editMovements(@RequestBody Movements movement){
        return movementServices.editMovements(movement);
    }

    @DeleteMapping("/deleteMovement/{id}")
    private String deleteMovement(@PathVariable Integer id){
        return movementServices.deleteMovement(id);
    }


}
