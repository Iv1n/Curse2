//автосалон
public class CarShowroom {
    private long id;
    private long Buyer;
    private String Transport;

    public CarShowroom(long id, long buyer, String transport) {
        this.id = id;
        Buyer = buyer;
        Transport = transport;
    }

    public CarShowroom(long id, long buyer, String transport, String vin) {
    }

    public int getId() {
        return (int) id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBuyer() {
        return Buyer;
    }

    public void setBuyer(long buyer) {
        Buyer = buyer;
    }

    public String getTransport() {
        return Transport;
    }

    public void setTransport(String transport) {
        Transport = transport;
    }
}
