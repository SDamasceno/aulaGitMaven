
package aulas.praticas.prat_mavengit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/** ** @author Samara  */
public class AppLabTest {
    
    public AppLabTest() {
    }
    /**
* Test of lerJSON method, of class AppLab.
*/
@Test
public void testLerJSON() throws Exception {
System.out.println("lerJSON");
String url = "http://time.jsontest.com/"; // esta URL gera um conteúdo JSON
String result = AppLab.lerJSON(url);
assertTrue(result.length() > 0);
}
}
    