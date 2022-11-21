package com.example.carshowroom;


public class Transport{

   private String vin,dateOfManufacture, typeTC, brandTC, modelTC;
   private int prise, id_owner,id;

    public Transport(String vin, String dateOfManufacture, String typeTC, String brandTC, String modelTC, int prise, int id_owner, int id) {
        this.vin = vin;
        this.dateOfManufacture = dateOfManufacture;
        this.typeTC = typeTC;
        this.brandTC = brandTC;
        this.modelTC = modelTC;
        this.prise = prise;
        this.id_owner = id_owner;
        this.id = id;
    }

    public Transport(int id, String typeTC, String brandTC, String modelTC, String vin, String dateOfManufacture, int prise) {
        this.vin = vin;
        this.dateOfManufacture = dateOfManufacture;
        this.typeTC = typeTC;
        this.brandTC = brandTC;
        this.modelTC = modelTC;
        this.prise = prise;
        this.id = id;
    }


    public Transport(int id, String brandTC, String modelTC, String vin, String dateOfManufacture, int prise) {
        this.vin = vin;
        this.dateOfManufacture = dateOfManufacture;
        this.brandTC = brandTC;
        this.modelTC = modelTC;
        this.prise = prise;
        this.id = id;
    }

    public Transport(String typeTC, String brandTC, String modelTC, String dateOfManufacture, int prise) {
        this.dateOfManufacture = dateOfManufacture;
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

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getTypeTC() {
        return typeTC;
    }

    public void setTypeTC(String typeTC) {
        this.typeTC = typeTC;
    }

    public String getBrandTC() {
        return brandTC;
    }

    public void setBrandTC(String brandTC) {
        this.brandTC = brandTC;
    }

    public String getModelTC() {
        return modelTC;
    }

    public void setModelTC(String modelTC) {
        this.modelTC = modelTC;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
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

