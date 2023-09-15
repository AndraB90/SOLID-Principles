package exceptionsExample;

public class Example3 {
    public static void main(String[] args) {
        System.out.println("Opening the stream");
        String number = "123a";
        try{
            int convertedNumber = Integer.parseInt(number);
            System.out.println("Java");
        }catch (Exception e){
            e.getMessage();
        }finally {
            System.out.println("Closing the stream");
        }


    }
}
