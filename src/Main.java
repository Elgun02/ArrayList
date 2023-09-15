// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayLists arr = new ArrayLists();
        ArrayLists list = new ArrayLists();

        arr.AddRandomNumbers();
        System.out.println(arr.getArr());
        arr.InOrderMax();

        System.out.println();

        list.AddNonPositiveNumbers();
        System.out.println(list.getList());
        System.out.println();
        list.InOrderMin();


    }
}