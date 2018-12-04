/*
 * This Java source file was generated by the Gradle 'init' task.
 */


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

final class LibraryTest {

    @Test
    void reverseStringReturnsEmptyListWhenGivenNull(){
        //Setup
        //Exercise
        List<String> actual = Library.reverseString(null);
        //Assert
        assertThat(actual.isEmpty(),is(true));
    }

    @Test
    void reverseStringReturnEmptyListWhenGivenEmptyList(){

        final List<String> actual = Library.reverseString(Collections.emptyList());

        assertThat(actual.isEmpty(),is(true));
    }

    @Test
    void reverseStringReturnsListWithOneReverseValues(){
        final List<String> actual = Library.reverseString(Collections.singletonList("foo"));

        assertThat(actual,contains("oof"));
    }

}
