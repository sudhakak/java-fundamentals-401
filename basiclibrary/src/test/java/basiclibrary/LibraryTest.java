/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test public void testRoll()
    {
    Library libraryToTest = new Library();
    int rollCount = 10;
    int[] rolledNumArray = libraryToTest.roll(rollCount);
    for(int i=0; i<rolledNumArray.length; i++){
        assertTrue("Rolled Number is out of range", 0<=rolledNumArray[i] && rolledNumArray[i]<=6 );
    }
    }
}
