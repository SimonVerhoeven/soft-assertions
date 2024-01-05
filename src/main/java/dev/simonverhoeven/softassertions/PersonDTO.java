package dev.simonverhoeven.softassertions;

public record PersonDTO(
        String name,
        String mainLanguage,
        String email,
        String address,
        String phoneNumber,
        String dateOfBirth)
{ }