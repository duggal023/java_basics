import java.util.*;

public class hourglass {
	
	public static void main(String args[])
	{
	
	 Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int r = 1;
     int sta = 2 * n + 1;
     int space = 0;
     int c = n;
     while (r <= 2 * n + 1) {
         
         
         int csp = 1;
         while (csp <= space) {
             System.out.print(" " + "\t");
             csp++;
         }
         
         int v = c;
         int cst = 1;
         while (cst <= sta) {
             System.out.print(v + "\t");
             if (cst <= sta / 2) {
                 v--;
             } else {
                 v++;
             }
             cst++;
         }
         if (r < n + 1) {
             c--;
             sta -= 2;
             space++;
         } else {
             c++;
             sta += 2;
             space--;
         }
         System.out.println();
         r++;

     }
}
}
