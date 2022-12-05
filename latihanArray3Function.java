import java.util.Scanner;

public class latihanArray3Function {
    public static void main(String[] args) {
        int arrayLength;

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah array : ");
        arrayLength = in.nextInt();

        int[] arrayData = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Masukkan data untuk index " + i + " : ");
            arrayData[i] = in.nextInt();
        }

        int max = arrayData[0];
        int indexMax = 0;

        int min = arrayData[0];
        int indexMin = 0;

        for(int j = 0; j < arrayLength; j++)
        {
            if(arrayData[j] > max)
            {
                max = arrayData[j];
                indexMax = j;
            }
            if(arrayData[j] < min)
            {
                min = arrayData[j];
                indexMin = j;
            }
        }
        System.out.println("Data max : " + max + " dengan index : " + indexMax);
        System.out.println("Data min : " + min + " dengan index : " + indexMin);
    }

    public static void displayData(int[] data)
    {
        for(int i=0; i<data.length; i++)
        {
            System.out.println("data untuk index " + i + " : " + data);
        }
    }

    public static int[] getMinMax(int[] data)
    {
        int min = data[0];
        int max = data[0];
        for(int i=0 ; i< data.length; i++)
        {
            if(data[i] < min)
            {
                min = data[i];
            }
            if(data[i] > max)
            {
                max = data[i];
            }
        }
        int[] result = new int[2];
        return result;
    }
}
