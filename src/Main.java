import java.util.Scanner;

public class Main{
    public static void main(String[] args){
     Scanner obj = new Scanner(System.in);

     System.out.println("Enter a first word: ");
     String s1 = obj.nextLine();

     System.out.println("Enter a second word:");
     String s2 = obj.nextLine();

     String s3 = s1 + s2;
     String s4 = s2 + s1;

     
     System.out.println("First + Second: " + s3);
    System.out.println("Second + First: " + s4);
   

     if (s1.equals(s2)){
        System.out.println("Words are equal");
     }
     else{
        System.out.println("Words are different");
     }
    boolean alternate= s1.length() == s2.length();
    System.out.println("Does alternation possible? " + alternate);

    StringBuilder alter = new StringBuilder();
    for(int i=0; i<s1.length() && i<s2.length(); i++){
        alter.append(s1.charAt(i)).append(s2.charAt(i));
    }
    System.out.println("Alternating: "+alter);

    obj.close();



    }
}