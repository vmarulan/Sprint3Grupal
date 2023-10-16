package com.protecomisionTic.sprint3.services;

import com.protecomisionTic.sprint3.entity.Movements;
import com.protecomisionTic.sprint3.repository.MovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovementServices {

    @Autowired
    private MovementRepository movementRepository;

    public List<Movements>  getMovements() {
        return movementRepository.findAll();
    }

    public Movements findMovementsById(Integer id){
        return movementRepository.findById(id).orElse(null);
    }

    public Movements saveMovement(Movements movement){
        return movementRepository.save(movement);
    }

    public List<Movements> saveMovements(List<Movements> movements){
        return movementRepository.saveAll(movements);
    }

    public Movements editMovements(Movements movements){
        Movements existMovement = movementRepository.findById(movements.getId()).orElse(null);
        existMovement.setMountMoney(movements.getMountMoney());
        existMovement.setReason(movements.getReason());
        existMovement.setByUser(movements.getByUser());
        return movementRepository.save(existMovement);
    }

    public String deleteMovement (Integer id) {
        movementRepository.deleteById(id);
        return "Has eliminado el Movimiento con ID: " + id;
    }

}
