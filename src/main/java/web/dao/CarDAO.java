package web.dao;
import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private static int CARS_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Volvo", "XC90", "A579AP"));
        cars.add(new Car("Renault", "Clio", "E635EH"));
        cars.add(new Car("KIA", "Rio", "B472AK"));
        cars.add(new Car("Toyota", "RAV4", "C324BA"));
        cars.add(new Car("Mitsubishi", "Eclipse", "O782HP"));
        CARS_COUNT = cars.size();
    }

    public List<Car> getCarsList() {
        return cars;
    }

    public int getCarsCount() {
        return CARS_COUNT;
    }
}
