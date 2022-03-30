package inheritance;

class MySuper
{
  int x = 1;
   
  public MySuper()
  {
    System.out.println(getResult(3));
  }
  int getResult()
  {
    return x;
  }
  int getResult(int i)
  {
    return(i + x + getResult() + x);
  }
}
public class MySub extends MySuper
{
  int getResult()
  {
    super.x = 5;
    return x + 3;
  }
  public static void main(String[] args)
  {
    MySuper s1 = new MySub();
  }
}