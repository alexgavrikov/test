package ru.ncedu.java.gavrikov.cfs;

import java.util.Arrays;

/**
 * Created by user on 04.07.2015.
 */
public class Main {
    public static void main(String[] args) {
        ControlFlowStatements1Impl object = new ControlFlowStatements1Impl();
        System.out.println(object.getFunctionValue(1));
        System.out.println(object.getFunctionValue(-1));
        int[][] array=new int[2][2];
        array[0][0]=0;
        array[0][1]=1;
        array[1][0]=2;
        array[1][1]=-1;
        System.out.println(object.getMinValue(array));
        System.out.println(object.decodeWeekday(2));
        System.out.println(object.calculateBankDeposit(100));
        System.out.println(Arrays.toString((object.initArray())));
        System.out.println();
        System.out.println();

    }
}
