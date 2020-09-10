package real_spring.quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;

/**
 * @author Evgeny Borisov
 */

@Component
@PropertySource("classpath:application.properties")
public class TerminatorQuoter implements Quoter {


    private List<String> messages;

    @Autowired
    public void setMessages(@Value("${terminator}") String[] messages) {
        this.messages = Arrays.asList(messages);
    }

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }

    @PostConstruct
    public void init() {
        System.out.println("Мне нужна твоя одежду, ботинки и мотоцикл");
    }

    @PreDestroy
    public void killAll() {
        System.out.println("you are terminated...");
    }


}



