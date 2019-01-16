import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      Scanner in = new Scanner(System.in) ;
	  int X = in.nextInt() ;
      int Quo = X / 100 ;
      int Rem = X % 10 ;
      System.out.println(Quo + Rem);
      
	}
}