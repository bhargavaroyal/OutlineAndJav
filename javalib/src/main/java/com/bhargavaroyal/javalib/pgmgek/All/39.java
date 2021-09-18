or
import java.text.DecimalFormat;
class GfG
{
  public static void main(String args[])
  {
    int e = 12345;
    DecimalFormat df = new DecimalFormat("#,###");
    String Str5 = df.format(e);
    System.out.println(Str5);
  }
} 