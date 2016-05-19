import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by ignacy on 18.05.16.
 */
public class EqualsTest {
    @Test
    public void EqualsTest(){
        int a = 5;
        int b = 5;
        assertThat((a == b),is(true));
    }


}
