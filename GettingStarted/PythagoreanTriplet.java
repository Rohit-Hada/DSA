public class Main {
  
  public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  // Accepting inputs
  int a = scn.nextInt();
  int b = scn.nextInt();
  int c = scn.nextInt();
  // converting the values into their ssquares
  a = a*a;
  b = b*b;
  c = c*c;
  // Checking if given numbers are Pythagorean Triplet
  if(a + b == c){
    System.out.print(true);
  }else if(a + c == b){
    System.out.print(true);
  }else if(b + c == a){
    System.out.print(true);
  }else{
    System.out.print(false);
  }

  }
}