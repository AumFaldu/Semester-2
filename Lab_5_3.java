import java.util.Scanner;
public class Lab_5_3
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		Count_vowel count = new Count_vowel(s);

	}
}
class Count_vowel{
	String s;
	int count_a=0;
	int count_e=0;
	int count_i=0;
	int count_o=0;
	int count_u=0;
	Count_vowel(String s)
	{
		this.s = s;
		this.count_a;
		this.count_e;
		this.count_i;
		this.count_o;
		this.count_u;
		for(int count=0;count<s.length();count++)
		{
			if(s.charAt(i)=="a"||s.charAt(i)=="A")
			{
				count_a++;
			}
			if(s.charAt(i)=="e"||s.charAt(i)=="E")
			{
				count_e++;
			}
			if(s.charAt(i)=="i"||s.charAt(i)=="I")
			{
				count_i++;
			}
			if(s.charAt(i)=="o"||s.charAt(i)=="O")
			{
				count_o++;
			}
			if(s.charAt(i)=="u"||s.charAt(i)=="U")
			{
				count_u++;
			}
		}
		return count;
		return count_a;
		return count_e;
        return count_i;
		return count_o;
		return count_u;
	}
}	