package ma.ext;

import ma.dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capteur de température 2.0");
        return 40;
    }

}
