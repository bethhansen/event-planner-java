import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
   public void newEvent_instantiatesCorrectly() {
     Event testEvent = new Event(10, "Mexican", "Open Bar", "DJ");
     assertEquals(true, testEvent instanceof Event);
   }

  @Test
  public void calcPrice_returnPrice_int() {
    Event testEvent = new Event(10, "Mexican", "Open Bar", "DJ");
    assertEquals(520, testEvent.calcPrice());
  }

  @Test
  public void getGuests_getCorrectNumberOfGuests_int() {
    Event testEvent = new Event(10, "Mexican", "Open Bar", "DJ");
    assertEquals(10, testEvent.getGuests());
  }

  @Test
  public void getFood_getCorrectFood_string() {
    Event testEvent = new Event(10, "Mexican", "Open Bar", "DJ");
    assertEquals("Mexican", testEvent.getFood());
  }

  @Test
  public void getBeverages_getCorrectBeverages_string() {
    Event testEvent = new Event(10, "Mexican", "Open Bar", "DJ");
    assertEquals("Open Bar", testEvent.getBeverages());
  }

  @Test
  public void getEntertainment_getCorrectEntertainment_string() {
    Event testEvent = new Event(10, "Mexican", "Open Bar", "DJ");
    assertEquals("DJ", testEvent.getEntertainment());
  }

  @Test
  public void calcPrice_oneArgumentToCalcPrice_int() {
    Event testEvent = new Event(10, "Mexican", "Open Bar", "DJ");
    assertEquals(520, testEvent.calcPrice());
  }

  @Test
  public void calcPrice_calcTotalPrice_int() {
    Event testEvent = new Event(10, "Mexican", "Open Bar", "DJ");
    assertEquals(520, testEvent.calcPrice());
  }

}
