import java.util.Scanner;
public class passwordStrengthChecker{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your password:");
        String password=sc.nextLine();
        sc.close();
        String strength=checkStrength(password);
        System.out.println("Password Strength:"+strength);
    }
    public static String checkStrength(String password)
    {
       int length=password.length();
       boolean hasUpper=false,hasLower=false,hasDigit=false,hasSpecial=false;
       for(char ch:password.toCharArray()){
        if(Character.isUpperCase(ch))
             hasUpper=true;
        else if(Character.isLowerCase(ch))
             hasLower=true;
        else if(Character.isDigit(ch))
             hasDigit=true;
        else 
             hasSpecial=true;
       }
       if(length>=8 && hasUpper && hasLower && hasDigit && hasSpecial)
            return "Strong";
       else if(length>=6 && (hasUpper&& hasLower)||(hasLower&& hasDigit)||(hasUpper&& hasDigit))
            return "Medium";
       else 
            return "Weak";
    }
}