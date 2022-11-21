package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> merged = new ArrayDeque<>();
        for (int i = 0; i < 2; i++) {
            merged.add(firstQueue.poll());
        }
        for (int i = 0; i < 2; i++) {
            merged.add(secondQueue.poll());
        }

        while (!firstQueue.isEmpty()) {
            firstQueue.add(merged.pollLast());

            for (int i = 0; i < 2; i++) {
                merged.addLast(firstQueue.poll());
            }

            secondQueue.add(merged.pollLast());
            for (int i = 0; i < 2; i++) {
                merged.addLast(secondQueue.poll());
            }
        }
        return merged;
    }
}
