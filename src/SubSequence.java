import java.util.Scanner;

public class SubSequence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String");
        String s= scanner.nextLine();
        System.out.print("SubSequence of 'AG' ");
        System.out.println(sum(s));
    }
    public static int sum(String s)
    {
        char[] ch=s.toCharArray();
        int count=0,count1=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='A')
            {
                count++;
            }
            else if(ch[i]=='G')
            {
                count1+=count;
            }
        }return count1;
    }
}
