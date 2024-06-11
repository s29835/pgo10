import java.util.*;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      List<Car> cars = new ArrayList<>();
      cars.add(new Car("Volvo xc60", 2000));
      cars.add(new Car("Peugeot 3008", 2001));
      cars.add(new Car("BMW x5", 2020));
      cars.add(new Car("Ford Kuga", 2023));
      cars.add(new Car("BMW x7", 2024));
      cars.add(new Car("Audi RS7", 2023));
      cars.add(new Car("audi A7", 2020));
      cars.add(new Car("Toyota CH-R", 2022));
      cars.add(new Car("Toyota Yaris", 2015));
      cars.add(new Car("Honda Civic", 2014));


      Collections.sort(cars);

      for (Car car : cars) {
        System.out.println(car);
      }







    }
}