package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImplV1 implements IMetier {

    private IDao dao;

    public MetierImplV1(IDao dao2) {
        this.dao = dao2;
    }

    @Override
    public double Calcule() {
        double temp = dao.getData() * 20;
        return temp;
    }
}
