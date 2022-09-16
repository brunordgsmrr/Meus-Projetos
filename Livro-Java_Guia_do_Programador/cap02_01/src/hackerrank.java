import java.util.Scanner;

public class hackerrank {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			int result = 0 + a;
			int serie = 1;
			for (int cont = 0; cont < n; cont++) {
				result += (serie * b);
				serie *= 2;
				System.out.print(result + " ");
			}
		}
		in.close();
	}

}
