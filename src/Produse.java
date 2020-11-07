
import java.util.ArrayList;
import java.util.Collections;

public class Produse {

    String nume_produs;
    String categorie;
    int pret;
    int cod_bare;


    public Produse(String nume_produs, String categorie, int pret, int cod_bare) {
        this.nume_produs = nume_produs;
        this.categorie = categorie;
        this.pret = pret;
        this.cod_bare = cod_bare;
    }


    public String getInfo() {
        return "Produsul " + this.nume_produs + "din categoria " + this.categorie + "are codul " + this.cod_bare +
                "si pretul" + this.pret;
    }


    public void changeName(String name) {
        this.nume_produs = name;

    }
    public void changeCategory(String category) {
        this.categorie=category;
    }
    public void changePrice(int New_price) {
        this.pret=New_price;

    }
    public void changeBareCode(int bare_code) {
        this.cod_bare=bare_code;
    }
}