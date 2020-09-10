package real_spring.quoters;

import com.google.j2objc.annotations.Property;
import lombok.Setter;
import my_spring.InjectRandomInt;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */

@Component
@PropertySource("classpath:application.properties")
public class ShakespeareQuoter implements Quoter {
    @Setter
    @Value("poor Joric")
    private String message;

    @InjectRandomInt(min = 4,max = 7)
    private int repeat;


    @PostConstruct
    public void init(){
        System.out.println("repeat = " + repeat);
    }


    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }

}


