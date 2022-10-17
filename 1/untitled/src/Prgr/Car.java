package Prgr;

public class Car extends Transport{
    private String brandCar;
    private String modelCar;

    public Car(long id, long buyer, String transport, String brand, String model, int prise, String vin, String brandCar, String modelCar) {
        super(id, buyer, transport, brand, model, prise, vin);
        this.brandCar = brandCar;
        this.modelCar = modelCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }
}
