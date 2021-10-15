package ru.dataart.academy.java;

import java.util.*;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        return Math.addExact(reverseNumber(firstNumber), reverseNumber(secondNumber));
    }

    private int reverseNumber(List<Integer> number) {
        int reversed = 0;
        ListIterator<Integer> iterator = number.listIterator(number.size());
        while (iterator.hasPrevious()) {
            reversed = Math.addExact(Math.multiplyExact(reversed, 10), iterator.previous());
        }
        return reversed;
    }

    /**
     * @param list - list of elements
     * @param <T>  - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        List<T> oddElements = new ArrayList<>();
        int i = 0;
        for (T element : list) {
            if (i++ % 2 == 0) {
                oddElements.add(element);
            }
        }
        return oddElements;
    }

    /**
     * @param list - list of elements
     * @param <T>  - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        if (list.size() == 0) {
            return Collections.emptyList();
        } else if (list.size() == 1) {
            return Collections.singletonList(list.listIterator().next());
        } else {
            return Arrays.asList(list.listIterator().next(), list.listIterator(list.size()).previous());
        }
    }
}
