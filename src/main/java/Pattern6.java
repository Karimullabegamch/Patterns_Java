//1 10 11 20 21 
//2 9 12 19 22 
//3 8 13 18 23 
//4 7 14 17 24 
//5 6 15 16 25
public class Pattern6 {
 public static void main(String[] args) {
  for(int i=1;i<=5;i++)
  {
    int x=i;
    int y=5-i+1;
    for(int j=1;j<=5;j++)
    {
      if(j%2==1)
      {
        System.out.print(x+" ");
      }
      else
      {
        System.out.print(y+" ");
      }
      y=y+5;
      x=x+5;
    }
    System.out.println();
  }

}
}
