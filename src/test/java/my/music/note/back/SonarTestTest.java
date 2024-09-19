package my.music.note.back;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SonarTestTest {

    @Test
    void testJacoco() {

        SonarTest test = new SonarTest();
        assertEquals(1000,test.testJacoco());
        assertEquals(1000,test.testJacoco2());
        assertEquals(1000,test.testJacoco3());
        assertEquals(1000,test.testJacoco4());
    }

}