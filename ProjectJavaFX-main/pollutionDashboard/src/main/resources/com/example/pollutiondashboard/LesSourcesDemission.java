package pollutionDashboard.src.main.resources.com.example.pollutiondashboard;

import javax.swing.*;

public class LesSourcesDemission {

    private String Sourcedemission;
    private String typeSource;

    private String emplacement;
    private String LimiteReglementaire;
    private String Responsable;

    private String active;


    public LesSourcesDemission(String sourcedemission, String typeSource, String emplacement, String limiteReglementaire, String responsable, String active) {
        Sourcedemission = sourcedemission;
        this.typeSource = typeSource;
        this.emplacement = emplacement;
        this.LimiteReglementaire = limiteReglementaire;
        this.Responsable = responsable;
        this.active = active;
    }

    public String getSourcedemission() {
        return Sourcedemission;
    }

    public String getTypeSource() {
        return typeSource;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public String getLimiteReglementaire() {
        return LimiteReglementaire;
    }

    public String getResponsable() {
        return Responsable;
    }

    public String getActive() {
        return active;
    }

    public void setSourcedemission(String sourcedemission) {
        Sourcedemission = sourcedemission;
    }

    public void setTypeSource(String typeSource) {
        this.typeSource = typeSource;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public void setLimiteReglementaire(String limiteReglementaire) {
        LimiteReglementaire = limiteReglementaire;
    }

    public void setResponsable(String responsable) {
        Responsable = responsable;
    }

    public void setActive(String active) {
        active = active;
    }

    @Override
    public String toString() {
        return "LesSourcesDemission{" +
                "Sourcedemission='" + Sourcedemission + '\'' +
                ", typeSource='" + typeSource + '\'' +
                ", emplacement='" + emplacement + '\'' +
                ", LimiteReglementaire='" + LimiteReglementaire + '\'' +
                ", Responsable='" + Responsable + '\'' +
                ", Active='" + active + '\'' +
                '}';
    }
}
