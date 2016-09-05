import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Maso on 04/09/2016.
 */
public class FixBuzzTest
{


    @Test
    public void divideByKata() throws Exception
    {
        FixBuzz fix=new FixBuzz();

        List<Integer> list= Arrays.asList(9,15,100,77);
        assertEquals("Buzz",fix.divideByKata(list.get(2)));
        assertEquals("Fizz",fix.divideByKata(list.get(0)));
        assertEquals("Fizz Buzz",fix.divideByKata(list.get(1)));
        assertEquals(String.valueOf(list.get(3)),fix.divideByKata(list.get(3)));

    }

}