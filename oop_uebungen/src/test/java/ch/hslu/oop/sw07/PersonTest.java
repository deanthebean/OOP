package ch.hslu.oop.sw07;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void testConstructor(){
        Person person = new Person(12345, "Amrein", "Daniel");
        assertEquals(person.getId(), 12345);
        assertEquals(person.getLastname(), "Amrein");
        assertEquals(person.getFirstname(), "Daniel");
    }

    @Test
    void compareEqualsVerifier(){
        EqualsVerifier.forClass(Person.class).withNonnullFields("firstname").withNonnullFields("lastname").verify();
    }

    @Test
    void isTheSamePerson(){
        Person person = new Person(12345, "Amrein", "Daniel");
        Person person2 = person;
        assertEquals(person, person2);
    }

    @Test
    void isNotTheSamePerson(){
        Person person = new Person(12345, "Amrein", "Daniel");
        Person person2 = new Person(12345, "Amrein", "Daniel");
        assertEquals(person, person2);
    }
}