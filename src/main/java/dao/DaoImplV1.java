package dao;

import org.springframework.stereotype.Component;

@Component("dao1")
public class DaoImplV1 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version DataBase");
        double temp = 40;
        return temp;
    }
}
