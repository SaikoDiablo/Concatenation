import java.util.Scanner;

public class Main{
    public static void main(String[] args){
     Scanner obj = new Scanner(System.in); //creating a scanner for user to be able to input data

     System.out.println("Enter a first string: ");
     String s1 = obj.nextLine();

     System.out.println("Enter a second string:");
     String s2 = obj.nextLine();
    //concatenation
     String s3 = s1 + s2;//join frist string with second
     String s4 = s2 + s1;// nhere join second with first

     
     System.out.println("First + Second: " + s3);//printing result
     System.out.println("Second + First: " + s4);
   

     if (s1.equals(s2)){ // using ternary operator and checking if s1 equals to s2
        System.out.println("strings are equal");
     }
     else{
        System.out.println("strings are different");
     }

    boolean alternate= s1.length() == s2.length();//checking if both hava same length
    System.out.println("Does alternation possible? " + alternate);

    String alter = "";//creating empty string to do the result
    int minLen = Math.min(s1.length(), s2.length());

        for(int i=0; i<minLen; i++){//append charecters s1 and s2
            alter = alter + s1.charAt(i) + s2.charAt(i);
        }

    System.out.println("Alternating: " + alter);//print the alternation
    obj.close();

    }
}
