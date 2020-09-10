package real_spring.quoters;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import my_spring.InjectByType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author Evgeny Borisov
 */

@Component
public class TalkingRobotImpl implements TalkingRobot {


    @Setter
    @Autowired
    private List<Quoter> quoters;



    @Override
    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }
}
