import org.junit.*;



public class SimpleCalculaterTest {
    @Test
    public void twosumEqualsFour() {
        SimpleCalculater calculater =  new SimpleCalculater();
        Assert.assertEquals(4,calculater.add(2,2));
        Assert.assertTrue(calculater.add(2,2)==4);
      }
    @Test
    public void threesumsevenTen() {
        SimpleCalculater calculater =  new SimpleCalculater();
        Assert.assertEquals(10,calculater.add(3,7));
        // Assert.assertTrue(calculater.add(2,2)==4);

    }

    @Test
    public void sumofrwo_five() {
        SimpleCalculater c = new SimpleCalculater();
        Assert.assertTrue(c.add(2,5)==10);
    }
}