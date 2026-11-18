/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesmattress;

/**
 *
 * @author tumim
 */
public class Product extends SalesMattress {

    private int[][] sales;
    private String[] productName;

    public Product(int[][] sales, String[] productNames) {
        this.sales = sales;
        this.productName = productNames;
    }

    // Calculate total sales
    public int getTotalSales() {

        int total = 0;

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {

                total += sales[i][j];
            }
        }

        return total;
    }

    // Calculating average sales
    public double getAverageSales() {

        int total = getTotalSales();

        return (double) total / 3;
    }

    // Finding the most popular product
    public int getMostPopularProduct() {

        int highest = 0;

        for (int i = 0; i < sales.length; i++) {

            int productTotal = 0;

            for (int j = 0; j < sales[i].length; j++) {

                productTotal += sales[i][j];
            }

            int highestTotal = 0;

            for (int j = 0; j < sales[highest].length; j++) {
                highestTotal += sales[highest][j];
            }

            if (productTotal > highestTotal) {
                highest = i;
            }
        }

        return highest;
    }

    // Get total product sales
    public int getProductTotal(int productIndex) {

        int total = 0;

        for (int j = 0; j < sales[productIndex].length; j++) {

            total += sales[productIndex][j];
        }

        return total;
    }
}
