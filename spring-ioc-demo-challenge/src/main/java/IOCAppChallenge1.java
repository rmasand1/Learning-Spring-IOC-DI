import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCAppChallenge1 {

	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext(".\\src\\main\\resources\\beans-challenge.xml");
		City c = (City) ctx.getBean("myorg");
		c.cityName();
		((FileSystemXmlApplicationContext)ctx).close();

	}

}
