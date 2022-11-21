package com.epam.collections.queue;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> merged = new PriorityQueue<>(Collections.reverseOrder());
        merged.addAll(firstList);
        merged.addAll(secondList);
         return merged;
    }
}
