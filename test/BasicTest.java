import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

    @Test
    public void aVeryImportantThingToTest() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public  void doModifyName(){
        String id = "1";
        Student object = Student.findById(Long.parseLong(id));
//        object.nameString = "ss";
        Student st = Student.findById(Long.parseLong(id));


    }
}
