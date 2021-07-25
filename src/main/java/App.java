import dao.CarDao;
import entities.Car;
import entities.GearTypes;

import java.util.List;

public class App {
    public static void main(String[] args) {
        CarDao carDao = new CarDao();
        Car car = new Car("BMW", "35000", "01/02/2020",
                "20/12/2020", GearTypes.AUTOMATIC, 60);
        Car car2 = new Car("Mercedes", "30000", "12/12/2009",
                "10/06/2015", GearTypes.SEMIAUTOMATIC, 70);
        carDao.saveCar(car);
        carDao.saveCar(car2);
        carDao.insertCar();

        Car car1 = new Car("KIA", "22000", "05/05/2015",
                "18/08/2020", GearTypes.MANUAL, 50);
        carDao.updateCarById(car1, 1);

        System.out.println(carDao.getCarById(2));

        System.out.println(carDao.getCarByTitle("BMW"));

        System.out.println(carDao.getCarByPriceRange("20000", "31000"));

        List<Car> cars = carDao.getCars();
        cars.forEach(s -> System.out.println(s.getTitle()));

        carDao.deleteCarById(2);

        carDao.deleteCars();
    }
}
