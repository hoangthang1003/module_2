package case_study.view;

import case_study.controller.MainMenuController;

import java.io.IOException;

public class View {
    public static void main(String[] args)  {
        MainMenuController mainMenuController = new MainMenuController();
        try {
            mainMenuController.displayMainMenu();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
