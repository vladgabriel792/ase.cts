package tests;


import classes.CategorySlowClass;
import classes.Person;
import mock.PersonMock;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class TestPersonDetAvgTestTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{

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
        Person pers = new Person();
        double[] cost = {
                70.00,
                90.00,
                95.00, 100
        };
        pers.setCostsReceipts(cost);

        double resultActual = pers.getAverageCosts();

        assertEquals(88.75,resultActual,0.01);
    }

    @Test
    public void testOrdering() throws Exception {
        Person pers = new Person();
        double[] cost = {
                100.00,
                95.00,
                90.00, 70.00
        };
        pers.setCostsReceipts(cost);

        double resultActual = pers.getAverageCosts();

        assertEquals(88.75,resultActual,0.01);
    }

    @Test(expected = Exception.class)
    public void testExistence() throws Exception {
        Person pers = new Person();
        pers.getAverageCosts();
    }

    @Test(expected = Exception.class)
    public void testCardinality0() throws Exception {
        Person pers = new Person();
        double[] cost = {
        };
        pers.setCostsReceipts(cost); //

        pers.getAverageCosts();
    }

    @Category(CategorySlowClass.class)
    @Test
    public void testCardinality1() throws Exception {
        Person pers = new Person();
        double[] cost = {
                70.00
        };
        pers.setCostsReceipts(cost);

        double result = pers.getAverageCosts();
        assertEquals(1, pers.getCostsReceipts().length);
    }


}
