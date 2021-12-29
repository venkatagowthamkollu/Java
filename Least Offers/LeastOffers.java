import java.util.*;
public class LeastOffers
{
public static void main (String[] args) {
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
sc.nextLine();
String input[]=new String[n];
String input1[][]=new String[n][3];
for(int i=0;i<n;i++)
{
input[i]=sc.nextLine();
input1[i]=input[i].split(",");
}
int discount[]=new int[n];
for(int i=0;i<n;i++)
{
discount[i]=(Integer.parseInt(input1[i][2])*Integer.parseInt(input1[i][1]))/100;
}
int min_dis=32567;
String output=new String();
for(int i=0;i<n;i++)
{
if(min_dis>discount[i])
{
min_dis=discount[i];
}
}
for(int i=0;i<n;i++)
{
if(discount[i]==min_dis)
{
output=output+input1[i][0]+" ";
}
}
System.out.println(output);
}
}
