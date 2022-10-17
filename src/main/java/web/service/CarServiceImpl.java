package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDAO carDao;

    public List<Car> getCarsList(Integer count) {
        return carDao.getCarsList(count);
    }

    public int getCarsCount() {
        return carDao.getCarsCount();
    }
}
