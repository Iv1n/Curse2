package Prgr;

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

    public Car(long id, long buyer, String transport, String brand, String model, String vin, String dateOfmMnufacture, int prise, Car.modelCar modelCar, Car.brandCar brandCar) {
        super(id, buyer, transport, brand, model, vin, dateOfmMnufacture, prise);
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

    public Car(long id, long buyer, String transport, String brand, String model, String vin, String dateOfmMnufacture, int prise) {
        super(id, buyer, transport, brand, model, vin, dateOfmMnufacture, prise);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
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
}
