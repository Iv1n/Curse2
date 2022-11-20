package com.Prgr;

import javafx.scene.text.Text;

public class Transport{

    String vin,dateOfmManufacture, typeTC, brandTC, modelTC;
    int prise, id_owner,id;

    public Transport(String vin, String dateOfmManufacture, String typeTC, String brandTC, String modelTC, int prise, int id_owner, int id) {
        this.vin = vin;
        this.dateOfmManufacture = dateOfmManufacture;
        this.typeTC = typeTC;
        this.brandTC = brandTC;
        this.modelTC = modelTC;
        this.prise = prise;
        this.id_owner = id_owner;
        this.id = id;
    }

    public Transport(String typeTC, String brandTC, String modelTC, String dateOfmManufacture,int prise) {
        this.dateOfmManufacture = dateOfmManufacture;
        this.typeTC = typeTC;
        this.brandTC = brandTC;
        this.modelTC = modelTC;
        this.prise = prise;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getDateOfmManufacture(String dateOfManufacture) {
        return dateOfmManufacture;
    }

    public void setDateOfmManufacture(String dateOfmManufacture) {
        this.dateOfmManufacture = dateOfmManufacture;
    }

    public String getTypeTC() {
        return typeTC;
    }

    public void setTypeTC(String typeTC) {
        this.typeTC = typeTC;
    }

    public String getBrandTC(String typeTC) {
        return brandTC;
    }

    public void setBrandTC(String brandTC) {
        this.brandTC = brandTC;
    }

    public String getModelTC(String modelTC) {
        return this.modelTC;
    }

    public void setModelTC(String modelTC) {
        this.modelTC = modelTC;
    }

    public int getPrise(Integer prise) {
        return this.prise;
    }

    public void setPrise(Integer prise) {
        this.prise = prise;
    }

    public int getId_owner() {
        return id_owner;
    }

    public void setId_owner(int id_owner) {
        this.id_owner = id_owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

