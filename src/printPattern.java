import java.util.*;

public class printPattern {

	public static void main(String[] args) {
		System.out.println("Enter the height of the pyramid");
		Scanner sc = new Scanner(System.in);
		
		int height = sc.nextInt();
		
		for (int i = 1; i <= height; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			
			System.out.println("");
		}
		
	}

}
