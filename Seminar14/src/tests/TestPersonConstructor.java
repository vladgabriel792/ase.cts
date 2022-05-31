package tests;

import mock.PersonMock;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestPersonConstructor {
    static PersonMock pm;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        pm = new PersonMock();
    }
    @BeforeClass
    public static void tearDownAfterClass() throws Exception{

    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }



    @Test
    public void testConformance() throws Exception {
        assertTrue(true);
    }

    @Test
    public void testOrdering() throws Exception {
       assertTrue(true);
    }

    @Test
    public void testExistence() {
        assertTrue(true);
    }

    @Test
    public void testCardinality()
    {
        assertTrue(true);
    }
}
