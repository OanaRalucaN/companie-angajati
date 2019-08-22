import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Companie companie = new Companie("SDA");
        Departament departamentMarketing = new Marketing();
        Departament departamentProductie = new Productie();
        Departament departamentHR = new Departament("HR", 5);

        List<Departament> departamente = new ArrayList<Departament>();
        departamente.add(departamentProductie);
        departamente.add(departamentMarketing);
        departamente.add(departamentHR);

        companie.setDepartamente(departamente);

        List<Candidat> candidati = new ArrayList<Candidat>();

        Candidat candidat4 = new Candidat("Pop", "Ionut", 10, "Marketing");
        Candidat candidat1 = new Candidat("Andrea", "Dan", 1, "Productie");
        Candidat candidat2 = new Candidat("Vlad", "Pop", 7, "Productie");
        Candidat candidat3 = new Candidat("Ada", "Vali", 3, "HR");

        candidati.add(candidat1);
        candidati.add(candidat2);
        candidati.add(candidat3);
        candidati.add(candidat4);
        companie.setAngajati(candidati);

        for (Candidat candidat : candidati) {
            try {
                companie.recruteaza(candidat);
            } catch (IncapacitateEvaluare e) {
                System.out.println("Exceptie prinsa!!");
            }
            System.out.println(candidat.getStatusCandidat());

        }

    }
}
