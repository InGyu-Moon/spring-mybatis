package spring.db.test.car;

import java.util.List;

public interface CarDaoInter {
	public int getTotalCount();
	public List<CarDto> getTotalCarList();
	public void insertCar(CarDto carDto);
	public CarDto getData(String num);
	public void updateCar(CarDto carDto);
	public void deleteCar(String num);
}
