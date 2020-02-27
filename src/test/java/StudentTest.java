import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    private Student s1 = new Student("Heinrich Arends",12345);
    private Student s2 = new Student("Xavier Arends",67890);

    @Test
    public void testObjectEquality() {
        assertEquals("Heinrich Arends",s1.getName()); // reference variables are the same
        assertEquals(12345,s1.getStudentId()); // reference variables are the same

    }

    @Test
    public void testObjectIdentity() {
        Student s3 = s1;
        assertNotSame(s1,s2); // pointing to different object, hence the arguments does not correspond
        assertSame(s1,s3); // pointing to the same object, hence the arguments are the same
    }

    @Test
    public void testFail() {
        assertNotEquals(6789,s1.getStudentId()); //expecting test to fail, but pass, studentId not match
        assertNotEquals("Xavier Arends",s1.getName()); //expecting test fail, studentName not match
    }

    @Test(timeout = 1000)
    public void testTimeOut() {
        while (true); //infinite loop, expect to timeout after 1000ms
    }


    @Ignore("Please ignore the test, not completed")
    @Test
    public void testIgnoreMessage() {

    }
}