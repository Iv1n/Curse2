public abstract class Transport extends CarShowroom {
    String brand; //описываем бренд
    String model; //описыввае модель
    int prise;
    String vin;

    public Transport(long id, long buyer, String transport, String brand, String model, int prise, String vin) {
        super(id, buyer, transport, vin);
        this.brand = brand;
        this.model = model;
        this.prise = prise;
        this.vin = vin;
    }

}
