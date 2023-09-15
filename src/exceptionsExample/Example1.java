package exceptionsExample;

public class Example1 {
    public static void main(String[] args) {
        int a = 7;
        try{
            System.out.println(a / 0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("The program is still running");
        }
    }
}
