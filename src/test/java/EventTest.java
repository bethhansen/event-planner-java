import org.junit.*;
import static org.junit.Assert.*;

public class EventTest{

  @Test
  public void calcPrice_return_int() {
    Event testEvent = new Event(9, "mexican", "sodas", "dj");
    assertEquals(0, testEvent.calcPrice());
  }





}
