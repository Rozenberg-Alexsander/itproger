public class Main {
    public static void main(String[] args) {
        int a = 15, b = 20;
        char sym1 = 'A', sym2 = 'A';
        boolean isHasCar = true;
        if (isHasCar || a == b || sym1 != sym2) {
            System.out.println("Верно");
        } else if (a >= b) {
            System.out.println("2 test");
        } else if (a > b) {
            System.out.println("3 test");
        }else if (a <= b) {
            System.out.println("4 test");
        }else if (a == b) {
            System.out.println("5 test");
        }else {
            System.out.println("Не верно");
        }
    }
}
