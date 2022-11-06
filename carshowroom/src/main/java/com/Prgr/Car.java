package com.Prgr;

public class Car extends Transport{
    enum modelCar{
    e30, e34, e60, e90, g30,
    kalina, vesta, granta,
    civic, integra, aristo,
    chaser, land_cruiser,
    octavia, superb,
    passat, polo, sirocco
}
enum brandCar{
    BMW,
    Lada,
    Honda,
    Toyota,
    Sqoda,
    Volkswagen
}
private modelCar modelCar;
private brandCar brandCar;

    public Car(String vin, String dateOfmMnufacture, int prise, int id_owner, Car.modelCar modelCar, Car.brandCar brandCar) {
        super(vin, dateOfmMnufacture, prise, id_owner);
        this.modelCar = modelCar;
        this.brandCar = brandCar;
    }

    public Car.modelCar getModelCar() {
        return modelCar;
    }

    public void setModelCar(Car.modelCar modelCar) {
        this.modelCar = modelCar;
    }

    public Car.brandCar getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(Car.brandCar brandCar) {
        this.brandCar = brandCar;
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
    public String getDateOfmMnufacture() {
        return super.getDateOfmMnufacture();
    }

    @Override
    public void setDateOfmMnufacture(String dateOfmMnufacture) {
        super.setDateOfmMnufacture(dateOfmMnufacture);
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
    public void setId(int id) {
        super.setId(id);
    }
}
