import java.util.Scanner;
/**
 * @author chamodshehanka on 10/21/2018
 * @project BitsNBytes
 **/

// Please name your class Main
class Main {
    public static void main (String[] args)  {
        int array[]={1,0,1,1,0,1};
        int c=0;
        //for(int i=1;i<=array.length;i++)

        Scanner user=new Scanner(System.in);
        System.out.println("Enter your query");
        int n=user.nextInt();
        int array2[] = new int[n+1];
        for(int j = 0; j < n; j++)
        {
            array2[j] = user.nextInt();
        }
        for (int anArray : array) {
            if (anArray == array2[n]) {
                c += 1;
                if (c == 6) {
                    System.out.println("You have given the correct query");
                }
            }
        }
        System.out.println("101101");
        System.out.println("Correct no bits: "+c);
    }
}

