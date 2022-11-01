package Prgr;
/*
        Требуется создать приложение с помощью которого возможно будет:
        -добавлять/изменять автомобили(легковые,грузовые)
        -добавлять/продавать/изменять покупателей
        -показывать информацию обо всех автомобилях в салоне
        -при продаже авто создается база где хранится вся информация о ТО(авто удаляется из автосалона)
        -показывать таблицу проданный авто - покупатель
//автосалон
*/

public class CarShowroom {
    private int id;
    private int buyer;
    private String transport;

    public CarShowroom(int id, int buyer, String transport) {
        this.id = id;
        this.buyer = buyer;
        this.transport = transport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBuyer() {
        return buyer;
    }

    public void setBuyer(int buyer) {
        this.buyer = buyer;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }
}
