package ru.gdModule3lesson6.Testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOfOnesAndFours {

    private int[] inputArray;

    public static void main(String[] args) {
        ArrayOfOnesAndFours oAF = new ArrayOfOnesAndFours();
        oAF.inputArray =new int[] {1, 4, 4, 4, 1, 1};
        System.out.println(oAF.checkIsOnly1And4InArray(oAF.inputArray));
    }

    public boolean checkIsOnly1And4InArray(int[] inputArray) {
        boolean numbersAreOnly1And4 = true;
        for (int i = 0; i <  inputArray.length; i++) {
            if (inputArray[i] != 1 && inputArray[i] != 4) {
                numbersAreOnly1And4 = false;
                break;
            }
        }
        //List intList = new ArrayList<>(Arrays.asList(inputArray));
        return numbersAreOnly1And4;
    }
}
