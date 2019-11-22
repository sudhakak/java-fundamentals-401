public class Arrayreverse2{

public static void main(String[] args)
{
int [] arrayIn = {1, 2, 3, 4, 5, 6};
reverseArray(arrayIn);
}

static void reverseArray(int a[])
{
int n = a.length;
int j = n;
int b[] = new int [n];

 for (int i = 0; i<n; i++)
 {
     b[j-1] = a[i];
     j = j-1;
 }

System.out.println("Reversed arry is: \n");
for (int k = 0; k < n; k++)
{
    System.out.println(b[k]);
}

}

}