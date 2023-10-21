
public class Main {

    public static void main(String[] args) {

        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) - 50;
        }

        int sumPlas = 0;
        int sumMinus = 0;
        int minus = 0;
        int plas = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sumPlas += arr[i];
                plas++;
            } else if (arr[i] < 0) {
                sumMinus += arr[i];
                minus++;
            }
        }
        System.out.println("Положительных чисел : " + plas);
        System.out.println("Отрицательных чисел : " + minus);
        System.out.println("Сумма положительных чисел = " + sumPlas);
        System.out.println("Сумма отрицательных чисел = " + sumMinus);

        int sumOfMassive = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfMassive += arr[i];
        }
        System.out.println("Среднее по массиву = " + (double) sumOfMassive / arr.length);

    }
}
