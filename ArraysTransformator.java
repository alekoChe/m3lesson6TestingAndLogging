package ru.gdModule3lesson6.Testing;

public class ArraysTransformator {
    private int[] inputArray;
    //private int[] outputArray;

    public int[] transformArray(int[] inputArray) throws Not4Exception {
        int[] resultArray;
        if (!detectionIs4(inputArray)) {
            throw new Not4Exception();
        }
        else {
            int amountNumbersBefore4 = detectedAmountNumbersBefore4(inputArray);
            resultArray = new int[amountNumbersBefore4];
            for (int i = 0; i < resultArray.length; i++) {
                resultArray[i] = inputArray[inputArray.length - resultArray.length + i];
            }
        }
        return resultArray;
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

    public int detectedAmountNumbersBefore4(int[] inputArray) {
        int counterAmountNumbersBefore4 = 0;
        for (int i = inputArray.length - 1; i >= 0; i--) {
            if (i != 4) {
                counterAmountNumbersBefore4 += 1;
            } else break;
        }
        return counterAmountNumbersBefore4;
    }
}
