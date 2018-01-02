import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int a,b;
		System.out.println("두 수를 입력해주세요.: ");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		System.out.println(a+b);
		scanner.close();
	}
}