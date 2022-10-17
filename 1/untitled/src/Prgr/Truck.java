package Prgr;

public class Truck extends Transport {
    private String brandTruck;
    private String modelTruck;

    public Truck(long id, long buyer, String transport, String brand, String model, int prise, String vin, String brandTruck, String modelTruck) {
        super(id, buyer, transport, brand, model, prise, vin);
        this.brandTruck = brandTruck;
        this.modelTruck = modelTruck;
    }

    public String getBrandTruck() {
        return brandTruck;
    }

    public void setBrandTruck(String brandTruck) {
        this.brandTruck = brandTruck;
    }

    public String getModelTruck() {
        return modelTruck;
    }

    public void setModelTruck(String modelTruck) {
        this.modelTruck = modelTruck;
    }
}
