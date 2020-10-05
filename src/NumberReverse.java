import java.util.Scanner;

public class NumberReverse {

    static String toString(int num) {
        return Integer.toString(num);
    }

    static int toInt(String str) {
        return Integer.parseInt(str);
    }

    static int sumArr(int[] numArr) {
        int sum = 0;
        for(int e : numArr) {
            sum += e;
        }
        return sum;
    }

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       int countNum = 1;

       while(true) {
           int num = sc.nextInt();

           if(num == 0) {
               break;
           }

           String numToStr = toString(num);
           int size = numToStr.length();
           int[] numArr = new int[size];
           for(int i = 0; i < size; i++) {
               numArr[i] = toInt(numToStr.substring(size - i - 1, size - i));
           }
           int sum = sumArr(numArr);
           String concatNum = "";
           for(int e : numArr) {
               concatNum += toString(e);
           }
           System.out.println(toInt(concatNum) + " " + sum);

           countNum++;
           if(countNum > 10) {
               break;
           }
       }



    }

}
