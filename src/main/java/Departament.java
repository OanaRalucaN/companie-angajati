public class Departament {

    private String nume;
    private int nivelMinimDeCompetente;
    //gettere,settere,constructor



    public Departament(String nume, int nivelMinimDeCompetente) {
        this.nume = nume;
        this.nivelMinimDeCompetente = nivelMinimDeCompetente;
    }

    public String getNume() {
        return nume;
    }

    public int getNivelMinimDeCompetente() {
        return nivelMinimDeCompetente;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNivelMinimDeCompetente(int nivelMinimDeCompetente) {
        this.nivelMinimDeCompetente = nivelMinimDeCompetente;
    }

}
