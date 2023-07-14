import java.io.*;

public class methods {

    private String word;


    public static boolean check(String word){
        String reverse = " ";
        boolean answer = false;
        for(int i = word.length() -1; i >= 0; i--) {
            reverse= reverse + word.charAt(i);
        }
        if (word.equals(reverse)){
            answer = true;
        }
        return answer;
    }
}
