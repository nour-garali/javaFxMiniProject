package pollutionDashboard.src.main.resources.com.example.pollutiondashboard;

public class lesEmissions {
    private String source;
    private String typeSource;

    private String Emission;
    public lesEmissions(String source, String typeSource,String Emission) {
        super();
        this.source= source;
        this.typeSource = typeSource;

        this.Emission = Emission;
    }

    public String getSource() {
        return source;
    }

    public String getTypeSource() {
        return typeSource;
    }

    public String getEmission() {
        return Emission;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setTypeSource(String typeSource) {
        this.typeSource = typeSource;
    }

    public void setEmission(String emission) {
        Emission = emission;
    }
}
