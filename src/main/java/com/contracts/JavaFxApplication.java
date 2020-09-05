package com.contracts;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Y510p
 * @project types-of-contracts-employment
 * @date 9/1/2020
 **/

public class JavaFxApplication extends Application {

    private ConfigurableApplicationContext springContext;
    private Parent root;

    @Override
    public void init() throws Exception {
        springContext = SpringApplication.run(BenefitsOfContractsEmploymentApplication.class);
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/panes/main-scene.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        root = fxmlLoader.load();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/custom-style.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        this.springContext.close();
        Platform.exit();
    }

}
