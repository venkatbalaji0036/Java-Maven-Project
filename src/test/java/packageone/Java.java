package packageone;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;



public class Java {
	
	static int Var=10;
	
	static public void main(String args[]) {
		Java obj = new Java();
		System.out.println("This is a print statement in Java and it is in main");
		obj.fbLogin();
		System.out.println("sample print");
		System.out.println(Var);
		
		char ch = 'A';
		boolean flag = true;
		float f = 10.0f;
		System.out.println("======================");
		//Unary Operator
		
		int i=10;
		System.out.println(i++);  //10
		System.out.println(i);  //11
		System.out.println(i--);  //11
		System.out.println(i);  //10
		
		System.out.println(--i);   //9
		System.out.println(i);   //9
		System.out.println(++i);   //10
		System.out.println(i);   //10
		System.out.println("======================");
		
		System.out.println("****************************************");
		
		//101000
		
		//0010=2
		
		System.out.println(i>>2);
		
		
		
		System.out.println("======================");
		
		int j=20;
		
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		
		System.out.println(j/i);
		System.out.println(j%i);
		
		System.out.println("======================");
		
		System.out.println(i==j);   //false
		System.out.println(i!=j);   //true
		
		System.out.println("======================");
		
		//AND   --  &&  -
		//OR    --  ||
		
		int k=20;
		System.out.println(i!=j&&j==k);  //true
		System.out.println(i==j||j!=k);  //false
		
		System.out.println("======================");
		
		//Control statement:
			//Conditional 
			//Looping statement
			
		//simple if statement
		if(i!=j) {
			System.out.println("This is in simple if");
		}
		
		//if-else statement
		if(i==j) {
			System.out.println("in if of if-else");
		}else {
			System.out.println("in else of if-else");
		}
		
		//Nested if
		if(i!=j) {
			System.out.println("This is in condition one");
		}else if(j!=k) {
			System.out.println("This is in condition two");
		}else if(i!=k) {
			System.out.println("This is in condition three");
		}else if(k==j) {
			System.out.println("This is in condition four");
		}else {
			System.out.println("This is in else");
		}
		
		System.out.println("======================");
		
		switch(20) {
		case 10:
			System.out.println("This is the value of i");
			//break;
		case 20:
			System.out.println("This is the value of j and k");
			//break;
		case 30:
			System.out.println("This value is not defined");
			//break;
		default:
			System.out.println("This is the value in default");
			//break;
		}
		
		System.out.println("======================");
		
		//Write a program to print numbers from 10 to 20 where 10 and 20 are inclusive
		//do not print the value of 15
		//do not print values greater than 18
		
		for(int a=10;a<=20;a++) {
			if(a>18) {
				break;
			}else if(a==15){
				continue;
			}else {
				System.out.println(a);
			}
		}
		
		System.out.println("======================");
		
		int b=10;
		while(b<21) {
			if(b>18) {
				break;
			}else if(b!=15) {
				System.out.println(b);
				b++;
			}else {
				b++;
			}
		}
		
		System.out.println("======================");
		
		char[] arr = new char[5];
		arr[0]='A';
		arr[1]='a';
		//arr[2]=13;
		arr[3]='B';
		arr[4]='b';
		//arr[5]=16;
		
		for(int d=0;d<arr.length;d++) {
			System.out.println(arr[d]);
		}
			
		System.out.println("======================");
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		
		ZoneId zid = ZoneId.of("-05:00");
		LocalDateTime datetime1 = LocalDateTime.now(zid);
		System.out.println(datetime1);
		
		System.out.println("======================");
		
		String str1 = new String();
		str1 = "This is a String in java";
		String str2 = "This is another String in java";
		String str3 = " ";
		String str4 = "       This is a string with spaces      ";
		
		System.out.println(str1.charAt(3));   //s
		System.out.println(str2.compareTo(str1));    //int
		
		System.out.println((str1.concat(str3).concat(str2)));  //String
		System.out.println(str1+str3+str2);
		
		System.out.println(str1.contains("string"));  //boolean
		System.out.println(str1.equals(str2));   //
		
		System.out.println(str1.indexOf('s'));  //index  integer
		System.out.println(str1.lastIndexOf('s'));
		
		//System.out.println(str3.isBlank());
		System.out.println(str3.isEmpty());
		
		System.out.println(str1.length());
		System.out.println(str1.replace('s', 'Z'));
		
		//System.out.println(str4.strip());
		//System.out.println(str4.stripLeading());
		//System.out.println(str4.stripTrailing());
		System.out.println(str4.trim());
		
		System.out.println(str1.substring(3, 15));
		
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		System.out.println("============================");
		
		int l=10;
		String m="20";
		
		System.out.println(l+m);  //
		System.out.println(Integer.toString(l)+m);   //1020
		System.out.println(l+Integer.parseInt(m));
		
		System.out.println("============================");
		
		ArrayList<Integer> AL = new ArrayList<Integer>();
		AL.add(11);
		AL.add(12);
		AL.add(13);
		AL.add(14);
		AL.add(15);
		AL.add(16);
		AL.add(13);
		
		System.out.println(AL);
		
		System.out.println(AL.contains(14));  //boolean
		System.out.println(AL.indexOf(13));
		
		System.out.println(AL.isEmpty());
		System.out.println(AL.lastIndexOf(13));  
		
		System.out.println(AL.remove(2));
		System.out.println(AL);
		
		System.out.println(AL.size());
		
		System.out.println(AL.set(3, 20));
		System.out.println(AL);
		
		System.out.println(AL.subList(1, 4));
		System.out.println(AL.get(3));
		
		AL.add(3, 21);
		System.out.println(AL);
		
		System.out.println("===========================");
		
		LinkedList<Integer> LL = new LinkedList<Integer>();
		LL.add(31);
		LL.addAll(AL);
		LL.add(31);
		
		System.out.println(LL);
		
		System.out.println(LL.offer(38));
		System.out.println(LL);
		System.out.println(LL.offerFirst(39));
		System.out.println(LL);
		System.out.println(LL.offerLast(40));
		System.out.println(LL);
		
		System.out.println(LL.removeFirstOccurrence(31));
		System.out.println(LL);
		
		System.out.println(LL.getFirst());
		System.out.println(LL.getLast());
		
		System.out.println(LL.peek());
		System.out.println(LL);
		System.out.println(LL.peekLast());
		System.out.println(LL);
		System.out.println(LL.peekFirst());
		System.out.println(LL);
		
		System.out.println(LL.pop());
		System.out.println(LL);
		
		System.out.println(LL.poll());
		System.out.println(LL);
		System.out.println(LL.pollFirst());
		System.out.println(LL);
		System.out.println(LL.pollLast());
		System.out.println(LL);
		
		LL.addFirst(41);
		System.out.println(LL);
		
		System.out.println(LL.set(3, 42));
		System.out.println(LL);
		
		System.out.println(LL.subList(2, 5));
		
		System.out.println("===================================");
		
		HashSet<Integer> HS = new HashSet<Integer>();
		HS.add(51);
		HS.addAll(LL);
		HS.add(52);
		HS.add(53);
		HS.add(54);
		HS.add(55);
		HS.add(51);
		
		System.out.println(HS);
		System.out.println("======================");
		
		LinkedHashSet<Integer> LHS = new LinkedHashSet<Integer>();
		LHS.add(61);
		LHS.addAll(HS);
		LHS.add(61);
		
		System.out.println(LHS);
		System.out.println("======================");
		
		//TreeSet<Datat Type> Variablename = new TreeSet<Data Type>();
		TreeSet<Integer> TS = new TreeSet<Integer>();
		System.out.println(TS.add(71));
		System.out.println(TS.addAll(LHS));
		System.out.println(TS.add(71));
		
		System.out.println(TS);
		
		System.out.println("======================");
		
		HashMap<Integer, String> HM = new HashMap<Integer, String>();
		HM.put(11, "Usha");
		HM.put(12, "Heena");
		HM.put(13, "Khaleel");
		HM.put(14, "Satish");
		HM.put(15, "Satish");
		HM.put(16, "Java");
		HM.put(17, "Selenium");
		
		System.out.println(HM);
		
		System.out.println(HM.containsKey(12));
		System.out.println(HM.containsValue("Usha"));
		
		System.out.println(HM.isEmpty());
		
		System.out.println(HM.get(13));
		
		System.out.println(HM.remove(14));
		System.out.println(HM);
		
		System.out.println(HM.replace(15, "SeleniumJava"));
		System.out.println(HM);
		
		System.out.println(HM.size());
		System.out.println(HM.keySet());
		
		System.out.println(HM.values());
		System.out.println("============================");
		
		LinkedHashMap<Integer, String> LHM = new LinkedHashMap<Integer, String>();
		LHM.put(21, "String21");
		LHM.putAll(HM);
		
		System.out.println(LHM);
		
		System.out.println("============================");
		
		TreeMap<Integer, String> TM = new TreeMap<Integer, String>();
		TM.put(31, "String31");
		TM.putAll(LHM);
		
		System.out.println(TM);
		
		System.out.println("===*********************=========================");
		
		
		
		String address = "Hyderabad, India";

		//(address.split(",")[1]).trim()
		
		if(address.endsWith("India")) {
			if(address.contains("Ongole")) {
				System.out.println("Your city is Ongole");
			}else if(address.contains("Noida")) {
				System.out.println("Your city is Noida");
			}else {
				System.out.println((address.split(",")[1]).trim());
			}
		}else {
			System.out.println("You are not living in India");
		}
		
		
		
		
		
		
		
		
		/*
		int c=10;
		do {
			if(c>18) {
				break;
			}else if(c!=15) {
				System.out.println(c);
				c++;
			}else {
				c++;
			}
		}while(c<21);
		
		System.out.println("======================");
		
		*/
		
		
		
		
		
		
	}
	
	public void fbLogin() {
		System.out.println("This is a print statement in Java");
		System.out.println(Var);
	}
	
	public void fbLogout() {
		System.out.println(Var);
	}
	
	public void fbLike() {
		
	}
}
