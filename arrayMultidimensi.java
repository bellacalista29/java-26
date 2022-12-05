public class arrayMultidimensi {
    public static void main(String[] args) {
        String[][] framework = {
                { "Java", "Kotlin" },
                { "React", "ReactJs" },
                { "Php", "Laravel" }
        };
        //cara pertama
        for (int i = 0; i < framework.length; i++) {
            for (String data : framework[i]) {
                System.out.print(data + " ");
            }
            System.out.println();
        }
        //cara kedua
        for (int i = 0; i < framework.length; i++) {
            for (int j = 0; j < framework[i].length; j++) {
                System.out.print(framework[i][j] + " ");
            }
            System.out.println();
        }
        System.arraycopy(framework[0], 0, framework[2], 1, 1);
        for (int i = 0; i < framework.length; i++) {
            for (int j = 0; j < framework[i].length; j++) {
                System.out.print(framework[i][j] + " ");
            }
            System.out.println();
        }
    }
}
