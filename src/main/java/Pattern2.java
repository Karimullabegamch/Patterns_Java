class Pattern2 {
  public static void main(String[] args) {

  for(int i=1;i<=5;i++)
    {
       int a=i;
      for(int j=1;j<=5;j++)
        {
             System.out.print(a+++" ");
          if(a>5)
          a=1;

        }
      System.out.println();   
}
  }
}

1 2 3 4 5 
2 3 4 5 1 
3 4 5 1 2 
4 5 1 2 3 
5 1 2 3 4 