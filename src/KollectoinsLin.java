import java.util.LinkedList;

public class KollectoinsLin {
    public static void main(String[] args) {
        LinkedList<Float> numbers = new LinkedList<>();
        numbers.add(5.6f);
        numbers.add(15.26f);
        numbers.add(5.64356f);

        for (Float el : numbers)
        System.out.println(el);
    }
}
