package Prgr;

//Станция ТО
public class Maintenance extends CarShowroom {
private int id_trunsport,id_owner,prise,mileage,id_employee;
private String dateOfFormation,nameWorcks;


    public Maintenance(int id, int buyer, String transport, int id_trunsport, int id_owner,
                       String dateOfFormation, int id_employee, int prise, String nameWorcks, int mileage) {
        super(id, buyer, transport);
        this.id_trunsport = id_trunsport;
        this.id_owner = id_owner;
        this.dateOfFormation = dateOfFormation;
        this.id_employee = id_employee;
        this.prise = prise;
        this.nameWorcks = nameWorcks;
        this.mileage = mileage;
    }

    public int getId_trunsport() {
        return id_trunsport;
    }

    public void setId_trunsport(int id_trunsport) {
        this.id_trunsport = id_trunsport;
    }

    public int getId_owner() {
        return id_owner;
    }

    public void setId_owner(int id_owner) {
        this.id_owner = id_owner;
    }

    public String getDateOfFormation() {
        return dateOfFormation;
    }

    public void setDateOfFormation(String dateOfFormation) {
        this.dateOfFormation = dateOfFormation;
    }

    public int getId_employee() {
        return id_employee;
    }

    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public String getNameWorcks() {
        return nameWorcks;
    }

    public void setNameWorcks(String nameWorcks) {
        this.nameWorcks = nameWorcks;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Maintenance(int id, int buyer, String transport) {
        super(id, buyer, transport);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public int getBuyer() {
        return super.getBuyer();
    }

    @Override
    public void setBuyer(int buyer) {
        super.setBuyer(buyer);
    }

    @Override
    public String getTransport() {
        return super.getTransport();
    }

    @Override
    public void setTransport(String transport) {
        super.setTransport(transport);
    }
}
