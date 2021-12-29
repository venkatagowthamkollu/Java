import java.util.*;
public class StringConcatenation
{
 public static void main(String args[])
 {
 String str1,str2;
 Scanner sc = new Scanner(System.in);
 System.out.println("Inmate's name:");
 str1=sc.nextLine();
 System.out.println("Inmate's father's name:");
 str2=sc.nextLine();
   String str3=str1.concat(" ").concat(str2);
   char []chars=str3.toCharArray();
   for(char c:chars)
   {
       if(Character.isDigit(c)||c=='+'||c=='!'||c=='@'||c=='#'||c=='$'||c=='%'||c=='^'||c=='&'||c=='*')
       {
           System.out.println("Invalid name");
           System.exit(0);
       }
   }
   System.out.println(str3.toUpperCase());
 }
}              
