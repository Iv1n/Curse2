package com.example.carshowroom;

public class Car extends Transport{
    public Car(String vin, String dateOfmManufacture, String typeTC, String brandTC, String modelTC, int prise, int id_owner, int id) {
        super(vin, dateOfmManufacture, typeTC, brandTC, modelTC, prise, id_owner, id);
    }
    public Car(int id_owner, String typeTC, String brandTC, String modelTC, String vin, String dateOfManufacture, int prise){
        super(id_owner,typeTC,brandTC,modelTC,vin,dateOfManufacture,prise);
    }


}
