package ma.presentation;

import ma.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationAnnotation {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("ma");
        IMetier metier = (IMetier) ctx.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}