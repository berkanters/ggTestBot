package testSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import testCase.CartPageTest;
import testCase.HomePageTest;
import testCase.LoginPageTest;
import testCase.SearchPageTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	HomePageTest.class,
	LoginPageTest.class,
	SearchPageTest.class,
	CartPageTest.class
})

public class AllPageTests {

}
