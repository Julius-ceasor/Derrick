/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leapmonth;

public class leapmonth {

    public static void main(String[] args) {
        int[] years = {2024, 2025, 2026, 1900, 2000, 2028};

        System.out.println("Leap Year Test Results (as of Feb 20, 2026):\n");

        for (int year : years) {
            boolean isLeap = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);

            System.out.printf("Year %d: %s leap year%n",
                    year,
                    isLeap ? "IS a" : "is NOT a");
        }
    }
}