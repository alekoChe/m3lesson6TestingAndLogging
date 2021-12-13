package ru.gdModule3lesson6.Testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysTransformator {
    private int[] inputArray;

    public static void main(String[] args) {
        ArraysTransformator tr = new ArraysTransformator();

        int[] arr = {1, 2, 3};
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 4, 5, 6,7, 8};
        int[] arr3 = {4, 1, 4, 9, 10, 11 , 12};
        int[] arr4 = {0, 1, 2, 4, 1, 4, 5, 6, 7 , 8};

        try {
            tr.transformArray(arr1);
            tr.transformArray(arr2);
            tr.transformArray(arr3);
            tr.transformArray(arr4);
            tr.transformArray(arr);
        } catch (Not4Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getClass().getName());
        }
    }

    public int[] transformArray(int[] inputArray) throws Not4Exception {
        int[] resultArray;
        if (!detectionIs4(inputArray)) {
            throw new Not4Exception(inputArray);
        }
        else {
            int amountNumbersBefore4 = detectAmountNumbersAfter4(inputArray);
            resultArray = new int[amountNumbersBefore4];
            for (int i = 0; i < resultArray.length; i++) {
                resultArray[i] = inputArray[inputArray.length - resultArray.length + i];
            }
        }
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
        System.out.println();
        return resultArray;
    }

    public boolean detectionIs4(int[] inputArray) {
        /** определяем наличие четверок в массиве */
        int counter4 = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 4) {
                counter4 += 1;
                break;
            }
        }
        return (counter4 > 0);
    }

    public int detectAmountNumbersAfter4(int[] inputArray) {
        List<Integer> listArr = Arrays.stream(inputArray).boxed().collect(Collectors.toList()); // преобразуем массив в список
        int lengthList = listArr.size();
        System.out.println(listArr);
        int indexLastFour = listArr.lastIndexOf(4);
        return (lengthList - indexLastFour - 1);
    }
}
