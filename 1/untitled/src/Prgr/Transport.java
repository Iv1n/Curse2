package Prgr;

public abstract class Transport extends CarShowroom {
    String brand,model,vin,dateOfmMnufacture;
    int prise;

    public Transport(long id, long buyer, String transport, String brand, String model,
                     String vin, String dateOfmMnufacture, int prise) {
        super(id, buyer, transport);
        this.brand = brand;
        this.model = model;
        this.vin = vin;
        this.dateOfmMnufacture = dateOfmMnufacture;
        this.prise = prise;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getDateOfmMnufacture() {
        return dateOfmMnufacture;
    }

    public void setDateOfmMnufacture(String dateOfmMnufacture) {
        this.dateOfmMnufacture = dateOfmMnufacture;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }
}
