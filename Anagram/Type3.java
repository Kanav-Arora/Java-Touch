import java.util.Scanner;
public class Type3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("First word");
		String a = sc.nextLine();
		System.out.println("Second word");
		String b = sc.nextLine();
		Boolean isAnagram = false;
		
		int al[] = new int[256];
		for(char c : a.toCharArray())
		{
			int index = (int) c;
			al[index]++;
		}
		
		for(char d : b.toCharArray())
		{
			int index = (int) d;
			al[index]--;
		}
		
		for(int item : al)
		{
			if(item==0)
			{
				isAnagram = true;
			}
			
			else
			{
				isAnagram = false;
				break;
			}
		}
		
		if(isAnagram==true)
		{
			System.out.println("Is Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}

}
