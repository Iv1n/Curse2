package Prgr;

public abstract class Transport{
    String vin,dateOfmMnufacture;
    int prise, id_owner,id;

    public Transport(String vin, String dateOfmMnufacture, int prise, int id_owner) {
        this.vin = vin;
        this.dateOfmMnufacture = dateOfmMnufacture;
        this.prise = prise;
        this.id_owner = id_owner;
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
