/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstentite;

import Dao.DaoIndividu;
import Entites.Individu;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asus
 */
public class FirstEntite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DaoIndividu dao = new DaoIndividu();
//        Individu I = new Individu();
//        I.setAge(22);
//        I.setNom("Fettoukh");
//        I.setPrenom("amine");
//        dao.add(I);
//        List<Individu> ind = new ArrayList<Individu>();
//        ind = dao.findAll();
//        for ( int i=0 ; i<ind.size() ; i++)
//        {
//            System.out.println(ind.get(i).getPrenom());
//        }
        
//        System.out.println(dao.FindById(0).getPrenom());
            Individu d = new Individu();
            d.setId(0);
            d.setNom("Jihane");
            d.setPrenom("Fettoukh");
            d.setAge(12);
            dao.update(d);
    }
    
}
