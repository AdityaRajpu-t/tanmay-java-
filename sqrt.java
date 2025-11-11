import java.util.Scanner;
public class sqrt {
    int number;

    static class negativenumberexception extends Exception{
        public negativenumberexception(String message){
            super(message);
        }
    }
    public static void validatesqrt(int number) throws negativenumberexception{
        if(number<0){
            throw new negativenumberexception("number can't be negative");
        }
        else{
            System.out.println("square root of "+number+ " is "+Math.sqrt(number));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        try{
            validatesqrt(number);
        }
        catch(negativenumberexception e){
            System.out.println("Error: "+e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}
