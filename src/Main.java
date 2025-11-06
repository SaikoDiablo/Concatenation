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

    StringBuilder alter = new StringBuilder();//creating empty StringBuilder tp build a new string in a loop
    for(int i=0; i<s1.length() && i<s2.length(); i++){ //find the lenght of shorter string
        alter.append(s1.charAt(i)).append(s2.charAt(i));// add s1 i character, the s2
    }
    System.out.println("Alternating: "+alter); // prints the final alternating

    obj.close();

    }
}
