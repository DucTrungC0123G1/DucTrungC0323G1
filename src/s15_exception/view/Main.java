package s15_exception.view;

import s15_exception.controller.ControllerSpending;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ControllerSpending controllerSpending = new ControllerSpending();
        controllerSpending.showMenuSpend();
    }
}
