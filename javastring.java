import java.util.*;
public class javastring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        if(s1.equalsIgnoreCase(s2)){
            System.out.println(s3);
        }else if(s1.equalsIgnoreCase(s3)){
            System.out.println(s2);
        }else{
            System.out.println(s1);
        }
    }


}
