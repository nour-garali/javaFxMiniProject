package pollutionDashboard.src.main.resources.com.example.pollutiondashboard;
import pollutionDashboard.FXML;

import javax.swing.text.TableView;
import java.awt.*;

public class DataConsultControlleur {
    DataConsultControlleur D  = new DataConsultControlleur();
    private Button HOME;
    @FXML
    private Button ajouterdata;
    @FXML
    private Button calculemission;
    @FXML

    @FXML
    private TableView<lesEmissions> tE;
    @FXML
    private TableView<LesSourcesDemission> tSE;

    public DataConsultControlleur() {
    }
}
