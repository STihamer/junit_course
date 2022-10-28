package com.junit.junitProject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
//@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
//@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
class DemoUtilsTest {
    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach() {
        demoUtils = new DemoUtils();
        //System.out.println("@BeforeEach executes before the execution of each test method");
    }


    @Test
    @DisplayName("Equals and not Equals")
    void testEqualsAndNotEquals() {
        //System.out.println("Running test: testEqualsAndNotEquals");

        //setup

        int expected = 6;
        int unexpected = 8;

        //execute
        int actual = demoUtils.add(2, 4); //we can combine the execution and assertion together


        //assert
        //assertEquals(expected, actual);
        //assertNotEquals(unexpected, actual);
        //assertNotEquals(unexpectedValue, actual, "optional message if test fails")
        assertEquals(expected, demoUtils.add(2, 4), "The result must be 6"); //we can combine the execution and
        // assertion together
    }

    @Test
    @DisplayName("Null and not null")
    void testNullAndNotNull() {
        //System.out.println("Running test: testNullAndNotNull");
        String str1 = null;
        String str2 = "luvcode";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
    }

    @DisplayName("Same and not Same")
    @Test
    void testSameAndNotSame() {
        String str = "luv2code";
        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Object should refer to same object");
        assertNotSame(str, demoUtils.getAcademy(), "Objects should not refer to same object");
    }

    @DisplayName("True and false")
    @Test
    void testTrueFalse() {
        int gradeOne = 10;
        int gradeTwo = 5;
        assertTrue(demoUtils.isGreater(gradeOne, gradeTwo), "This should return true");
        assertFalse(demoUtils.isGreater(gradeTwo, gradeOne), "This should return false");
    }

    @DisplayName("Array Equals")
    @Test
    void testArrayEquals() {

        String[] stringArray = {"A", "B", "C"};
        assertArrayEquals(stringArray, demoUtils.getFirstThreeLettersOfAlphabet(), "Arrays should be the same");
    }

    @DisplayName("Iterable equals")
    @Test
    void testIterableEquals() {
        List<String> theList = List.of("luv", "2", "code");
        assertIterableEquals(theList, demoUtils.getAcademyInLst(), "Expected List should be same as actual list");
    }

    @DisplayName("Lines match")
    @Test
    void testLinesMatch() {
        List<String> theList = List.of("luv", "2", "code");
        assertLinesMatch(theList, demoUtils.getAcademyInLst(), "Lines should match");
    }

    @DisplayName("Throws and Does Not Throw")
    @Test
    void testThrowsAndDoesNotThrow() {
        assertThrows(Exception.class, () -> {
            demoUtils.throwException(-1);
        }, "Should throw exception");
        assertDoesNotThrow(() -> {
            demoUtils.throwException(5);
        }, "Should throw exception");
    }

    @DisplayName("Timeout")
    @Test
    void TestTimeout() {
        assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
            demoUtils.checkTimeout();
        }, "Method should execute in 3" +
                " seconds");
    }


   /* @AfterEach
    void tearDownAfterEach() {
        System.out.println("Running @After Each");
        System.out.println();
    }

    @BeforeAll
    static void setupBeforeEachClass() {
        System.out.println("@BeforeAll executes only once before all test methods execution in the class");
        System.out.println();
    }

    @AfterAll
    static void tearDownAfterAll() {
        System.out.println("@AfterAll executes only once after all test methods execution in the class");
        System.out.println();
    }
*/
}