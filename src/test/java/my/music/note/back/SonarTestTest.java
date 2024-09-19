package my.music.note.back;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SonarTestTest {

    @Test
    void testJacoco() {

        SonarTest test = new SonarTest();
        assertEquals(1000,test.testJacoco());
        assertEquals(10000,test.testJacoco2());
    }

}