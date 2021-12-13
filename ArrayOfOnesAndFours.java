package ru.gdModule3lesson6.Testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOfOnesAndFours {

    private int[] inputArray;

    public static void main(String[] args) {
        ArrayOfOnesAndFours oAF = new ArrayOfOnesAndFours();
        oAF.inputArray =new int[] {1, 1,4};
        System.out.println(oAF.checkIsOnly1And4InArray(oAF.inputArray));
    }

    public boolean checkIsOnly1And4InArray(int[] inputArray) {
        boolean numbersAreOnly1And4 = false;
        boolean otherNumbers = false;
        boolean is1 = false;
        boolean is4 = false;
        for (int i = 0; i <  inputArray.length; i++) {
            if (inputArray[i] != 1 && inputArray[i] != 4) {
                otherNumbers = true;
                break;
            }
            if (inputArray[i] == 1) {
                is1 = true;
            }
            if (inputArray[i] == 4) {
                is4 = true;
            }
        }
        if (otherNumbers == false && is1 == true && is4 == true) {
            numbersAreOnly1And4 = true;
        }
        //List intList = new ArrayList<>(Arrays.asList(inputArray));
        return numbersAreOnly1And4;
    }
    public boolean detectionIsOneInArray(int[] inputArray) {
        boolean is1 = false;
        List intList = new ArrayList<>(Arrays.asList(inputArray));
        if (intList.contains(1)) {
            is1 = true;
        }
        return is1;
    }
    public boolean detectionIsFourInArray(int[] inputArray) {
        boolean is4 = false;
        List intList = new ArrayList<>(Arrays.asList(inputArray));
        if (intList.contains(4)) {
            is4 = true;
        }
        return is4;
    }
}
