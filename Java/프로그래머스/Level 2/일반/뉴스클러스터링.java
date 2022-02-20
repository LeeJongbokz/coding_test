import java.util.*;

public class Solution {
    public double solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        ArrayList<String> arr1 = new ArrayList<String>();
        ArrayList<String> arr2 = new ArrayList<String>();
        ArrayList<String> union = new ArrayList<String>();
        ArrayList<String> intersection = new ArrayList<String>(); 
        
        for(int i=0; i<str1.length()-1; i++){
            String tmp = str1.substring(i, i+2);
            if(Character.isLetter(tmp.charAt(0)) && Character.isLetter(tmp.charAt(1))){
                arr1.add(tmp);
            }
        }
        
        for(int i=0; i<str2.length()-1; i++){
            String tmp = str2.substring(i, i+2);
            if(Character.isLetter(tmp.charAt(0)) && Character.isLetter(tmp.charAt(1))){
                arr2.add(tmp);
            }
        }
        
        for(String s: arr1){
            if(arr2.remove(s)){
                intersection.add(s);
            }
            union.add(s);
        }
        
        for(String s: arr2){
            union.add(s);
        }
        
        
        double jakard = 0;
        
        if(union.size() == 0){
            jakard = 1;
        }else{
            jakard = (double)intersection.size() / (double)union.size();
        }
        
        return (int)(65536*jakard);
    }
}
