import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 400, 200);

        Andmed andmed = new Andmed(0);

        Label autodkokku = new Label();
        autodkokku.setTranslateX(20);
        autodkokku.setTranslateY(60);

        Label paldiskikokku = new Label();
        paldiskikokku.setTranslateX(20);
        paldiskikokku.setTranslateY(80);

        Label kesklinnkokku = new Label();
        kesklinnkokku.setTranslateX(20);
        kesklinnkokku.setTranslateY(100);

        Label tabasalukokku = new Label();
        tabasalukokku.setTranslateX(20);
        tabasalukokku.setTranslateY(120);

        Label mustamäekokku = new Label();
        mustamäekokku.setTranslateX(20);
        mustamäekokku.setTranslateY(140);

        Label populaarseim = new Label();
        populaarseim.setTranslateX(20);
        populaarseim.setTranslateY(160);

        Button kesklinnanupp = new Button("Kesklinn");
        kesklinnanupp.setTranslateX(20);
        kesklinnanupp.setTranslateY(20);
        kesklinnanupp.setOnMouseClicked(event -> {
            andmed.lisaKesklinn();
            autodkokku.setText("Autosid kokku: " + andmed.autodKokku());
            kesklinnkokku.setText("Kesklinna autosid kokku: " + andmed.kesklinn);
            populaarseim.setText("Populaarseim suund: " + andmed.populaarseimSuund());
        });
        Button paldiskinupp = new Button("Paldiski");
        paldiskinupp.setTranslateX(120);
        paldiskinupp.setTranslateY(20);
        paldiskinupp.setOnMouseClicked(event -> {
            andmed.lisaPaldiski();
            autodkokku.setText("Autosid kokku: " + andmed.autodKokku());
            paldiskikokku.setText("Paldiski autosid kokku: " + andmed.paldiski);
            populaarseim.setText("Populaarseim suund: " + andmed.populaarseimSuund());
        });
        Button tabasalunupp = new Button("Tabasalu");
        tabasalunupp.setTranslateX(220);
        tabasalunupp.setTranslateY(20);
        tabasalunupp.setOnMouseClicked(event -> {
            andmed.lisaTabasalu();
            autodkokku.setText("Autosid kokku: " + andmed.autodKokku());
            tabasalukokku.setText("Tabasalu autosid kokku: " + andmed.tabasalu);
            populaarseim.setText("Populaarseim suund: " + andmed.populaarseimSuund());
        });
        Button mustamäenupp = new Button("Mustamäe");
        mustamäenupp.setTranslateX(320);
        mustamäenupp.setTranslateY(20);
        mustamäenupp.setOnMouseClicked(event -> {
            andmed.lisaMustamäe();
            autodkokku.setText("Autosid kokku: " + andmed.autodKokku());
            mustamäekokku.setText("Mustamäe autosid kokku: " + andmed.mustamäe);
            populaarseim.setText("Populaarseim suund: " + andmed.populaarseimSuund());
        });

        pane.getChildren().addAll(kesklinnanupp,paldiskinupp,tabasalunupp,mustamäenupp,autodkokku,tabasalukokku,kesklinnkokku,mustamäekokku,paldiskikokku,populaarseim);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}