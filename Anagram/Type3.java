import java.util.Scanner;
public class Type3 {

	public static void main(String[] args) {
		/*
		In this approach we will set the number of repetition of a character in an array. For example for 
		aab, a-2 and b-1. Now other string will be sorted characterwise using for each loop and the index
		will be decreased by one. After last execution if the value of all chars of first array is 0, they
		are anagrams.
		*/
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
