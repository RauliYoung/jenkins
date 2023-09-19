/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maven.maventest;

/**
 *
 * @author rauliyoung
 */
public class distanceCalculator {
   public double calculateDistance(double x1, double y1, double x2, double y2) {
      double distance = (y2-y1) * (y2-y1) + (x2-x1)*(x2-x1);
      return Math.sqrt(distance);
    }
}
