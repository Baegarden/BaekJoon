import java.util.Scanner;

// Baekjoon 1065 : ÇÑ¼ö
public class Main {
	
	public static void Hansu(int n)
	{
		int a, b, c;
		int sum = 0;
		
		for(int i = 1; i <= n; i++)
		{
			a = i / 100;
			b = (i % 100) / 10;
			c = i % 10;
			if(i < 100)
				sum++;
			else
			{
				if((b - a) == (c - b))
					sum++;
			}
		}
		System.out.print(sum);	
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		Hansu(num);
	}
		
}

