/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_hopital;

import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import Metier.Docteur;

/**
 *
 * @author cyril_000
 */
public class TableauMedecin extends JScrollPane {

    public TableauMedecin() {
        ArrayList<Docteur> tabmed= new ArrayList<Docteur>();
    // création de liste ;
    // création de liste 
        Object[][] donnee=new Docteur[tabmed.size()][5];
         for (int i=0; i<tabmed.size();i++){
             donnee[i][1]=tabmed.get(i).getNom();
             donnee[i][2]=tabmed.get(i).getPrenom();
             donnee[i][3]=tabmed.get(i).getAdresse();
             donnee[i][4]=tabmed.get(i).getTel();
             donnee[i][5]=tabmed.get(i).getSpecialite();
             
        }
        /*JTable med= new JTable(tabmed.size(),5);
    for (int i=0; i<tabmed.size();i++){
        
        med.editCellAt(i,1,tabmed.get(i).getNom());
        med.editCellAt(i,2,tabmed.get(i).getPrenom());
        med.editCellAt(i,3,tabmed.get(i).getAdresse());
        med.editCellAt(i,4,tabmed.get(i).getSpecialite());
        med.editCellAt(i,5,tabmed.get(i).getTel());
    }*/
    

}
