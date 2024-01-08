package dev.simonverhoeven.softassertions;

import org.junit.jupiter.api.Test;
import org.testng.asserts.SoftAssert;

import java.time.LocalDate;
import java.time.Month;


class TestNGSoftTest {

    @Test
    void softAssert() {
        // Given
        Person person1 = new Person(
                "John Doe",
                "English",
                "john.doe@example.com",
                "123 Main St",
                "555-1234",
                LocalDate.of(1980, Month.DECEMBER, 1)
        );

        Person person2 = new Person(
                "Jane Doe",
                "French",
                "jane.doe@example.com",
                "456 Oak St",
                "555-5678",
                LocalDate.of(1982, Month.APRIL, 1)
        );

        // When
        var personRecord1 = PersonMapper.entityToRecord(person1);
        var personRecord2 = PersonMapper.entityToRecord(person2);

        // Then
        var personSoftAssert = new SoftAssert();
        personSoftAssert.assertEquals(person1.getName(), personRecord1.name());
        personSoftAssert.assertEquals(person1.getMainLanguage(), personRecord1.mainLanguage());
        personSoftAssert.assertEquals(person1.getEmail(), personRecord1.email());
        personSoftAssert.assertEquals(person1.getAddress(), personRecord1.address());
        personSoftAssert.assertEquals(person1.getPhoneNumber(), personRecord1.phoneNumber());
        personSoftAssert.assertEquals(person1.getDateOfBirth().toString(), personRecord1.dateOfBirth());
        personSoftAssert.assertAll();

        var personSoftAssert2 = new SoftAssert();
        personSoftAssert2.assertEquals(person2.getName(), personRecord2.name());
        personSoftAssert2.assertEquals(person2.getMainLanguage(), personRecord1.mainLanguage());
        personSoftAssert2.assertEquals(person2.getEmail(), personRecord2.email());
        personSoftAssert2.assertEquals(person2.getAddress(), personRecord2.address());
        personSoftAssert2.assertEquals(person2.getPhoneNumber(), personRecord1.phoneNumber());
        personSoftAssert2.assertEquals(person2.getDateOfBirth().toString(), personRecord1.dateOfBirth());
        personSoftAssert2.assertAll();
    }
}
