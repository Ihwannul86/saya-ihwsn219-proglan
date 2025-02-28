package org.example;

import java.util.Scanner;

public class ShoppingCalculator2 {

    //refactor introduce constants
    // Prices for food items
    public static final int MIE_INSTAN_PRICE = 5000;
    public static final int AYAM_KRISPI_PRICE = 10000;
    public static final int BAKSO_PRICE = 15000;

    // Prices for drink items
    public static final int TEH_MANIS_PRICE = 5000;
    public static final int COKLAT_MILK_PRICE = 10000;
    public static final int VANILA_MILK_PRICE = 8000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for food selection
        System.out.println("Pilih makanan:");
        System.out.println("1. Mie Instan = Rp. 5000");
        System.out.println("2. Ayam Krispi = Rp. 10000");
        System.out.println("3. Bakso = Rp. 15000");
        System.out.print("Masukkan pilihan (1/2/3): ");
        int foodChoice = scanner.nextInt();
        System.out.print("Masukkan jumlah porsi makanan: ");
        int foodQuantity = scanner.nextInt();

        // Calculate food cost
        int foodTotal = 0;
        switch (foodChoice) {
            case 1:
                foodTotal = MIE_INSTAN_PRICE * foodQuantity;
                break;
            case 2:
                foodTotal = AYAM_KRISPI_PRICE * foodQuantity;
                break;
            case 3:
                foodTotal = BAKSO_PRICE * foodQuantity;
                break;
            default:
                System.out.println("Pilihan makanan tidak valid.");
                return;
        }

        // Input for drink selection
        System.out.println("Pilih minuman:");
        System.out.println("1. Teh Manis = Rp. 5000");
        System.out.println("2. Coklat Milk = Rp. 10000");
        System.out.println("3. Vanila Milk = Rp. 8000");
        System.out.print("Masukkan pilihan (1/2/3): ");
        int drinkChoice = scanner.nextInt();
        System.out.print("Masukkan jumlah porsi minuman: ");
        int drinkQuantity = scanner.nextInt();

        // Calculate drink cost
        int drinkTotal = 0;
        switch (drinkChoice) {
            case 1:
                drinkTotal = TEH_MANIS_PRICE * drinkQuantity;
                break;
            case 2:
                drinkTotal = COKLAT_MILK_PRICE * drinkQuantity;
                break;
            case 3:
                drinkTotal = VANILA_MILK_PRICE * drinkQuantity;
                break;
            default:
                System.out.println("Pilihan minuman tidak valid.");
                return;
        }

        // Calculate total cost
        int totalCost = foodTotal + drinkTotal;

        // Apply discount if total is 100,000 or more
        if (totalCost >= 100000) {
            System.out.println("Anda mendapatkan diskon 10%!");
            totalCost *= 0.9; // Apply 10% discount
        }

        // Display total costs
        System.out.println("Total belanja makanan: Rp. " + getFoodTotal(foodTotal));
        System.out.println("Total belanja minuman: Rp. " + getDrinkTotal(drinkTotal));
        System.out.println("Total keseluruhan: Rp. " + getTotalCost(totalCost));
    }

    // Extract method to calculate drink total
    private static int getDrinkTotal(int drinkTotal) {
        return drinkTotal;
    }

    // Extract method to calculate food total
    private static int getFoodTotal(int foodTotal) {
        return foodTotal;
    }

    // Extract method to calculate total cost
    private static int getTotalCost(int totalCost) {
        return totalCost;
    }
}