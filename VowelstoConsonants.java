import java.util.*;

public class VowelstoConsonants{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String Vowels = "aeiou";

        for(int i = 0; i < str.length(); i++){
            for(int j = 0 ; j < Vowels.length() ; j++){
                str = str.replace('a','b');
                str = str.replace('e' , 'f');
                str = str.replace('i' , 'j');
                str = str.replace('o' , 'p');
                str = str.replace('u'  , 'v');
;            }
        }
        System.out.println(str);
    }
}

   
    
