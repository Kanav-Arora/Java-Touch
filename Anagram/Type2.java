package Anagram;

import java.util.Scanner;
public class Type2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type first word");
		String a = sc.nextLine();
		System.out.println("Type second word");
		String b = sc.nextLine();
		Boolean isAnagram = false;
		int al[] = new int[256];
		int bl[] = new int[256];
		
		for(char c: a.toCharArray())
		{
			int index = (int) c;
			al[index] ++;			
		}
		
		for(char d: b.toCharArray())
		{
			int index = (int) d;
			bl[index]++;
		}
		
		for(int i=0; i<256; i++)
		{
			if(al[i]!=bl[i])
			{
				isAnagram = false;
				break;
			}
			
			else
			{
				isAnagram = true;
			}
		}
		
		if(!isAnagram)
		{
			System.out.println("Not Anagram");
			
		}
		
		else
		{
			System.out.println("Is Anagram");
		}
	}
}
