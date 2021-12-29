import java.util.*;
public class FuelConsumption{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of liters to fill the tank");
float l=sc.nextInt();
if(l<0)
{
System.out.println((int)l+" is an Invalid Input");
System.exit(0);
}
System.out.println("Enter the distance covered");
float d=sc.nextInt();
if(d<0)
{
System.out.println((int)d+" is an Invalid Input");
}
else{
float c=(l/d)*100;
double m=d*0.6214;
double g=l*0.2642;
double e=m/g;
System.out.printf("Liters/100KM \n%.2f\n",c);
System.out.printf("Miles/gallon \n%.2f",e);
}
}
} 
