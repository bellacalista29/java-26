public class latihanArrayCopy {
    public static void main(String[] args) {
        char[] data1 = { 'a', 'b', 'c', 'd', 'e' };
        System.out.println(data1);
        // char[] data2 = new char[4];
        char[] data2 = {'i','j','k','l'};
        System.out.println(data2);
        System.arraycopy(data1, 1, data2, 0, 3);
        System.out.println(data2);

    }
}
