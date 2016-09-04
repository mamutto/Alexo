public class Calculate {
    public static void main(String[] args) {
        double first = 10.3;
        int second = (int) ( 10 - first);
        short third = (short) (first * second);
        int four = (int) (first / second);
        double five = Math.pow(first,2);
        System.out.println("1+2 " + first + second);
        System.out.println("1-2 " + second);
        System.out.println("1*2 " + third );
        System.out.println("1/2 " + four);
        System.out.println("1 in pow " + five);
    }
}
