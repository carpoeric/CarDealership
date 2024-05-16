package com.pluralsight.application;

import com.pluralsight.models.DealerShip;
import com.pluralsight.models.DealershipFileManager;
import ui.UserInterface;

public class Program {

    private DealerShip dealerShip;


    public void run(){

        dealerShip = DealershipFileManager.getDealershipObjects();
        UserInterface homeScreen = new UserInterface();
        homeScreen.MainScreen();

    }
}
