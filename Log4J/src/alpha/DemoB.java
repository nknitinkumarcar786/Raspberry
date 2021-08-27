package alpha;
import org.apache.logging.log4j.*;
public class DemoB
{
	private static Logger log = LogManager.getLogger(DemoB.class.getName());
	public static void main(String[] args)
	{
		log.debug("Debugging");
		log.info("Its true");
		log.error("Its False");
		log.fatal("Its Fatal");
	}
}
