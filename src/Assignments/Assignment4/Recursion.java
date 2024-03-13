package Assignments.Assignment4;

public class Recursion {

    public void reverseDigits(int n){
        reverseDigitsHelper(n);
        System.out.println();
    }

    public int countDigits(int n){
        if(n < 10) return 1;
        return 1 + countDigits(n/10);
    }

    public int sumArr(int[] arr){
        return sumArrHelper(arr, 0);
    }


    // helper functions
    public int sumArrHelper(int[] arr, int index){
        if(index >= arr.length) return 0;
        return arr[index] + sumArrHelper(arr, ++index);
    }

    public void reverseDigitsHelper(int n){
        if(n == 0) return;
        int lastDigit = n % 10;
        System.out.print(lastDigit);
        reverseDigitsHelper(n/10);
    }
}
