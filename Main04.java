import java.util.LinkedList;
import java.util.List;

public class Main04 {

    /*
    Write a method called partition that accepts a list of integers and an integer value E as its parameter, and
    rearranges (partitions) the list so that all the elements with values less than E occur before all elements with
    values greater than E . The exact order of the elements is unimportant, so long as all elements less than E appear
    before all elements greater than E . For example, for the linked list [15, 1, 6, 12, –3, 4, 8, 21, 2, 30, –1, 9] ,
    one acceptable ordering of the list after a call of partition(list, 5) would be
    [–1, 1, 2, 4, –3, 12, 8, 21, 6, 30, 15, 9] . You may assume that the list contains no duplicates and does not
    contain the element value E .
     */

    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        a.add(13);
        a.add(-18);
        a.add(-7);
        a.add(-13);
        a.add(-19);
        a.add(20);
        a.add(9);
        a.add(6);
        a.add(-3);
        a.add(-5);
        System.out.println(a);
        partition(a,7);
        System.out.println(a);
    }

    public static void partition(LinkedList<Integer> list, int e) {
        LinkedList<Integer> tempList = new LinkedList<>(list);

        while (!list.isEmpty()) {
            list.remove(0);
        }

        for (int i = 0; i < tempList.size(); i++) {
            if (tempList.get(i) < e) {
                list.add(tempList.get(i));
            }
        }
        for (int i = 0; i < tempList.size(); i++) {
            if (tempList.get(i) > e) {
                list.add(tempList.get(i));
            }
        }
    }
}
