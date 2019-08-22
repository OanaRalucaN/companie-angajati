public class Marketing  extends Departament implements Evaluator {

    //nume=Markrting
    //Ninel Comp =6


    public Marketing() {
        super("Marketing", 6);
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
