package pollutionDashboard.src.main.resources.com.example.pollutiondashboard;

public class Source2 {

    private String sourceEmission;
    private String typeSource;

    private String Activité;
    public void source(String sourceEmission, String typeSource, String Activité) {

        this.sourceEmission = sourceEmission;
        this.typeSource = typeSource;

        this.Activité = Activité;
    }

    public String getSourceEmission() {
        return sourceEmission;
    }

    public String getTypeSource() {
        return typeSource;
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



    public void setActivité(String activité) {
        Activité = activité;
    }

    @Override
    public String toString() {
        return "source{" +
                "sourceEmission='" + sourceEmission + '\'' +
                ", typeSource='" + typeSource + '\'' + '\'' +
                ", Activité='" + Activité + '\'' +
                '}';
    }

}
