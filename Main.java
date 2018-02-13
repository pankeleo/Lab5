import java.util.Scanner;

public class Main
{
    public static void main (String args[])
    {
        Scanner reader   = new Scanner(System.in);

        long output=0;
        String input;

        System.out.print("Enter a hexadecimal number: ");
        input = reader.nextLine();

        input=input.toUpperCase();

        if(input.length()>=2 && input.substring(0,2).equals("0x"))
            input=input.substring(2, input.length());

        int slength = input.length();

        for (int i= 0; i < slength; i++)
        {
            if (input.charAt(i)=='1')
                output+=1*(Math.pow(16, slength-(i+1)));
            else if (input.charAt(i)=='2')
                output+=2*(Math.pow(16, slength-(i+1)));
            else if (input.charAt(i)=='3')
                output+=3*(Math.pow(16, slength-(i+1)));
            else if (input.charAt(i)=='4')
                output+=4*(Math.pow(16, slength-(i+1)));
            else if (input.charAt(i)=='5')
                output+=5*(Math.pow(16, slength-(i+1)));
            else if (input.charAt(i)=='6')
                output+=6*(Math.pow(16, slength-(i+1)));
            else if (input.charAt(i)=='7')
                output+=7*(Math.pow(16, slength-(i+1)));
            else if (input.charAt(i)=='8')
                output+=8*(Math.pow(16, slength-(i+1)));
            else if (input.charAt(i)=='9')
                output+=9*(Math.pow(16, slength-(i+1)));
            else if (input.charAt(i)=='A')
                output+=10*(Math.pow(16, slength-(i+1)));
            else if (input.charAt(i)=='B')
                output+=11*(Math.pow(16, slength-(i+1)));
            else if (input.charAt(i)=='C')
                output+=12*(Math.pow(16, slength-(i+1)));
            else if (input.charAt(i)=='D')
                output+=13*(Math.pow(16, slength-(i+1)));
            else if (input.charAt(i)=='E')
                output+=14*(Math.pow(16, slength-(i+1)));
            else if (input.charAt(i)=='F')
                output+=15*(Math.pow(16, slength-(i+1)));
            else if (input.charAt(i)=='0')
                output+=0;
        }
        System.out.println("Your number is "+output+" in decimal");
    }
}