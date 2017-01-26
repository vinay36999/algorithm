package Anagram;

public class Anagrams {

	
	public static void main(String[] args){
		StringBuilder word = new StringBuilder("abcdefghijklmno");
		StringBuilder anotherWord = new StringBuilder("onmlkjihgfedcba");

		//int length = anotherWord.length();
		if(word.toString().length()==anotherWord.length()){
							for(int i=0;anotherWord.length()!=0;){
								
								if(word.toString().contains(""+anotherWord.toString().toLowerCase().charAt(i))){
									word.deleteCharAt(word.toString().indexOf(""+anotherWord.toString().toLowerCase().charAt(i)));
									System.out.println("deleting "+anotherWord.charAt(i));
									anotherWord.deleteCharAt(i);
									
									
								} 
									
								else{
									System.out.println("Not an anagram ***");
									return;
								}
							}
		}
		else {
			System.out.println("Not an anagram");
			return;
		}
		
		System.out.println("They are anagrams " );
	}

}
