package com.homework11.services;

import com.homework11.entities.Human;
import com.homework11.utils.HumanList;


public class HumanService {
    private HumanList humans = new HumanList();

    public void addHuman(Human h) {
        humans.add(h);
    }

    public void addHumans(HumanList list) {
        for (int i = 0; i < list.size(); i++) {
            humans.add(list.get(i));

        }
    }

    public void deleteHuman(int number) {
        humans.delete(number);
    }




}
