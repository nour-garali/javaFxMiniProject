package pollutionDashboard.src.main.resources.com.example.pollutiondashboard;

import pollutionDashboard.FXML;

import javax.swing.*;
import javax.swing.text.TableView;
import javax.xml.transform.Source;
import java.awt.*;
public class dataController {

    dataController c  = new dataController();
    private Button HOME;
    @FXML
    private Button ajouterdata;
    @FXML
    private Button calculEmission;

    @FXML
    private Button consulterData;

    @FXML
    private TextField sourceEmission;
    @FXML
    private TextField emplacement;
    @FXML
    private TextField responsable;
    @FXML
    private Button calculer;
    @FXML
    private JComboBox typeSource;
    @FXML
    private Button limiteReg;

    @FXML
    private TableView<LesSourcesDemission> t1;


    public dataController() {
    }
}}
}
