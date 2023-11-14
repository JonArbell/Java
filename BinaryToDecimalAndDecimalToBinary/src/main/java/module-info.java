module com.example.binarytodecimalanddecimaltobinary {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.scripting;


    opens com.example.binarytodecimalanddecimaltobinary to javafx.fxml;
    exports com.example.binarytodecimalanddecimaltobinary;
}