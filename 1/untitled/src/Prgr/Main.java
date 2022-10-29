package Prgr;
import DB.DataBaseHandlerPerson;
import DB.DataBaseHandlerTransport;

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
        DataBaseHandlerPerson dbBuyer = new DataBaseHandlerPerson();
     Buyer buyer = new Buyer("oleg","doo","ffff","2000.01.01","+5555555","adsasd",18);
     dbBuyer.signUpUserB(buyer);

     DataBaseHandlerPerson dbEmployee = new DataBaseHandlerPerson();
     Employee employee = new Employee("Dmitry","Olegin","Bobov","2008.01.01","+56464645","pop",16);
     dbEmployee.signUpUserE(employee);


     dbBuyer.ConclusionOfBuyer();
     System.out.println("");
     dbEmployee.ConclusionOfEmployee();

    /* DataBaseHandlerTransport dbCar = new DataBaseHandlerTransport();
     Car car= new Car("123456","2000.01.01",450000,5,3, Car.modelCar.e30, Car.brandCar.BMW);
        dbCar.addCar(car);

     */
    }
}