import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Fibonacci: " + fibonacci(1));

        Integer[] array = {4, 2, 8, 1, 3, 7, 6, 5};
        List<Integer> arrayList = Arrays.asList(array);
        System.out.println("Quicksort: " + sort(arrayList));
    }

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int n = 0;
    public static List<Integer> sort(List<Integer> arrayList) {
        n += 1;
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        if (arrayList.size() > 1) {
            int pivot = arrayList.get(arrayList.size()/2);
            for (int x : arrayList) {
                if (x < pivot) {
                    less.add(x);
                }
                if (x == pivot) {
                    equal.add(x);
                }
                if (x > pivot) {
                    greater.add(x);
                }
            }

            List<Integer> finalArrayList = new ArrayList<>();
            System.out.print(Integer.toString(n) + ": ");
            System.out.print(less);
            System.out.print(equal);
            System.out.println(greater);
            finalArrayList.addAll(sort(less));

            finalArrayList.addAll(equal);

            System.out.print(Integer.toString(n) + ": ");
            System.out.print(less);
            System.out.print(equal);
            System.out.println(greater);
            finalArrayList.addAll(sort(greater));

            return finalArrayList;
        } else {
            return arrayList;
        }
    }
}
