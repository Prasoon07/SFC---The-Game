package Model.structure;

import java.lang.reflect.Method;
import org.junit.Before;
import org.junit.Test;
import Model.structure.MotionCell;
import java.lang.reflect.InvocationTargetException;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author praso
 */
public class MotionCellTest {
    boolean b1 = false;
    boolean b2 = true;
    MotionCell mc1 = new MotionCell(2, 4 , 10, 20, b1);
    MotionCell mc2 = new MotionCell(4, 6 , 20, 40, b2);
    public MotionCellTest() {
        
    }
    
    @Before
    public void setUp() {
       
    }

    @Test
    public void positionCheck() throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        Method method = MotionCell.class.getDeclaredMethod("positionCheck");
        method.setAccessible(true);
        boolean c1 = true;
        boolean c2 = true;
        
        boolean comp1 = (boolean) method.invoke(mc1);
        assertEquals(c1, comp1);
        
        boolean comp2 = (boolean) method.invoke(mc2);
        assertEquals(c2, comp2);
    }
    
}
