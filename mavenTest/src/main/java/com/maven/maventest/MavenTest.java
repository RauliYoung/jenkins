/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.maven.maventest;

/**
 *
 * @author rauliyoung
 */
public class MavenTest {

    public static void main(String[] args) {
        
        distanceCalculator calc = new distanceCalculator();
        
        System.out.println(calc.calculateDistance(4.0, 2.0, 1.0, 3.5));
    }
}
