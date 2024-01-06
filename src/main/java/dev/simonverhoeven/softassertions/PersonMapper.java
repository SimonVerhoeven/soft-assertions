package dev.simonverhoeven.softassertions;

import java.text.SimpleDateFormat;

public class PersonMapper {

    public static PersonDTO entityToRecord(Person person) {
        return new PersonDTO(
                person.getName(),
                person.getMainLanguage(),
                person.getEmail(),
                person.getAddress(),
                person.getPhoneNumber(),
                person.getDateOfBirth().toString()
        );
    }
}