package com.example.carshowroom;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
/*
Автосалон.
Требуется создать приложение с помощью которого возможно будет:
-добавлять/изменять автомобили(легковые,грузовые)
-добавлять/продавать/изменять покупателей
-показывать информацию обо всех автомобилях в салоне
-при продаже авто создается база где хранится вся информация о ТО(авто удаляется из автосалона)
-показывать таблицу проданный авто - покупатель

 */

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 480);
        stage.setTitle("CarShowroom");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
