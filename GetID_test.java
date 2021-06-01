import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * A test method for GetID()
 * @author Xiao Zheng
 * @version 1.0
 * @since 6/1/2021
 */
public class GetID_test {

    @Test
    void test() {
        new SaveID().write2file("aaa");
        GetID test = new GetID();
        assertEquals("aaa",test.getID());
    }
}
