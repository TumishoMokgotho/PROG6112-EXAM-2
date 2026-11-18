/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesmattress;

/**
 *
 * @author tumim
 */
public class PrintProduct {


    public void printReport(int totalSales, double averageSales,
            String productName, int productSales) {

        System.out.println("\nPRODUCT SALES REPORT - 2026");

        System.out.println("\n********************************");

        System.out.println("TOTAL PRODUCT SALES: " + totalSales);

        System.out.println("AVERAGE PRODUCT SALES: "
                + (int) averageSales);

        System.out.println("MOST POPULAR PRODUCT: "
                + productName + "(" + productSales + ")");
    }
}
