package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
        carList.add(new Car("Toyota", "Camry", 2020));
        carList.add(new Car("Honda", "Accord", 2019));
        carList.add(new Car("BMW", "X5", 2021));
        carList.add(new Car("Mercedes-Benz", "E-Class", 2022));
        carList.add(new Car("Audi", "A4", 2020));
    }

    public List<Car> getCars(int count) {
        if (count >= 0 && count <= carList.size()) {
            return carList.subList(0, count);
        }
        return carList;
    }

    public List<Car> getAllCars() {
        return carList;
    }
}
