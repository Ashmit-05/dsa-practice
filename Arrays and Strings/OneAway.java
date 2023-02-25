import java.util.HashMap;
import java.util.Scanner;
public class OneAway {
    public boolean checkOneEditAway(String s1,String s2) {
        int diff = Math.abs(s1.length() - s2.length());
        if(diff > 1) return false;
        else {
            HashMap<Character,Integer> map = new HashMap<>();
            for(int i = 0; i < s1.length(); i++) {
                if(map.containsKey(s1.charAt(i))){
                    int x = map.get(s1.charAt(i));
                    x += 1;
                    map.put(s1.charAt(i),x);
                } else {
                    map.put(s1.charAt(i),1);
                }
            }
            int check = 0;
            for(int i = 0; i < s2.length(); i++) {
                if(!map.containsKey(s2.charAt(i))) check++;
            }
            return (check > 1) ? false : true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter string 1");
        s1 = sc.next();
        System.out.println("Enter string 2");
        s2 = sc.next();
        OneAway obj = new OneAway();
        System.out.println(obj.checkOneEditAway(s1, s2));
    }
}