/*Sum of even & odd

Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.
Input format :
 Integer N
Output format :
Sum_of_Even_Digits Sum_of_Odd_Digits
(Print first even sum and then odd sum separated by space)
Constraints
0 <= N <= 10^8
Sample Input 1:
1234
Sample Output 1:
6 4
Sample Input 2:
552245
Sample Output 2:
8 15 */
import java.util.Scanner;
public class sum0fEvenOddDIgits {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s=new Scanner(System.in);
        int n,esum=0,osum=0;
        
        n=s.nextInt();
      while(n!=0){
         int a=n/10;
          int m=n%10;
          if(m%2==0){
              esum=esum+m;
              n=a;
          }
          else
              osum=osum+m;
          n=a;
          }
        
        System.out.printf(esum+" "+osum);
        s.close();
	}
}
