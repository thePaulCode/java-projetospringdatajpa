module devthepaulcode.projetospringdatajpa {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.context;
    requires spring.tx;
    requires spring.data.jpa;
    requires com.zaxxer.hikari;
    requires spring.orm;
    requires java.sql;
    requires jakarta.persistence;
    requires spring.beans;
    requires spring.data.commons;


    opens devthepaulcode.projetospringdatajpa to javafx.fxml;
    exports devthepaulcode.projetospringdatajpa;
}