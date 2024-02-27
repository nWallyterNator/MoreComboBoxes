module com.example.morecombo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.morecombo to javafx.fxml;
    exports com.example.morecombo;
}