package Prgr;

public class Truck extends Transport {
    enum brandTruck{
        Volvo,
        Scania
    }
    enum modelTruck{
        FH16,
        FH,
        FM,
        FMX,
        G,
        Interlink,
        OmniLink,
    }
    private brandTruck brandTruck;
    private modelTruck modelTruck;

    public Truck(long id, long buyer, String transport, String brand, String model, String vin, String dateOfmMnufacture, int prise, Truck.brandTruck brandTruck, Truck.modelTruck modelTruck) {
        super(id, buyer, transport, brand, model, vin, dateOfmMnufacture, prise);
        this.brandTruck = brandTruck;
        this.modelTruck = modelTruck;
    }

    public Truck.brandTruck getBrandTruck() {
        return brandTruck;
    }

    public void setBrandTruck(Truck.brandTruck brandTruck) {
        this.brandTruck = brandTruck;
    }

    public Truck.modelTruck getModelTruck() {
        return modelTruck;
    }

    public void setModelTruck(Truck.modelTruck modelTruck) {
        this.modelTruck = modelTruck;
    }
}

