import java.util.Scanner;
public class AnagramProject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type first word");
		String a = sc.nextLine();
		System.out.println("Type second word");
		String b = sc.nextLine();
		Boolean isAnagram = false;
		Boolean visited[] = new Boolean[b.length()];
		for(int i =0; i<b.length(); i++)
		{
			visited[i] = false;
		}
		if(a.length()==b.length())
		{
			
			for(int i=0; i<a.length(); i++)
			{
				
				char leta = a.charAt(i);
				isAnagram=false;
				for(int j =0; j<a.length(); j++)
				{
				 
				 
				 if( b.charAt(j) == leta && visited[j] == false)
				 {
					 visited[j] = true;
					 isAnagram = true;
					 break;
				 }
				 
				}
				if(isAnagram==false)
				{
					break;
				}
				
			}
			
			if(isAnagram == true)
			{
				System.out.println("Is anagram");
			}
			
			else
			{
				System.out.println("Not anagram");
			}
		}
		
		else
		{
			System.out.println("Not anagram");
		}
		

	}

}
