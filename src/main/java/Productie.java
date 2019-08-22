public class Productie extends Departament implements Evaluator {
    //static final=constanta
    //nume="Productie"
    //nivelComp=3


    public Productie() {
        super("Productie", 3);
    }

    public StatusCandidat evalueaza(Candidat candidat) {
        //to be implemented

        if (candidat.getNiveldeCompetenta() > super.getNivelMinimDeCompetente()) {
            return StatusCandidat.ACCEPTAT;
        } else if (candidat.getNiveldeCompetenta() < super.getNivelMinimDeCompetente()) {
            return StatusCandidat.RESPINS;
        } else {
            return StatusCandidat.IN_ASTEPTARE;
        }


    }
}