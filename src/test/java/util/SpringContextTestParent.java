package util;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 * User: harry.chen
 * Date: 14-2-18
 * Time: 上午11:32
 */
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class SpringContextTestParent extends AbstractTestNGSpringContextTests {


}
