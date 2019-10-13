package hai.com.creational.abstractfactory.abstract_factory_main;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import hai.com.creational.abstractfactory.accountfactory.TestAccountFactory;
import hai.com.creational.abstractfactory.bankfactory.TestBankFactory;

@RunWith(Suite.class)
@SuiteClasses({
	TestBankFactory.class,
	TestAccountFactory.class,
	TestFactoryProducer.class,
})
public class TestSuite {

	public static void result() {
		System.out.println("test end");
	}
}
