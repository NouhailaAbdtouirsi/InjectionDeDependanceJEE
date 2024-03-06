package ma.metier;

import ma.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class MetierImpl implements IMetier{
    @Autowired
    public IDao dao; // couplage faible
    @Override
    public double calcul() {
        return (dao.getData()*20/100);
    }
    // injecter dans la var dao une instance d'une classe qui implemente IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
