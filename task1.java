//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. 
//Постараться не обращаться к листу по индексам.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> reverse = reverseList(list);
        System.out.println(reverse);
    }
    public static <T> List<T> reverseList(List<T> list) {
        List<T> reverse = new ArrayList<>(list);
        Collections.reverse(reverse);
        return reverse;
    }
}
