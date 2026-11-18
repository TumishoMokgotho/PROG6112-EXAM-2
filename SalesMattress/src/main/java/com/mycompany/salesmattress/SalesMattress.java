/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.salesmattress;

/**
 *
 * @author tumim
 */
import java.util.Scanner;

public class SalesMattress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array for Names
        String[] products = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };

        // Array for sales
        int[][] sales = new int[3][3];

        // Input sales
        for (int i = 0; i < products.length; i++) {

            for (int j = 0; j < sales[i].length; j++) {

                System.out.print("Enter number of sales for month "
                        + (j + 1) + " for " + products[i] + ": ");

                sales[i][j] = input.nextInt();
            }
        }

        Product product = new Product(sales, products);

        // Get calculations
        int totalSales = product.getTotalSales();

        double averageSales = product.getAverageSales();

        int popularIndex = product.getMostPopularProduct();

        int popularSales = product.getProductTotal(popularIndex);

        String popularName = products[popularIndex];

        // Create report object
        PrintProduct report = new PrintProduct();

        // Display report
        report.printReport(totalSales, averageSales,
                popularName, popularSales);

        input.close();
    }
}