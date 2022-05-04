public class Casting {
    public static void main(String[] args) {
        double num = 112.35;
        System.out.println("Double: " + num);
        int data = (int)num;
        System.out.println("Int: " + data);
        String num2 = "49";
        System.out.println("The string value is: " + num2);
        int data1 = Integer.parseInt(num2);
        System.out.println("The integer value is: " + data1);
    }
}