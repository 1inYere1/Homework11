package com.homework11;

import com.homework11.entities.Human;
import com.homework11.services.HumanService;
import com.homework11.ui.HumanUI;
import com.homework11.utils.HumanList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HumanUI humanUI = new HumanUI(sc);
        HumanService humanService = new HumanService();
        HumanList humans = humanUI.readHumans(3);
        humanService.addHumans(humans);
        humanUI.showHumans(humans);
        humanUI.deleteHuman(humans);
        humanUI.showHumans(humans);

    }
}
