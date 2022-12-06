module com.xanshee {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires java.sql;
    requires java.xml.bind;
    requires hibernate.entitymanager;
    requires org.hibernate.orm.core;

    opens com.xanshee.model to org.hibernate.orm.core;

    opens com.xanshee.controller to javafx.fxml;
    opens com.xanshee.bootloader to javafx.fxml;
    exports com.xanshee.bootloader;
    exports com.xanshee.controller;
}