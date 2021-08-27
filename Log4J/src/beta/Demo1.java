package beta;
import org.apache.logging.log4j.*;
public class Demo1
{
	private static Logger log = LogManager.getLogger(Demo1.class.getName());
	public static void main(String[] args)
	{
		log.debug("Debugging");
		log.info("Its true");
		log.error("Its False");
		log.fatal("Its Fatal");
	}
}
