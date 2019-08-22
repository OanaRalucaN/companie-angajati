import java.util.List;

public class Companie {
    private String nume;
    private List<Candidat>angajati;
    private List<Departament>departamente;

    //gettere,settere,constructor

    //to be implemented



    public Companie(String nume) {
        this.nume = nume;
        this.angajati = angajati;
        this.departamente = departamente;
    }


    public String getNume() {
        return nume;
    }

    public List<Candidat> getAngajati() {
        return angajati;
    }

    public List<Departament> getDepartamente() {
        return departamente;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setAngajati(List<Candidat> angajati) {
        this.angajati = angajati;
    }

    public void setDepartamente(List<Departament> departamente) {
        this.departamente = departamente;
    }

    public void recruteaza (Candidat candidat){
        if(candidat.getNumeDepartament().equalsIgnoreCase("Marketing")){
            Marketing m=new Marketing();
            StatusCandidat status=m.evalueaza(candidat);
            candidat.setStatusCandidat(status);

        }else if(candidat.getNumeDepartament().equalsIgnoreCase("Productie")){
            Productie p=new Productie();
            StatusCandidat status=p.evalueaza(candidat);
            candidat.setStatusCandidat(status);
        }else{
            //aruncam exceptie
            throw new IncapacitateEvaluare("Candidatul nu poate fi evaluat");

        }
    }
}
