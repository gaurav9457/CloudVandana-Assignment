import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your Sentence=");
        String s=sc.nextLine();

        String s1=s.toUpperCase();

         boolean flag= false ;

    for (int i=0;i<=s1.length()-1;i++) {
        if(s1.charAt(i)=='A' || s1.charAt(i)=='B' ||s1.charAt(i)=='C' || s1.charAt(i)=='D'||s1.charAt(i)=='E' || s1.charAt(i)=='F'||
           s1.charAt(i)=='G' || s1.charAt(i)=='H' ||s1.charAt(i)=='I' || s1.charAt(i)=='J'||s1.charAt(i)=='K' || s1.charAt(i)=='L'||
           s1.charAt(i)=='M' || s1.charAt(i)=='N' ||s1.charAt(i)=='O' || s1.charAt(i)=='P'||s1.charAt(i)=='Q' || s1.charAt(i)=='R'||
           s1.charAt(i)=='S' || s1.charAt(i)=='T' ||s1.charAt(i)=='U' || s1.charAt(i)=='V'||s1.charAt(i)=='W' || s1.charAt(i)=='X'|| 
           s1.charAt(i)=='Y' || s1.charAt(i)=='Z'){

            flag=true;

        }
    }
    if(flag==true){
        System.out.println("Pangram Sentence");

    }
    else{
        System.out.println("Not Pangram Sentence");
    }

}
}
