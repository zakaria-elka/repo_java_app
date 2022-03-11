package pres1;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.util.Scanner;

public class presDynamiqueInstaciation {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(new File("config.txt"));
        String DoaClassName = sc.nextLine();
        Class <?> CDao = Class.forName(DoaClassName);
        IDao dao = (IDao) CDao.getDeclaredConstructor().newInstance();

        String MetierClassName = sc.nextLine();
        Class <?> CMetier = Class.forName(MetierClassName);
        IMetier metier = (IMetier) CMetier.getDeclaredConstructor(IDao.class).newInstance(dao);

        System.out.println(metier.Calcule());

    }
}
