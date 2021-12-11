package ru.gdModule3lesson6.Testing;

public class ArraysTransformator {
    private int[] inputArray;
    //private int[] outputArray;

    public int[] outputArray(int[] inputArray) {
        int[] outputArray;
        if (!detectionIs4(inputArray)) {
            throw new Not4Exception();
        }
    }

    public boolean detectionIs4(int[] inputArray) {
        /** определяем наличие четверок в массиве */
        int counter4 = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (i == 4) {
                counter4 += 1;
                break;
            }
        }
        return (counter4 > 0);
    }
}
