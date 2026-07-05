/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patterna;

/**
 *
 * @author HP
 */
public class Patterna {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); 
        }
    }
}
