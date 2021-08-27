package alpha;
import org.apache.logging.log4j.*;
public class DemoA
{
	private static Logger log = LogManager.getLogger(DemoA.class.getName());
	public static void main(String[] args)
	{
		log.debug("Debugging");
				log.info("Its True");
			log.error("Its false");
		log.fatal("Its Fatal");
	}
}
