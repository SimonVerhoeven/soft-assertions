package dev.simonverhoeven.softassertions;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class PersonMapper {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public static Person recordToEntity(PersonDTO person) {
        try {
            return new Person(
                    person.name(),
                    person.mainLanguage(),
                    person.email(),
                    person.address(),
                    person.phoneNumber(),
                    LocalDate.parse(person.dateOfBirth())
            );
        } catch (DateTimeParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static PersonDTO entityToRecord(Person person) {
        return new PersonDTO(
                person.getName(),
                person.getMainLanguage(),
                person.getEmail(),
                person.getAddress(),
                person.getPhoneNumber(),
                DATE_FORMAT.format(person.getDateOfBirth())
        );
    }
}