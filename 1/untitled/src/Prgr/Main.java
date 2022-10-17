package Prgr;
import DB.DataBaseHandlerBuyer;
import DB.ConstBuyer;
import DB.ConfigsBuyer;
/*
Автосалон.
Требуется создать приложение с помощью которого возможно будет:
-добавлять/изменять автомобили(легковые,грузовые)
-добавлять/продавать/изменять покупателей
-показывать информацию обо всех автомобилях в салоне
-при продаже авто создается база где хранится вся информация о ТО(авто удаляется из автосалона)
-показывать таблицу проданный авто - покупатель

 */
public class Main {
    public static void main(String[] args) {
        DataBaseHandlerBuyer dbBuyer = new DataBaseHandlerBuyer();
        Buyer buyer = new Buyer(Person.gender.male,"Bobus","Auir","2000.01.10",
                "+799999999999","2","2");

        dbBuyer.signUpUser(buyer);
    }
}