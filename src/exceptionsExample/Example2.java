package exceptionsExample;

import java.util.ArrayList;

public class Example2 {
    public static void main(String[] args) {
        String[] colors = {"red", "white", "blue"};
        try{
            System.out.println(colors[3]);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


        for (int i = 0; i < 10; i++) {
            System.out.println("The program is still running");
        }
    }
}
