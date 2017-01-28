package com.kirthika;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int fine=0;

        int actualDate = sc.nextInt();
        int actualMonth = sc.nextInt();
        int actualYear = sc.nextInt();

        int expectedDate = sc.nextInt();
        int expectedMonth = sc.nextInt();
        int expectedYear = sc.nextInt();

        if(actualYear>expectedYear){
            fine=10000;
        }else if(actualYear==expectedYear){
            if(actualMonth>expectedMonth){
                fine=((actualMonth-expectedMonth)*500);
            }
            else if(actualMonth==expectedMonth){
                if(actualDate>expectedDate){
                    fine=((actualDate-expectedDate)*15);
                }
            }
        }
        System.out.println(fine);
    }
}
