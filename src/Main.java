import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задаем массив случайных чисел в диапазоне от 100_000 до 200_000
        int[] randomArray = new int[30];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 100_000) + 100_000;
            System.out.println(randomArray[i]);
        }

        //Задание №1 - сумма выплат за месяц
        int paymentAmount = 0;
        for (int i = 0; i < randomArray.length; i++) {
            paymentAmount = paymentAmount + randomArray[i];
        }
        System.out.println("Сумма трат за месяц составила " + paymentAmount + " рублей");

        //Задание №2 - минимальная и максимальная трата за день
        int min = randomArray[0];
        int max = randomArray[0];
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] < min) {
                min = randomArray[i];
            }
            if (randomArray[i] > max) {
                max = randomArray[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");

        //Задание №3 - средняя сумма трат за 30 дней
        double averageAmount = (double) paymentAmount / randomArray.length;
        System.out.println("Средняя сумма трат составила " + averageAmount + " рублей");

        //Задание №4 - реверс массива char
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

        //Задание №5 - матрица 3*3 с единицами по диагонали
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ((i + j) % 2 == 0) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        //Задание №6 - реверс массива с использованием дополнительного массива
        int[] reverseArray = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(reverseArray));
        int[] array = new int[reverseArray.length];
        for (int i = 0; i < reverseArray.length; i++) {
            array[i] = reverseArray[reverseArray.length - i - 1];
        }
        System.out.println(Arrays.toString(array));

        //Задание №7 - реверс массива int, без дополнительного массива
        int[] five = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(five));
        for (int i = five.length-1;i>=0; i--) {
            System.out.print(five[i]);
        }
            System.out.println();

        //Задание №8 - найти два числа сумма которых равна -2, напечатать в консоль
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - i - 1; j >= 0; j--) {
                if (arr[i] + arr[j] == -2) {
                    System.out.println(arr[i] + " " + arr[j]);

                }
                break;
            }
        }

            //Задание №9 - найти все числа сумма которых равна -2,напечатать в консоль
            int[] justArray = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
            for (int i = 0; i < justArray.length; i++) {
                for (int j = i + 1; j < justArray.length - i; j++) {
                    if (justArray[i] + justArray[j] == -2) {
                        System.out.println(justArray[i] + " " + justArray[j]);
                    }
                }
            }

            int[] nekiyArr = {5, 4, 3, 2, 1};
            System.out.println(Arrays.toString(nekiyArr));
            int[] vazniyArr = new int[nekiyArr.length];
            for (int i = 0; i < nekiyArr.length; i++) {
                vazniyArr[i] = nekiyArr[nekiyArr.length - i - 1];
            }
            System.out.println(Arrays.toString(vazniyArr));


        }
    }
















































