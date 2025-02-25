package Array.JAVA_PROGRAMMING_BATCH;

import java.util.Scanner;

public class Square_Root {
    public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = s.nextInt();
        for(int i=1;i<=num;i++){
            if(i*i == num)
            System.out.println(num+" is square root of "+i);
        }
    }
}
