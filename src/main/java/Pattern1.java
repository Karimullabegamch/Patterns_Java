public class Pattern1 {
  public static void main(String[] args) {

    for(int i=1;i<=5;i++)
      {
        for(int j=1;j<=5;j++)
          {
            if(i>j)
              System.out.print(0+" ");
            else
              System.out.print((i+j)-1+" ");
          }
        System.out.println();   
      }
  }
 }
1 2 3 4 5 
0 3 4 5 6 
0 0 5 6 7 
0 0 0 7 8 
0 0 0 0 9 