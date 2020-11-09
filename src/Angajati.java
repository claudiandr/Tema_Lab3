import java.util.ArrayList;
import java.util.Collections;

public class Angajati {

    String Nume;
    String Email;
    String Functie;
    int Salariu;


    public Angajati(String Nume, String Email, String Functie, int Salariu) {
        this.Nume = Nume;
        this.Email = Email;
        this.Functie = Functie;
        this.Salariu = Salariu;

    }
    public String getInfo() {
        return "Angajatul" + this.Nume + " are functia " + this.Functie + "si salariul de " + this.Salariu + "lei";
    }
    
    public void changeName(String name) {
        this.Nume = name;

    }
    public void changeEmail(String email) {
        this.Email=email;
    }
    public void changeFunction(String Function) {
        this.Functie=Function;
    }
    public void changeSalary(int salary) {
        this.Salariu=salary;
    }



}