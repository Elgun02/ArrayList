// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayLists arr = new ArrayLists();
        ArrayLists list = new ArrayLists();

        arr.AddRandomNumbers();
        list.AddNonPositiveNumbers();

        System.out.println();
        System.out.println("Выведите все элементы списка, которые больше предыдущего элемента этого же списка. ");
        System.out.println(arr.getArr());
        arr.InOrderMax();
        System.out.println();
        System.out.println();
        System.out.println("Выведите значение наименьшего из всех положительных элементов в списке.");
        System.out.println(list.getList());
        list.InOrderMin();

    }
}