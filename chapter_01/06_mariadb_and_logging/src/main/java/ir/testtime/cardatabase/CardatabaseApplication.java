package ir.testtime.cardatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardatabaseApplication {
	 private static final Logger logger = LoggerFactory.getLogger(
		 CardatabaseApplication.class
	 );

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
		
		logger.trace("This is a TRACE message (most detailed level)");
        logger.debug("This is a DEBUG message (useful for debugging)");
        logger.info("This is an INFO message (general information)");
        logger.warn("This is a WARN message (something unexpected, but program still runs)");
        logger.error("This is an ERROR message (something went wrong, program may not work correctly)");
    }

}
