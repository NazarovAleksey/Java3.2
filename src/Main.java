public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int enrolled = 1001;
        int result;
            if (enrolled > 1000) {
                result = enrolled + (enrolled / 100) + amount;
            }
            else {
                result = enrolled + amount;
            }

        System.out.println(result);
    }
}
