package tema.lab3.magazin;

import java.util.ArrayList;

public class Magazin {
    private ArrayList<Angajati> listaAngajati;
    private ArrayList<Produse> listaProduse;
    private String numeMagazin;

    public Magazin() {
        listaAngajati=new ArrayList<Angajati>();
    }

    public void AdaugaAngajat(Angajati ang) {
	listaAngajati.add(ang);
    }
    public void StergeProdus(String numeProdus){
	Iterator itr = listaProduse.iterator(); 
        while (itr.hasNext()) 
        { 
            if (itr.getNume()==numeProdus) 
                itr.remove(); 
        } 

}
