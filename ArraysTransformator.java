package ru.gdModule3lesson6.Testing;

public class ArraysTransformator {
    private int[] inputArray;

    public static void main(String[] args) {
        ArraysTransformator tr = new ArraysTransformator();

        int[] arr = {1, 2, 3};

//        System.out.println(tr.detectionIs4(arr));
//        System.out.println(tr.detectAmountNumbersAfter4(arr));
        System.out.println("/////////////////////////");
        //System.out.println(tr.transformArray(arr));
        //tr.transformArray(arr);
        try {
            tr.transformArray(arr);
        } catch (Not4Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getClass().getName());
        }
    }

    public int[] transformArray(int[] inputArray) throws Not4Exception {
        int[] resultArray;
        if (!detectionIs4(inputArray)) {
            //System.out.println("В массиве нет четверок!");
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
            System.out.println(resultArray[i]);
        }
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
        int counterAmountNumbersAfter4 = 0;
        for (int i = inputArray.length ; i >= 0; i--) {
            if (i != 4) {
                counterAmountNumbersAfter4 += 1;
            } else break;
        }
        return counterAmountNumbersAfter4;
    }
}
