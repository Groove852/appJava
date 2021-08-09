module sample {
    requires javafx.fxml;
    requires javafx.controls;
    requires transitive javafx.base;
    requires transitive javafx.graphics;

    exports sample to javafx.graphics;
    opens sample.controllers to javafx.fxml;
    opens sample to javafx.fxml;
}