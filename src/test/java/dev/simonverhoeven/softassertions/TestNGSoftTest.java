package dev.simonverhoeven.softassertions;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.SoftAssertions.assertSoftly;


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
        assertSoftly(softAssertions -> {
            softAssertions.assertThat(personRecord1.name()).isEqualTo(person1.getName());
            softAssertions.assertThat(personRecord1.mainLanguage()).isEqualTo(person1.getMainLanguage());
            softAssertions.assertThat(personRecord1.email()).isEqualTo(person1.getEmail());
            softAssertions.assertThat(personRecord1.address()).isEqualTo(person1.getAddress());
            softAssertions.assertThat(personRecord1.phoneNumber()).isEqualTo(person1.getPhoneNumber());
            softAssertions.assertThat(personRecord1.dateOfBirth()).isEqualTo(person1.getDateOfBirth().toString());
        });


        assertSoftly(softAssertions -> {
            softAssertions.assertThat(personRecord2.name()).isEqualTo(person2.getName());


            softAssertions.assertThat(personRecord1.mainLanguage()).isEqualTo(person2.getMainLanguage());
            softAssertions.assertThat(personRecord2.email()).isEqualTo(person2.getEmail());
            softAssertions.assertThat(personRecord2.address()).isEqualTo(person2.getAddress());
            softAssertions.assertThat(personRecord1.phoneNumber()).isEqualTo(person2.getPhoneNumber());
            softAssertions.assertThat(personRecord1.dateOfBirth()).isEqualTo(person2.getDateOfBirth().toString());
        });
    }
}
