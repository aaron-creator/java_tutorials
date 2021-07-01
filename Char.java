import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Char {
    
    public static int charSearch(String str,char ch){
        //complete the function
        int c= 0;
        for(int i =0;i<str.length();i++){
            char s = str.charAt(i);
            if(s==ch){
                c++;
            }
        }
        return c;
    }
public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        char ch = (char)reader.read();
        
        System.out.println(charSearch(str,ch));
        
        

    }
}