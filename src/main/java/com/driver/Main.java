package com.driver;
public class Main {
    public static class Product {
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();

        // Task 3: Call the method `product(int x, int y)` from the Product class object p
        int result1 = p.product(5, 10);
        System.out.println("Result 1: " + result1);

        // Task 4: Call the method `product(int x, int y, int z)` from the Product class object p
        int result2 = p.product(2, 3, 4);
        System.out.println("Result 2: " + result2);

        // Task 5: Call the method `product(double x, double y)` from the Product class object p
        double result3 = p.product(2.5, 3.5);
        System.out.println("Result 3: " + result3);
    }
}
