package ajavpract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class InterviewPrepJavaCodes 
{

	public static void main(String[] args) 
	{
		Palindrome p = new Palindrome();
		p.IsPalindrome("MADAM");
		p.isnumPalidrome(4908);
		p.secondLargestnumber();
		p.duplicateString();
		//p.stringINTmethods();
		p.Occurence("abcddbce");
		
		System.out.println("::Student Details::");
		ConstrChaning c=new ConstrChaning("Pune",123456,10,6);
		
		DD d=new DD(9,"k");
		
		
		String s1="adamada", s="aaaaddm", s2="kokokok";
		System.out.println("***String Anagram and Palindrome***");
		anaPAL a= new anaPAL(s1,s);
		
		String s1p=a.isPal(s1)?" is PAlindrome":" is Not Palindrome";
		System.out.println(s1+s1p);
		String s2p=a.isPal(s2)?" is PAlindrome":" is Not Palindrome";
		System.out.println(s2+s2p);
		String sp=a.isPal(s)?" is PAlindrome":" is Not Palindrome";
		System.out.println(s+s1p);
		
		jj j=new jj(); j.m();
		
		sss q1=new sss();
		sss q2=new sss();
		sss q3=new sss();
		// non static 1 1 1
		// static     1 2 3
		// only mmry allocation is given
		
		System.out.println("************Collections*********");
		p.CollecMethods();
		
		//
		
		System.out.println("************Innerclasses*********");
		Outr ot=new Outr();
		ot.dem();
		Outr.Inr in=ot.new Inr();
		in.u=5;
		
		LT l=new LT();
		l.CharOcc("ertyuioertyuiertyui");
		l.Numpalindrome(78987);
		
	}
}
class Palindrome
{   // INT: 535, 121, 56765, 8907098. STRING: LOL, MADAM 
	// data is remains same even after reversing it
	
	Palindrome()
	{ 
		System.out.println(" 56765  LOL, MADAM");
	}
	void Occurence(String str)
	{
		Map<Character, Integer> Occ=new HashMap();
		
		// adding String's charArray to Map with k&V 
		for(char c:str.toCharArray())
		{
			Occ.put(c, Occ.getOrDefault(c, 0)+1);
		}
		//print occurence
		System.out.println("::::::::::Character Occurence::::::::::::");
		for(Map.Entry<Character, Integer> entry: Occ.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
	
	void IsPalindrome(String data)
	{
		String rev_data="",origData=data;
		
		for(int i=origData.length()-1;i>=0;i--) 
			// normal loop,   i=0,      i<=0; i++
			// reverese loop, i=index-1, i>0, i--
		{
			rev_data= rev_data+origData.charAt(i);
		}
		if(origData.equals(rev_data))
		{ System.out.println(data + " It is Palindrome") ;}
		else
		{System.out.println(data + " It is not Palindrome");}
		
	}
	void isnumPalidrome(int n)
	{
		int res=0,temp,rem;		
		//store n in temp
		temp=n;
		
		while(n>0) 
		{
		// get remainder, add to res
		rem=n%10;
		res=(res*10) +rem;
		
		//remove the remaider form n
		n=n/10; //456>> 45>>4>>0
		}
			
		if(temp==res)
		{System.out.println(temp+" is palindrome");}
		else
		{System.out.println(temp+" is not palindrome");}
	}
	
	void secondLargestnumber()
	{
		int arr[]= {333,55,777,8,768,100};
		int len=arr.length;
		
		Arrays.sort(arr);
		System.out.println("Second highest"+arr[len-2]);
		System.out.println("Highest"+arr[len-1]);
		
	}

	void duplicateString() 
	{
		String s1="abcedfghijklmnopqrsthunwxyz";
		char s2[]=s1.toCharArray();
				
		int cout=0;
		//iterate with string every element with every 
		for(int i=0; i<=s2.length;i++)
		{ // i iterates s1
			
			for(int j=i+1;j<s2.length;j++) 
			{
				// compare every i char with j char in s1
			   if(s2[i]==s2[j])
			   { cout++; System.out.println(s2[j]+" @ "+j); }
			}
		}
		   System.out.println("No.of Duplicates:"+cout);
	}
	
	
	
	
	//void stringINTmethods()
	{}
	void CollecMethods()
	{	
		// iterable>> collections>>List,Queue,Set LAPH>> LinkedList, ArrayList, PriorityQueue, HashSet
		// Set Not accepts duplicates
		ArrayList a = new ArrayList();
		for(int i=0;i<10;i++) 
		{a.add(i);}
		System.out.println("Size of List: "+a.size()+"\na="+a);
		//Size of List: 10
		//i=[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		System.out.println(a.clone());
		
		Object b = new ArrayList();
		b=a.clone();
		a.clear(); // returns empty list
		System.out.println("a="+a+"\nb="+b);
		
		//a.add(b);
		a.add("s1");
		System.out.println("a=");
		
		
	}

}




class AA
{
	AA(){System.out.println("AAclasss");}
	AA(int a,int b){System.out.println(a+b);}
	
}
class BB extends AA
{ 
	BB(){System.out.println("BBclass");}
	BB(int a,int b){super(a,b);}
}
class DD extends BB
{ 
	DD(int a,String b)
	{
		super(9,10);
		System.out.println(a+b);}
}


class CC
{ 
	String ChildName,FNAME;	
	CC(String name, String Fname)
	{
		
		ChildName = name; FNAME=Fname;
		System.out.println("StudentName: "+ChildName+"\nFather_name :"+FNAME);
	}
}

class ConstrChaning extends CC
{
	String Gender,Area;
	int Student_Age,Class,RollNo,Area_Pin;

	ConstrChaning(int roll, String gender)
	{
		super("Arun","Varun");
		RollNo=roll; Gender=gender;
		System.out.println("Rollnumber: "+RollNo+"\nGender: "+Gender);
	}
	ConstrChaning(String addre, int pincode,int age,int Std)
	{
		this(23,"F");
	
		Area=addre; Area_Pin=pincode;
		System.out.println("Area: "+Area+"\nPincode: "+Area_Pin);
		Student_Age=age; Class=Std;
		System.out.println("Student Age: "+Student_Age+"\nClass:"+Class);
	}
	
}
class anaPAL
{
	String s1,s2;
	anaPAL(String pal)
	{
		s1=pal;
		if(isPal(s1)==true) 
		{
			System.out.println(s1+"is Palindrome");
		}
		else 
		{
			System.out.println(s1+"is not Palindrome");
		}
	}
	anaPAL(String Ana1, String ANA2)
	{
		String s1=Ana1,s2=ANA2;
		if(isAna(s1,s2)==true && isPal(s1)==true) 
		{
			System.out.println(s1+" and "+s2+" are Anagram And Palindrome");
		}
		else 
		{
			if(isAna(s1,s2)==true) 
			{
				System.out.println(s1+" and "+s2+" are An Anagram only");
			}
			else 
			{
				if(isPal(s1)==true)
				{System.out.println(s1+"is Palindrome only ");}
				else
				{
					System.out.println(s1+"and"+s2+"are NOT Anagram And Palindrome");
				}
			}
			
		}
	}

	boolean isPal(String p)
	{ s1=p;
	String rev=new StringBuilder(s1.toLowerCase()).reverse().toString();
		
		return s1.equalsIgnoreCase(rev);
	}
	boolean isAna(String a1, String a2)
	{
		s1=a1;s2=a2;
		char[] ar1=s1.toCharArray();
		char[] ar2=s2.toCharArray();
		Arrays.sort(ar1); 
		Arrays.sort(ar2);
		
		return Arrays.equals(ar1, ar2);
	}

}

class hh 
{
	String a="Parent HHHH";	
}
class jj extends hh
{
	String a="Child JJJJ";
	void m()
	{
		System.out.println(a); // bydefault current class instance 
		System.out.println(this.a); //explicit calling current class instance
		System.out.println(super.a); // calling immediate super class instances
		
	}
}

class sss
{
	static int a=0;
	
	sss() {a++;System.out.println(a);}
}





class Outr
{
	private int s;
	class Inr
	{
		private static int x;
		int u;
		//Inr(int y){s=y;System.out.println("Inr Constructor");}
		void setmt(int x){s=x;}
		int getmt() {return s;}
		void sho() {System.out.println(s+" "+x);}		
	}
	void dem()
	{
		Inr nr=new Inr();
		nr.x=3;
		nr.sho();
	}	
}

class LT
{
	void CharOcc(String str)
	{
		Map<Character,Integer> Occ=new HashMap();
		
		for(char c:str.toCharArray())
		{
			Occ.put(c,Occ.getOrDefault(c,0)+1);
		}
		
		System.out.println(":::::::CharOcc::::::\n"+Occ);
		for(Map.Entry<Character, Integer> e:Occ.entrySet())
		{
			System.out.println(e.getKey()+":"+e.getValue());
		}
	}
	
	
	void Numpalindrome(int num)
	{
		int c=num,ch=num,res=0,rem;
		while(c>0) 
		{
			rem=c%10;
			c=c/10;
			res=(res*10)+rem;
		}
		if(ch==res)
		{System.out.println(res+" Is Palindrome");}
		else {System.out.println(res+" Is Not Palindrome");}
		 
	}
}
