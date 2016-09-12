import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
   public void newEvent_instantiatesCorrectly() {
     Event testEvent = new Event(9, "mexican", "sodas", "dj");
     assertEquals(true, testEvent instanceof Event);
   }


  @Test
  public void calcPrice_returnPrice_int() {
    Event testEvent = new Event(9, "mexican", "sodas", "dj");
    assertEquals(70, testEvent.calcPrice());
  }

  @Test
  public void getGuests_getCorrectNumberOfGuests_int() {
    Event testEvent = new Event(9, "mexican", "sodas", "dj");
    assertEquals(9, testEvent.getGuests());
  }

  @Test
  public void getFood_getCorrectFood_string() {
    Event testEvent = new Event(9, "mexican", "sodas", "dj");
    assertEquals("mexican", testEvent.getFood());
  }

  @Test
  public void getBeverages_getCorrectBeverages_string() {
    Event testEvent = new Event(9, "mexican", "sodas", "dj");
    assertEquals("sodas", testEvent.getBeverages());
  }

  @Test
  public void getEntertainment_getCorrectEntertainment_string() {
    Event testEvent = new Event(9, "mexican", "sodas", "dj");
    assertEquals("dj", testEvent.getEntertainment());
  }

  @Test
  public void calcPrice_oneArgumentToCalcPrice_int() {
    Event testEvent = new Event(9, "mexican", "sodas", "dj");
    assertEquals(70, testEvent.calcPrice());
  }


}
