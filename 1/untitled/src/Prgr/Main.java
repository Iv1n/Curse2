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
     Buyer buyer = new Buyer("Dmitruy","Nikrasov","Ivanovich","2000.10.30","+79155460888", Person.gender.MALE);
     dbBuyer.signUpUserB(buyer);

     DataBaseHandlerPerson dbEmployee = new DataBaseHandlerPerson();
     Employee employee = new Employee("Anastsia","Ivanova","Alexseivna","1997.01.01","+79261278764",Person.gender.FEMALE);
     dbEmployee.signUpUserE(employee);

     dbBuyer.ConclusionOfBuyer();
     System.out.println("");
     dbEmployee.ConclusionOfEmployee();

    DataBaseHandlerTransport dbCar = new DataBaseHandlerTransport();
     Car car = new Car("WBAPN7C52AA778342","1996.10.10",4500,1, Car.modelCar.e34, Car.brandCar.BMW);
     dbCar.addCar(car);

     DataBaseHandlerTransport dbTruck = new DataBaseHandlerTransport();
     Truck truck = new Truck("SKN42454434*12","2007.09.05",25000,2, Truck.brandTruck.Volvo, Truck.modelTruck.FH16);
     dbTruck.addTruck(truck);

     System.out.println("");
     dbTruck.ConclusionOfTruck();

    }

}