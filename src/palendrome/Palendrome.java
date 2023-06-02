
package palendrome;

import java.util.Scanner;

public class Palendrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your word: ");
        String word = in.next(); // sara // dad    
//        char charArray[] = word.toCharArray(); // [s,a,r,a] 
        char charWord [] = word.toCharArray();
        Stack s1 = new Stack(5);
        Stack s2 = new Stack(5);
        Stack s3 = new Stack(5);
        
        for(char c: charWord) {
            s1.push(c); // s a r a
            s2.push(c); // s a r a
        }

        
        while (!s2.isEmpty()) {            
            s3.push(s2.pop()); // a r a s
        }
        
        boolean m = true;
        while (!s3.isEmpty()) {            
            if (s1.pop() != s3.pop()) {
                m = false;
                break;
            }
        }
        
        if (m) {
            System.out.println(word + " is Palendrome");
        } else {
            System.out.println(word + " is not Palendrome");
        }
    }
    
}
