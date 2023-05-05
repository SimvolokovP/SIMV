package ex37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EveryThird {

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        List<Integer> list2= new ArrayList<>(List.of());
        System.out.println(game(list, 3, list2));
    }

    public static List<Integer> game(List<Integer> list, int count, List<Integer> list2) {

        if (list.size() == 0) {
            return list;
        }

        if (count > list.size())
            return game(list, count - list.size(), list2);


        list2.add(list.get(count - 1));
        System.out.print(list + " " + (list.get(count - 1) + " is counted out and goes into the result " ) + list2 + "\n");
        list.remove(count - 1);
        return game(list, 3 + count - 1, list2);
    }
}