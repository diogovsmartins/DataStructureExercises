package org.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Blaba {

    public static void main(String[] args) {
        ArrayList<Integer> arrayToBeOrdered = new ArrayList<>();
        Blaba a = new Blaba();
        for (int i = 0; i < 10; i++) {
            arrayToBeOrdered.add(new Random().nextInt(100));
        }
        a.quickSort(arrayToBeOrdered);
        arrayToBeOrdered.stream().forEach(System.out::println);

    }

    public List<Integer> quickSort(ArrayList<Integer> listToBeSorted) {
        List<Integer> leftPartition = new ArrayList<>();
        List<Integer> rightPartition = new ArrayList<>();
        final List<Integer> sortedList = new ArrayList<>();
        AtomicInteger numberOfChanges = new AtomicInteger(0);

        final var sortStart = System.currentTimeMillis();

        var firstPivot = listToBeSorted.get(listToBeSorted.size() - 1);

        for (int i = 0; i <= listToBeSorted.size() - 1; i++) {
            var currentValue = listToBeSorted.get(i);

            if (currentValue >= firstPivot) {
                rightPartition.add(currentValue);
                numberOfChanges.getAndAdd(1);
            } else {
                leftPartition.add(currentValue);
                numberOfChanges.getAndAdd(1);
            }
        }

        for (Integer integer : leftPartition) {
            var pivot=leftPartition.get(leftPartition.size()-1);
            sortedList.add(integer);

        }
        for (Integer integer : rightPartition) {
            sortedList.add(integer);
        }

        final var totalTime = System.currentTimeMillis() - sortStart;

        return sortedList;
    }
}
