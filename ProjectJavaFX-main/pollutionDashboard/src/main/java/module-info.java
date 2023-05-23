module com.example.pollutiondashboard {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pollutiondashboard to javafx.fxml;
    exports com.example.pollutiondashboard;
}