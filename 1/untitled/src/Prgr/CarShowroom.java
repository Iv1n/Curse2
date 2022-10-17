package Prgr;

//автосалон
public class CarShowroom {
    private long id;
    private long buyer;
    private String transport;

    public CarShowroom(long id, long buyer, String transport) {
        this.id = id;
        this.buyer = buyer;
        this.transport = transport;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBuyer() {
        return buyer;
    }

    public void setBuyer(long buyer) {
        this.buyer = buyer;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }
}
