package tasktwo;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class ServiceTest {

  Database databaseMock = Mockito.mock(Database.class);
  Service service = new Service(databaseMock);

  @Test
  void test() {
    when(databaseMock.getUniqueId()).thenReturn(42);
    assertEquals("Using database with id: 42", service.getDatabaseID());
  }
}
