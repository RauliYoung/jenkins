/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.maven.maventest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rauliyoung
 */
public class distanceCalculatorTest {
    
    public distanceCalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCalculateDistance() {
        System.out.println("calculateDistance");
        double x1 = 3.0;
        double y1 = 1.0;
        double x2 = 2.5;
        double y2 = 4.0;
        distanceCalculator instance = new distanceCalculator();
        double expResult = instance.calculateDistance(x1, y1, x2, y2);
        double result = instance.calculateDistance(x1, y1, x2, y2);
        
        assertEquals(expResult, result, 0);
    }
    
}
