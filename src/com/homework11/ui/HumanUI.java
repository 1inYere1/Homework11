package com.homework11.ui;

import com.homework11.entities.Human;
import com.homework11.utils.HumanList;

import java.util.Scanner;

public class HumanUI {

    Scanner sc;

    public HumanUI(Scanner sc) {
        this.sc = sc;
    }

    public HumanList readHumans(int count) {
        HumanList humans = new HumanList();
        System.out.println("Введите данные пользователя: ");
        for (int i = 0; i < count; i++) {
            System.out.println("Введите фамилию: ");
            String surname = sc.nextLine();
            System.out.println("Введите имя: ");
            String name = sc.nextLine();
            System.out.println("Введите отчество: ");
            String patronymic = sc.nextLine();
            Human h = new Human(surname, name, patronymic);
            humans.add(h);
        }
        return humans;
    }

    public void showHumans(HumanList humanList) {
        for (int i = 0; i < humanList.size(); i++) {
            Human h = humanList.get(i);
            System.out.println((i + 1) + "-" + h);

        }

    }

    public HumanList deleteHuman(HumanList humanList) {
        System.out.println("Введите номер пользователя которого нужно удалить: ");
        int deleteHuman = sc.nextInt();
        humanList.delete(deleteHuman);
        return humanList;
    }




}
