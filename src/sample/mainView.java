package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class mainView
{
    private static Stage primaryStage;
    private viewClient currentView;
    private static viewModelClient viewModel;

    public mainView(viewModelClient viewModel)
    {
        this.viewModel = viewModel;
    }

    public void start(Stage primaryStage)
    {
        this.primaryStage = primaryStage;
        openClientView();
    }

    public void openClientView()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("viewClient.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root, 800,600);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            currentView = loader.getController();
            currentView.init(viewModel, "Main Menu", scene);
        } catch (Exception e)
        {
            e.printStackTrace();
        }

        primaryStage.setScene(currentView.getScene());
        primaryStage.setTitle(currentView.getTitle());
        primaryStage.show();
    }

    public static Stage getPrimaryStage()
    {
        return primaryStage;
    }
    public static viewModelClient getViewModelClient(){return viewModel;}

}
