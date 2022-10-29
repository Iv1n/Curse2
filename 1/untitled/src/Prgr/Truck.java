package Prgr;

public class Truck extends Transport {
    enum brandTruck {
        Volvo,
        Scania
    }

    enum modelTruck {
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

    public Truck(String vin, String dateOfmMnufacture, int prise, int id_owner, int id, Truck.brandTruck brandTruck, Truck.modelTruck modelTruck) {
        super(vin, dateOfmMnufacture, prise, id_owner, id);
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
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }
}

