package ke.co.safaricom;

import java.util.Scanner;

public class Cipher {
    public static void main(String[] args) {

        System.out.println("Welcome to Caesar Cipher program!\n");

        Scanner sc=new Scanner(System.in);
        int shift,i,n;
        String str;
        StringBuilder str1= new StringBuilder();
        StringBuilder str2= new StringBuilder();
        System.out.println("Enter the plaintext to Encoded");
        str=sc.nextLine();
        str=str.toLowerCase();
        n=str.length();
        char[] ch1 =str.toCharArray();
        char ch3,ch4;
        System.out.println("Enter the key (a number between 1 to 25):");
        shift=sc.nextInt();

        System.out.println();
        System.out.println("Encrypted text is");
        for(i=0;i<n;i++)
        {
            if(Character.isLetter(ch1[i]))
            {
                ch3=(char)(((int)ch1[i]+shift-97)%26+97);
                //System.out.println(ch1[i]+" = "+ch3);
                str1.append(ch3);
            }
            else if(ch1[i]==' ')
            {
                str1.append(ch1[i]);
            }
        }
        System.out.println(str1);

        System.out.println();
        System.out.println("Decrypted text is");

        char[] ch2 = str1.toString().toCharArray();
        for(i=0;i<str1.length();i++)
        {
            if(Character.isLetter(ch2[i]))
            {
                if(((int)ch2[i]-shift)<97)
                {
                    ch4=(char)(((int)ch2[i]-shift-97+26)%26+97);

                }
                else
                {
                    ch4=(char)(((int)ch2[i]-shift-97)%26+97);
                }
                str2.append(ch4);
            }

            else if(ch2[i]==' ')
            {
                str2.append(ch2[i]);
            }
        }
        System.out.println(str2);
    }

}
