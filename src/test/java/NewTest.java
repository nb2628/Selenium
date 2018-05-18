import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest {
  @Test(dataProvider ="LoginData")
  public void f(Integer n, String s) {
	  System.out.println("username is"+n);
	  System.out.println("password is"+s);
	  System.out.println(n+" "+s);
  }

  @DataProvider(name="LoginData")
  public String [][] dp(){
	  return new String [][] {
		  new String[] {"user1","pass1"},
		  new String[] {"user2","pass2"}
	  };
  }
}
