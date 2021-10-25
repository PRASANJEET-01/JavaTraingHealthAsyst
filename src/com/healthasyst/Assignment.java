package com.healthasyst;

import java.util.Iterator;
import java.util.Random;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printPyramid(9);
		//printNatural();
		//reverseArray();
		//factorial(5);
		//isPrime(900);
		makeSentence();
		
	}
	
	
	
	public static void printPyramid(int n) {
		for(int i =0 ;i<n ;i++) {
			for(int j = n-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void printNatural() {
		for(int i=1;i<=50;i++) {
			if(i%3==0 && i%5==0) {
				System.out.print("abcxyz ");
			}
			else if(i%3==0) {
				System.out.print("abc ");
			}
			else if (i%5==0) {
				System.out.print("xyz ");
			}
			else {
				System.out.print(i +" ");
			}
		}
	}
	
	public static void reverseArray() {
		char [] cArr = { 'B', 'U', 'H', 'D', 'I', 'U', 'Q', 'I', 'L' };
		for(int i =cArr.length-1;i>=0;i--) {
			System.out.print(cArr[i]+" ");
		}
	}
	public static void factorial(int n) {
		int fact = 1;
		for(int i = 1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}

	public static void isPrime(int n){
	    String result = "";
		for(int i =2;i<=n;i++)
		{
			int count = 0;
			for(int j =i;j>=1;j--) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				
				//System.out.println(i + " ");
				result += i*i +" ";
			}
			
		}
		
		
		System.out.println((result));
        
    }
	
	public static void makeSentence() {
		String[] article = {"the", "a",  "one", "some"};
		String[] noun = {"boy", "girl", "dog", "town", "car"};
		String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
		String[] preposition = {"to", "from", "over", "under", "on"};
		
		Random rand = new Random();
		
		String sentence = article[rand.nextInt(article.length)]+" "+noun[rand.nextInt(noun.length)]+" "+verb[rand.nextInt(verb.length)]+" "+preposition[rand.nextInt(preposition.length)]+".";
		String first =Character.toString(Character.toUpperCase(sentence.charAt(0)));
		//String updated = sentence.replace(sentence.charAt(0), first.charAt(0));
		//System.out.print(updated);
		System.out.println(sentence);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
