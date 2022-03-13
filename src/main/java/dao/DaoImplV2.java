package dao;


import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Result du Capteur:");
        double temp = 2 * Math.cos(Math.PI / 2) + 50;
        return temp;
    }
}
