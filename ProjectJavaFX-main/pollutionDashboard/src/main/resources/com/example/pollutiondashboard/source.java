package pollutionDashboard.src.main.resources.com.example.pollutiondashboard;

public class source {




    private String sourceEmission;
    private String typeSource;
    private String limiteReglementaire;
    private String Activité;
    public source(String sourceEmission, String typeSource, String limiteReglementaire, String Activité) {
        super();
        this.sourceEmission = sourceEmission;
        this.typeSource = typeSource;
        this.limiteReglementaire = limiteReglementaire;
        this.Activité = Activité;
    }

    public String getSourceEmission() {
        return sourceEmission;
    }

    public String getTypeSource() {
        return typeSource;
    }

    public String getLimiteReglementaire() {
        return limiteReglementaire;
    }

    public String getActivité() {
        return Activité;
    }

    public void setSourceEmission(String sourceEmission) {
        this.sourceEmission = sourceEmission;
    }

    public void setTypeSource(String typeSource) {
        this.typeSource = typeSource;
    }

    public void setLimiteReglementaire(String limiteReglementaire) {
        this.limiteReglementaire = limiteReglementaire;
    }

    public void setActivité(String activité) {
        Activité = activité;
    }

    @Override
    public String toString() {
        return "source{" +
                "sourceEmission='" + sourceEmission + '\'' +
                ", typeSource='" + typeSource + '\'' +
                ", limiteReglementaire='" + limiteReglementaire + '\'' +
                ", Activité='" + Activité + '\'' +
                '}';
    }
}
