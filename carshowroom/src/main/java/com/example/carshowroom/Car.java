package com.example.carshowroom;

public class Car extends Transport{
/*
    public Car(String vin, String dateOfmManufacture, String typeTC, String brandTC, String modelTC, int prise, int id_owner, int id) {
        super(vin, dateOfmManufacture, typeTC, brandTC, modelTC, prise, id_owner, id);
    }

 */
    public Car(int id_owner, String typeTC, String brandTC, String modelTC, String vin, String dateOfManufacture, int prise){
        super(id_owner,typeTC,brandTC,modelTC,vin,dateOfManufacture,prise);
    }


    @Override
    public String getVin() {
        return super.getVin();
    }

    @Override
    public void setVin(String vin) {
        super.setVin(vin);
    }

    @Override
    public String getDateOfManufacture() {
        return super.getDateOfManufacture();
    }

    @Override
    public void setDateOfManufacture(String dateOfManufacture) {
        super.setDateOfManufacture(dateOfManufacture);
    }

    @Override
    public String getTypeTC() {
        return super.getTypeTC();
    }

    @Override
    public void setTypeTC(String typeTC) {
        super.setTypeTC(typeTC);
    }

    @Override
    public String getBrandTC() {
        return super.getBrandTC();
    }

    @Override
    public void setBrandTC(String brandTC) {
        super.setBrandTC(brandTC);
    }

    @Override
    public String getModelTC() {
        return super.getModelTC();
    }

    @Override
    public void setModelTC(String modelTC) {
        super.setModelTC(modelTC);
    }

    @Override
    public int getPrise() {
        return super.getPrise();
    }

    @Override
    public void setPrise(int prise) {
        super.setPrise(prise);
    }

    @Override
    public int getId_owner() {
        return super.getId_owner();
    }

    @Override
    public void setId_owner(int id_owner) {
        super.setId_owner(id_owner);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }
}
