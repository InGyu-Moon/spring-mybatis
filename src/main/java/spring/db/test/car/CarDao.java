package spring.db.test.car;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CarDao implements CarDaoInter{

	@Autowired
	private SqlSession session;
	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return session.selectOne("getTotalCount");
	}

	@Override
	public List<CarDto> getTotalCarList() {
		// TODO Auto-generated method stub
		return session.selectList("getAllCars");
	}

	@Override
	public void insertCar(CarDto carDto) {
		// TODO Auto-generated method stub
		session.insert("insertCar", carDto);
	}

	@Override
	public CarDto getData(String num) {
		// TODO Auto-generated method stub
		return session.selectOne("selectOneOfCar",num);
	}

	@Override
	public void updateCar(CarDto carDto) {
		// TODO Auto-generated method stub
		session.update("updateOfCar", carDto);
		
	}

	@Override
	public void deleteCar(String num) {
		session.delete("deleteOfCar",num);
	}

}
