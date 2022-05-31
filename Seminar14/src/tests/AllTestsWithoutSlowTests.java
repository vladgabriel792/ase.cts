package tests;

import classes.CategorySlowClass;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//@RunWith(Suite.class)
@RunWith(Categories.class)
@Categories.ExcludeCategory(CategorySlowClass.class)
//@Categories.IncludeCategory
@Suite.SuiteClasses({TestPersonConstructor.class,TestPersonDetAvgTestTest.class})
public class AllTestsWithoutSlowTests {
}
