import java.text.DecimalFormat;
class GfG
{
  public static void main(String args[])
  {
    int e = 12345;
    DecimalFormat df = new DecimalFormat("#");
    String str5 = df.format(e);
    System.out.println(str5);
  }
} 