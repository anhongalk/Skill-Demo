import org.junit.*;
import static org.junit.Assert.*;

public class SkillDemoTesting{
    @Test
    public void testing(){
        assertEquals(true, SkillDemo.EvenOrOdd(2));
        //test case will succeed !!
    }
}