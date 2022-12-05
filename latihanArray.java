import java.util.Scanner;

public class latihanArray {
    public static void main(String[] args) {
        int[] contoh = new int[4];
        contoh[0] = 1;
        contoh[1] = 2;
        contoh[2] = 3;
        contoh[3] = contoh[2] + 2;
        System.out.println(contoh[2]);
        System.out.println(contoh[3]);

        double[] arrayDouble = new double[2];
        arrayDouble[0] = 1.0;
        arrayDouble[1] = 2.0;
        System.out.println(arrayDouble[0]);
        System.out.println(arrayDouble[1]);

        for (int i = 0; i < contoh.length; i++) {
            System.out.println("data index : " + i + " value : " + contoh[i]);
        }

        int i = 0;
        for (int nilai : contoh) {
            System.out.println("data2 index : " + i++ + " value : " + nilai);
        }

        Scanner input = new Scanner(System.in);
        for (int j = 0; j < contoh.length; j++) {
            System.out.print("Masukkan data untuk index " + j + " : ");
            contoh[j] = input.nextInt();
        }
        for(int k = 0; k < contoh.length; k++)
        {
            System.out.println("data index : " + i + " value : " + contoh[k]);
        }
        System.out.println(contoh);
        char[] charData = {'c','i','m','b'};
        System.out.println(charData);
    }
}
