import java.util.Scanner;

public class StringCompression {
    public static String compressedString(String s) {
        String compressed = "";
        int left = 0;
        int right = 0;
        int count = 0;
        while(right < s.length()) {
            char ch1 = s.charAt(left);
            char ch2 = s.charAt(right);
            if(ch1 == ch2) {
                count++;
                right++;
            }
            else {
                compressed += ch1 + Integer.toString(count);
                count = 0;
                left = right;
            }
            if(right == s.length()) {
                compressed += ch1 + Integer.toString(count);
            }
        }
        return (compressed.length() >= s.length()) ? s : compressed;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter String name");
        s = sc.next();
        System.out.println("Compressed String : "+compressedString(s));
    }
}
