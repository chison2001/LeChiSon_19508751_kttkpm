module com.example.kafka_demo {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.kafka_demo to javafx.fxml;
    exports com.example.kafka_demo;
}