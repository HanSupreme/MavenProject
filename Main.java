package academy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);
    private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {
    log.info("Guess the Number Game: ");

    //Creating context (Container)
        ConfigurableApplicationContext context
                = new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        NumberGenerator numberGenerator
                = context.getBean("numberGenerator", NumberGenerator.class);

        //call Method next() to get a random number
        int number = numberGenerator.next();

        //log generated number
        log.info("Number = {}", number);

        //close context (Container)
        context.close();

    }
}
