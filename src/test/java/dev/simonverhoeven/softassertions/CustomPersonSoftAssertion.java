package dev.simonverhoeven.softassertions;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

import java.time.LocalDate;

public class CustomPersonSoftAssertion extends AbstractAssert<CustomPersonSoftAssertion, Person> {
    public CustomPersonSoftAssertion(Person person) {
        super(person, CustomPersonSoftAssertion.class);
    }

    CustomPersonSoftAssertion hasName() {
        Assertions.assertThat(actual.getName())
                .describedAs("Name")
                .isNotBlank();
        return this;
    }

    CustomPersonSoftAssertion hasMainLanguage(String expected) {
        Assertions.assertThat(actual.getMainLanguage())
                .describedAs("Main language")
                .isEqualTo(expected);
        return this;
    }

    CustomPersonSoftAssertion hasEmail(String expected) {
        Assertions.assertThat(actual.getEmail())
                .describedAs("E-mail")
                .isEqualTo(expected);
        return this;
    }

    CustomPersonSoftAssertion hasAddress(String expected) {
        Assertions.assertThat(actual.getAddress())
                .describedAs("Address")
                .isEqualTo(expected);
        return this;
    }

    CustomPersonSoftAssertion hasPhoneNumber(String expected) {
        Assertions.assertThat(actual.getPhoneNumber())
                .describedAs("Phone number")
                .isEqualTo(expected);
        return this;
    }

    CustomPersonSoftAssertion hasDateOfBirth(LocalDate expected) {
        Assertions.assertThat(actual.getDateOfBirth())
                .describedAs("Date of birth")
                .isEqualTo(expected);
        return this;
    }

    static CustomPersonSoftAssertion assertThat(Person person) {
        return new CustomPersonSoftAssertion(person);
    }
}
