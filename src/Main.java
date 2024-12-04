public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int [] arr1 = new int [3];

        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        double [] arr2 = {1.57, 7.654, 9.986};

        int [] arr3 = {1, 100, 200};

        System.out.println("Задание 2");

        for (int i = 0; i < arr1.length - 1; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.print(arr1[arr1.length - 1]);
        System.out.println();

        for (int i = 0; i < arr2.length - 1; i++) {
            System.out.print(arr2[i] + ", ");
        }
        System.out.print(arr2[arr2.length - 1]);
        System.out.println();

        for (int i = 0; i < arr3.length - 1; i++) {
            System.out.print(arr3[i] + ", ");
        }
        System.out.print(arr3[arr3.length - 1]);

    }
}