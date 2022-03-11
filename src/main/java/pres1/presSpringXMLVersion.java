package pres1;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class presSpringXMLVersion {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println(metier.Calcule());
    }
}
