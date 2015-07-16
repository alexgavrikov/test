package ru.ncedu.java.gavrikov.cfs;



/**
 * Created by user on 03.07.2015.
 */
public class ControlFlowStatements1Impl implements ControlFlowStatements1{
    public float getFunctionValue(float x){
        if(x>0)
                return (float)(2*Math.sin(x));
        else
                return 6-x;
    }

    public String decodeWeekday(int weekday) {
        String weekString=null;
        switch (weekday) {
            case 1:
                weekString = "Monday";
                break;
            case 2:
                weekString = "Tuesday";
                break;
            case 3:
                weekString = "Wednesday";
                break;
            case 4:
                weekString = "Thursday";
                break;
            case 5:
                weekString = "Friday";
                break;
            case 6:
                weekString = "Saturday";
                break;
            case 7:
                weekString = "Sunday";
                break;
        }
        return weekString;
    }

    @Override
    public int getMinValue(int[][] array) {
        int len=array.length;
        int min=array[0][0];
        for(int[] e : array){
            for(int d : e){
                if (d<min) min=d;
            }
        }
        return min;
    }

    @Override
    public int[][] initArray() {
        int[][] array=new int [8][5];
        for(int i=0;i<8;++i){
            for (int j=0;j<5;++j){
                array[i][j]=i*j;
            }
        }

        return array;
    }

    @Override
    public BankDeposit calculateBankDeposit(double P) {
        BankDeposit deposit=new BankDeposit();
        deposit.years=(int)(Math.log(5)/Math.log(1+P/100))+1;
        deposit.amount=1000*Math.pow(1+P/100,deposit.years);
        return deposit;
    }
}
