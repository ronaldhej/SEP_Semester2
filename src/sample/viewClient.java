package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class viewClient
{
    public Button adminButton;
    public TextField searchTextField;
    private viewModelClient viewModel;
    private Scene scene;
    private String title;


    public viewClient()
    {

    }

    public void init(viewModelClient viewModel, String title, Scene scene)
    {
        this.title = title;
        this.scene = scene;
        this.viewModel = viewModel;

        searchTextField.textProperty().bindBidirectional(viewModel.searchTextProperty());

        // Add the text fields etc here as textProperty and send it to the viewModel's usernameProperty method
    }




    public String getTitle(){return title;}
    public Scene getScene(){return scene;}

    public void adminButtonPressed(ActionEvent actionEvent) throws IOException
    {
        viewModel.displayPinScene();
    }
}
