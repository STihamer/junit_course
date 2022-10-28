package com.junit.junitProject;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
//@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
class DemoUtilsTest {
    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach() {
        demoUtils = new DemoUtils();
        //System.out.println("@BeforeEach executes before the execution of each test method");
    }


    @Test
    //@DisplayName("Equals and not Equals")
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
    //@DisplayName("Null and not null")
    void testNullAndNotNull() {
        //System.out.println("Running test: testNullAndNotNull");
        String str1 = null;
        String str2 = "luvcode";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
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