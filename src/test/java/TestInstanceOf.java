import com.chocksaway.model.Contact;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestInstanceOf {
    @Test
    public void testInstanceOfContact() {
        Contact contact = Contact.builder()
                .name("James")
                .build();
        List<Object> objectList = List.of( contact, 12, "hello");

        assertEquals(1, objectList.stream()
                .filter(TestInstanceOf::findClassType).count());
    }

    static boolean findClassType(Object object) {
        return object instanceof Contact;
    }
}
