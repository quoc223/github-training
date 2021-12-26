import java.util.Scanner;
public class B1 {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.print("Nhap vao 10 so nguyen");
		n=sc.nextInt();
		}while (n<0);
	int	array[]=new int[n];
	System.out.println("Nhap phan tu vao mang");
	for (int i=0;i<n;i++) 
	{
System.out.print("Nhap phan tu thu "+i+":");
array[i] =sc.nextInt();
	}
	System.out.print("Day so nguyen:");
	for (int i = 0; i < n; i++) {
        System.out.print(array[i] + "\t");
		sc.close();
	}
	}

}
