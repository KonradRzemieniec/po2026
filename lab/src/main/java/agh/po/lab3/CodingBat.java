package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

public class CodingBat {
    public boolean array123(int[] nums) {
        for (int i=0; i < (nums.length-2); i++) {
            if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
        }
        return false;
    }
    public boolean lucky13(int[] nums) {
        for (int num : nums) {
            if (num == 1 || num == 3) return false;
        }
        return true;
    }

    public String sameEnds(String string) {
        int n = string.length();
        for(int i = n /2; i >=1; i--){
            String poczatek = string.substring(0, i);
            String koniec = string.substring(n - i);

            if(poczatek.equals(koniec)) {
                return poczatek;
            }



        }
        return "";
    }

    public Map<String, String> mapAB4(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            String napisA = map.get("a");
            String napisB = map.get("b");

            if(napisA.length() > napisB.length()){
                map.put("c", napisA);
            } else if(napisB.length() > napisA.length()){
                map.put("c", napisB);
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }

        return map;
    }
    public Map<String, String> pairs(String[] strings){
        Map<String, String> result = new HashMap<>();

        for (String word : strings){
            String first = word.substring(0, 1);
            String last = word.substring(word.length() - 1);
            result.put(first, last);

        }

        return result;
    }



    public static void main(String[] args) {
        CodingBat codingbat = new CodingBat();

        System.out.println("wynik: " + codingbat.array123(new int[]{1,2,3,4,5,6}));
        System.out.println("wynik: " + codingbat.array123(new int[]{4,4,4,}));
        System.out.println("wynik: " + codingbat.lucky13(new int[]{2, 7, 2, 8}));
        System.out.println("wynik: " + codingbat.lucky13(new int[]{3, 7, 2, 8}));
        System.out.println("wynik: " + codingbat.lucky13(new int[]{2, 2}));
        System.out.println("wynik: " + codingbat.lucky13(new int[]{3}));


    }
}