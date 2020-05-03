package com.learn.may2020;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>Problem Statement:</b>
 *Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.
<p>
Note:
You may assume that both strings contain only lowercase letters.

<p>canConstruct("a", "b") -> false</p>
<p>canConstruct("aa", "ab") -> false</p>
<p>canConstruct("aa", "aab") -> true</p>
</p>

 *
 */
public class May3RansomNote {
	
	public static void main(String[] args) {
		System.out.println(canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
	}
	public static boolean canConstruct(String ransomNote, String magazine) {
        //Failed Approach 1
        //return magazine.contains(ransomNote);
        
        //Failed Approach 2
        /*for(char c:ransomNote.toCharArray()) {
            if(!magazine.contains(new String(new char[]{c}))){
                return false;
            }
        }
        return true;*/
        Map<Character, Integer> r = getMap(ransomNote);
        Map<Character, Integer> m = getMap(magazine);
        
        for(Map.Entry<Character, Integer> e: r.entrySet()) {
            
            if (m.containsKey(e.getKey())) {
                    if(!(e.getValue()<=m.get(e.getKey()))) {
                        return false;
                    }
            } else {
                return false;
            }
        }
        return true;
    }
    
    private static Map<Character, Integer> getMap(String s) {
        Map<Character, Integer> r = new HashMap<>();
                
        for(Character c:s.toCharArray()) {
            if(r.containsKey(c)) {
                r.put(c, r.get(c)+1);
            } else {
                r.put(c, 1);
            }
        }
        
        return r;
    }
}
