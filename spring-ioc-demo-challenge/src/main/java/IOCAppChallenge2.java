import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class IOCAppChallenge2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-challenge.xml");
		City c = (City) ctx.getBean("myorg");
		c.cityName();
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
