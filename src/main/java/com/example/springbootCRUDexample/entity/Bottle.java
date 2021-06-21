package com.example.springbootCRUDexample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Bottle")
public class Bottle extends Product {
    private String liquidtype;

    public String getLiquidtype() {
        return liquidtype;
    }

    public void setLiquidtype(String liquidtype) {
        this.liquidtype = liquidtype;
    }



}
