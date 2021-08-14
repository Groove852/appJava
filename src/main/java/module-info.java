module sample {
    requires javafx.fxml;
    requires javafx.controls;
    requires transitive javafx.base;
    requires transitive javafx.graphics;
    requires MaterialFX;
    requires protobuf.java;
    requires grpc.stub;
    requires grpc.core;
    requires grpc.protobuf;
    requires guava;
    requires annotations.api;

    exports sample to javafx.graphics, javafx.fxml;
    opens sample to javafx.fxml;

    opens sample.controllers to javafx.fxml;

    exports sample.controllers.contents to javafx.fxml;
    opens sample.controllers.contents to javafx.fxml;
}