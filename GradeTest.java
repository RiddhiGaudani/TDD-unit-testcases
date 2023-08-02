import org.junit.*;

public class GradeTest {
    @Test
    public void checkGrade() {
        Grader g1 = new Grader();
        Assert.assertEquals('C',g1.findGrade(78));
    }
     @Test
    public void checkGrade2() {
        Grader g1 = new Grader();
        Assert.assertEquals('F',g1.findGrade(58));
    }

    @Test 
    public void lessthanseventy() {
        Grader g2 = new Grader();
        Assert.assertEquals('D',g2.findGrade(67));
    }
      @Test 
    public void lessthanninty() {
        Grader g2 = new Grader();
        Assert.assertEquals('B',g2.findGrade(87));
    }
      @Test 
    public void thecharshouldbeA() {
        Grader g2 = new Grader();
        Assert.assertEquals('A',g2.findGrade(99));
    }

     @Test 
    public void nintyshouldreturnA() {
        Grader g2 = new Grader();
        Assert.assertEquals('B',g2.findGrade(80));
    }
}