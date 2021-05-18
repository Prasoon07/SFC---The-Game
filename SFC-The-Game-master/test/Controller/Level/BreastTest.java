package Controller.Level;

import Model.operator.GameManager;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author praso
 */
public class BreastTest {
    
    public BreastTest() {
    }
    Breast b;
    @Before
    public void setUp() {
        GameManager GameManager = new GameManager();
        
        b = new Breast(GameManager);
    }

    /**
     * Test of update method, of class Breast.
     */
    @Test
    public void TestGameStatus(){
        int gameTime = b.Game_Status();
        assertEquals(35, gameTime);
    }
    
}
