import java.util.Scanner;
public class Array_evenodd
{
public static void main(String[] args)
{
 Scanner sc= new Scanner(System.in);
 int int_arr[]=new int[5];

 System.out.println("Enetr the element of an int array");
 for(int i=0;i<int_arr.length;i++)
{
  int_arr[i]=sc.nextInt();
}

for(int j=0;j<int_arr.length;j++)
{
 System.out.println("The value"+j+"index is "+int_arr[j]);

if(j%2==0)
{
System.out.println("Even");
}
else{
System.out.println("odd");
}
}
}
}

