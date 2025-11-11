import java.util.Scanner;
public class password {
    public static class weakpasswordexception extends Exception{
        public weakpasswordexception(String message){
            super(message);
        }
    }
    public static void validatePassword(String password) throws weakpasswordexception{
        if(password.length()<8){
            throw new weakpasswordexception("password is weak");
        }
        else{
            System.out.println("Password is strong");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String password = sc.nextLine();
        try{
            validatePassword(password);
        }
        catch(weakpasswordexception e){
            System.out.println("Error: "+e.getMessage());
        }
            finally{
            sc.close();
        }
    }
}
