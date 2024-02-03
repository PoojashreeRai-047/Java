package ajavpract;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LogicCodes {
	public static void main(String[] args) 
	{
//		BasicChalleges b=new BasicChalleges(); //Java challenge codes
//		Childdd c=new Childdd("uuu","ttt","yyy"); // constructor chaining
//		chil q= new chil(88,"ghjk");
		Outerrcls n=new Outerrcls();
		
		Outerrcls.InrCls.StInr u=new Outerrcls.InrCls.StInr();
		u.stinr();
	//	n.inv();
	}
}

class Outerrcls
{
	private String p="Private";
	String n="normal";
	class InrCls
	{
		void getter()
		{
			System.out.println(p +" got accss");
			System.out.println(n +" got accss");
			
			ing n=new ing();
			n.sinr();
			
			StInr s=new StInr();
			s.stinr();
		}
		private class ing
		{
			void sinr()
			{
				System.out.println("private Inner inside inner class");
			}
		}
		static class StInr
		{
			int g=90;
			void stinr() 
			{
				System.out.println(g+" Static Inner Class");
			}
		}
	}
	
	Outerrcls()
	{
		InrCls nr=new InrCls();
		p="private from Constructor";
		nr.getter(); //calls iner prvate iner class
		
		
	}
	void inv()
	{
		InrCls nr=new InrCls();
		p="in method";
		nr.getter();
	}
	
}



class Gr
{
	Gr(int a)
	{System.out.println(a+"=a From Gr");}
}
class Paren extends Gr
{
	Paren(int b, String c)
	{
		super(b);
	System.out.println(c+"=c From PAren");
	}
}
class chil extends Paren
{
	chil(int d, String e)
	{
		super(d,e);
		System.out.println(d+"=d & "+e+"=e From Chil");
	}
}




class GrandPa 
{
	GrandPa(){System.out.println("From GrandParent Constructor");}
	GrandPa(int a){System.out.println(a+" GrandParent integer");}
}
class Parent extends GrandPa
{
	Parent(){System.out.println("From Parent Constructor");}
	Parent(int x,String b){ super(x); System.out.println(b+" Parent String");}
}
class Childdd extends Parent
{
	String s="jjj";
	Childdd(){System.out.println("From Child Constructor");}
	Childdd(int e, String d){super(e,d); System.out.println(e+" Child int"); }
	Childdd(String s, String q){ s=this.s; System.out.println(s+" Child 2 Strings"+q); }
	
	Childdd(String r,String s,String t)
	{
		this(s,t);
		System.out.println(r+" child of 3 strings");
	}
}



class BasicChalleges
{
	BasicChalleges()
	{
		DupsString("ppoopopo");
		
		int arr[]= {3,5,6,89,67,345,123};
		SecondHighest(arr);
		
		//Palindromes
		numpal(45676543);strPal("qwertyuytrewqe");
		
		CharOcc("iiiopoiuiojjjjhgfttt");
		aNA("gogoagone","anegggooo");
		
	}
	
	
	void aNA(String s1,String s2)
	{
		String a;
		char[] c1= s1.toCharArray();
		char[] c2= s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		a=Arrays.equals(c1, c2)?"an Anagram": "Not an Anagram";
		System.out.println(s1+" and "+s2+" are "+a);
	}
	
	void CharOcc(String str)
	{
		Map<Character,Integer> gm=new HashMap();
		
		for(char c:str.toCharArray())
		{
			gm.put(c, gm.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<Character, Integer> e:gm.entrySet())
		{
			System.out.print(e.getKey()+" : "+e.getValue()+"--    ");
		}
	}
	
	void strPal(String str)
	{
		String rev="",p;
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		p=str.equals(rev)?"Palindrome":"Not A Palindrome";
		System.out.println(rev+" is "+p);
		
	}
	
	void numpal(int n)
	{
		String p;
		int check=n,comput=n,res=0,rem;
		
		while(comput>0) 
		{
			rem=comput%10;
			res=(res*10)+rem;
			comput=comput/10;
		}	
		p=check==res? "Palindrome": "Not a Palindrome";
		System.out.println(n+" is "+p);
	}
	
	void DupsString(String str)
	{
		char[] c=str.toCharArray();
		int count=0;
		
		for(int i=0;i<c.length;i++) 
		{
			for(int j=i+1;j<c.length;j++) 
			{
				if(c[i]==c[j]) 
				{
					count++;
					}
			}
			if(count>1)
			{
				System.out.println(c[i]+"@"+i+" repeated "+ count+" times");
			}
		}
	}
	
	void SecondHighest(int a[]) 
	{
		int l=a.length;
		Arrays.sort(a);
		System.out.println("Second Highest Number in array: "+a[l-2]);
		System.out.println("Highest Number in array: "+a[l-1]);
	}
	
}


