package dev.simonverhoeven.softassertions;

import org.assertj.core.api.SoftAssertions;

public class CustomAssertJSoftAssertions extends SoftAssertions {

    public CustomPersonSoftAssertion assertThat(Person actual) {
        return proxy(CustomPersonSoftAssertion.class, Person.class, actual);
    }
}
