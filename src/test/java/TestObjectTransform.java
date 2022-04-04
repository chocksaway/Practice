import com.chocksaway.model.HobbiesAndAge;
import com.chocksaway.model.Contact;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestObjectTransform {
    Contact contact = Contact.builder()
            .name("milesd")
            .age(51)
            .hobby("old VWs")
            .build();

    Contact anotherContact = Contact.builder()
            .name("john")
            .age(45)
            .hobby("tennis")
            .build();


    @Test
    public void testObjectTransform() {
        assertEquals(Contact.class, contact.getClass());
    }

    @Test
    public void testFindAgeOver50() {
        final List<Contact> contacts = List.of(contact, anotherContact);

        List<Contact> filteredContacts = contacts.stream()
                .filter(each -> each.getAge() > 50)
                .collect(Collectors.toList());

        assertEquals(1, filteredContacts.size());

        assertEquals(1, (int) contacts.stream()
                .map(this::transform)
                .filter(each -> each.getAge() < 50)
                .count());
    }


    @Test
    public void testFindHobbyWhichIsTennis() {
        assertEquals(1, Stream.of( contact, anotherContact).filter(this::hobbyFilter).count());
    }

    boolean hobbyFilter(Contact contact) {
        return "tennis".equals(contact.getHobby());
    }

    HobbiesAndAge transform(final Contact contact) {
        return HobbiesAndAge.builder()
                .hobbies(contact.getHobby())
                .age(contact.getAge())
                .build();
    }
}
