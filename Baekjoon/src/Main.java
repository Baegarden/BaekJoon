import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

// Baekjoon 4673 : �����ѹ�
public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		int n, m;
		for(int i = 1; i <= 10000; i++)
		{
			int flag = 0;
			n = i;
			for(int j = 1; j < i; j++) 
			{
				m = j;	
				m = m + (m / 1000) + ((m % 1000)/100) + ((m % 100)/10) + (m % 10);  
				if(n == m)
					flag = 1;										
			}
			if(flag == 0) 
				bw.write(n + "\n");
		}
		bw.flush();
		bw.close();
	}
}

