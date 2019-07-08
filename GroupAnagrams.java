package br.com.vinicius.portugal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class GroupAnagrams {
	
	public static void main (String args[]){
		HashMap<String, List<String>> friendlyWordsMap = new HashMap<String, List<String>>();
        
        String[] words = {"car", "cheating", "dale", "deal", "lead", "listen", "silent", "teaching"};
        
        groupAnagrams(words);
        
	}
	
	
	
	public static String[] groupAnagrams(String[] input) {
		List<String> result = new ArrayList<String>();

		HashMap<String, ArrayList<String>> wordsMap = new HashMap<String, ArrayList<String>>();
		for(String str: input){
			char[] charArray = new char[26];
			for(int i = 0; i< str.length(); i++){
				charArray[str.charAt(i)-'a']++;
			}
			String stringKey = new String(charArray);
	 
			if(wordsMap.containsKey(stringKey)){
				wordsMap.get(stringKey).add(str);
			}else{
				ArrayList<String> al = new ArrayList<String>();
				al.add(str);
				wordsMap.put(stringKey, al);
			}
		}
		
		for (Map.Entry<String, ArrayList<String>> entry : wordsMap.entrySet()) {
			List<String> words = entry.getValue();
			java.util.Collections.sort(words);
			if (words.size() > 1) {
				String friendlyWords = "";
				for (String word : words) {
					friendlyWords = friendlyWords + word + " ";
				}
				result.add(friendlyWords.trim());
			}
		}
		
		String[] stringArray = result.toArray(new String[0]);
		
		return stringArray;
	}

}
