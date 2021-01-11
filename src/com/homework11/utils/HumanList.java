package com.homework11.utils;

import com.homework11.entities.Human;

import java.util.Arrays;

public class HumanList {
    private Human[] humans = new Human[0];

    public void add(Human h) {
        humans = Arrays.copyOf(humans, humans.length + 1);
        humans[humans.length - 1] = h;
    }

    public void delete(int number) {
        for (int i = 0; i < humans.length - 1; i++) {
            if (i + 1 < number) {
                humans[i] = humans[i];
            }
            if (i + 1 >= number) {
                humans[i] = humans[i + 1];
            }
        }
        humans = Arrays.copyOf(humans, humans.length - 1);
    }

    public Human get(int index) {
        return humans[index];
    }

    public void set(int index, Human value) {
        humans[index] = value;
    }

    public int size() {
        return humans.length;
    }
}
