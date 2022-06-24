package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr= new int[5];
        Scanner s = new Scanner(System.in);
        int sum=0;
        for(int  i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
