//Станция ТО
public class Maintenance extends CarShowroom {
    private int id;
    private int prise;
    private int mileage;
    private String date;

    public Maintenance(int id, int prise, int mileage, String date) {
        super();
        this.id = id;
        this.prise = prise;
        this.mileage = mileage;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
