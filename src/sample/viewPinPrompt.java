package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class viewPinPrompt
{
    public Button backButton;
    // General logic / interaction for the fxml form goes here
    private viewModelClient viewModel;

    public viewPinPrompt()
    {

    }

    public void init(viewModelClient viewModel)
    {
        // add initialization of text boxes etc here
        this.viewModel = viewModel;
    }

    public void returnToMenuButtonPressed(ActionEvent actionEvent)
    {
        viewModel.displayMainScene();
    }
}
