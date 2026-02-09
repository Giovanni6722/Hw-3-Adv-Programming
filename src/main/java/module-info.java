module org.example.advprogramminghw3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.advprogramminghw3 to javafx.fxml;
    exports org.example.advprogramminghw3;
}