package com.protecomisionTic.sprint3.entity;

import jakarta.persistence.*;

@Entity
@Table(name="movements")
public class Movements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private double mountMoney;

    private String reason;

    private String byUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getMountMoney() {
        return mountMoney;
    }

    public void setMountMoney(double mountMoney) {
        this.mountMoney = mountMoney;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getByUser() {
        return byUser;
    }

    public void setByUser(String byUser) {
        this.byUser = byUser;
    }
}
