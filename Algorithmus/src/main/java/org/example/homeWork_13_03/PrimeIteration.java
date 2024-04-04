package org.example.homeWork_13_03;
// 2. Написать проверку числа "простое" ли оно, используя итерационный подход. (не рекурсия)
public class PrimeIteration {
    public static void main(String[] args) {
        // System.out.println(isPrime(7));
        System.out.println(isPrime(10));
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
