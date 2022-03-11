package dao;


import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Capteur");
        double temp = 10 * Math.cos(Math.PI / 2) + 115;
        return temp;
    }
}
