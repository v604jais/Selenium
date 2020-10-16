package xlsTest;

import com.codeborne.xlstest.XLS;
import static com.codeborne.xlstest.XLS.*;
import static org.junit.Assert.assertThat;

//POM config
/*
<dependency>
    <groupId>com.codeborne</groupId>
    <artifactId>xls-test</artifactId>
    <version>1.2</version>
  </dependency>
*/

public class ExcelContainsTextTest {
  @Test
  public void canAssertThatXlsContainsText() {
    XLS spreadsheet = new XLS(getClass().getClassLoader().getResource("statement.xls"));
    assertThat(spreadsheet, containsText("Statement"));
  }
}