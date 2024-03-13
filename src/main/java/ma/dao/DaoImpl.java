package ma.dao;

import org.springframework.stereotype.Component;

@Component("ma/dao")
public class DaoImpl implements IDao{
    public DaoImpl() {
    }

    public double getData() {
        System.out.println("Version base de donnée");
        double temp = Math.random()*40;
        return temp;
    }
}
