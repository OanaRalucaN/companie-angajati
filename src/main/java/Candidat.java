public class Candidat {
    private String name;
    private String prenume;
    private int niveldeCompetenta;
    private String numeDepartament;
    private StatusCandidat statusCandidat;

    public Candidat(String name, String prenume, int niveldeCompetenta, String numeDepartament) {
        this.name = name;
        this.prenume = prenume;
        this.niveldeCompetenta = niveldeCompetenta;
        this.numeDepartament = numeDepartament;
        this.statusCandidat = StatusCandidat.IN_ASTEPTARE;
    }

    public StatusCandidat getStatusCandidat() {
        return statusCandidat;
    }

    public void setStatusCandidat(StatusCandidat statusCandidat) {
        this.statusCandidat = statusCandidat;
    }

    public String getName() {
        return name;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getNiveldeCompetenta() {
        return niveldeCompetenta;
    }

    public String getNumeDepartament() {
        return numeDepartament;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setNiveldeCompetenta(int niveldeCompetenta) {
        this.niveldeCompetenta = niveldeCompetenta;
    }

    public void setNumeDepartament(String numeDepartament) {
        this.numeDepartament = numeDepartament;
    }
}
