package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> initial = new ArrayDeque<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            initial.add(i);
        }

        int counter = 1;
        while (!initial.isEmpty()) {
            int item = initial.poll();
            if (counter % everyDishNumberToEat == 0) {
                result.add(item);
            } else {
                initial.addLast(item);
            }
            counter++;
        }
        return result;
    }
}
