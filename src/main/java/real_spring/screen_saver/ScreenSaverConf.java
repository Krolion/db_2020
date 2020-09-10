package real_spring.screen_saver;

import heroes.RandomUtil;
import org.springframework.context.annotation.*;
import real_spring.qualifiers_example.DeutscheBankConfig;

import java.awt.*;

import static heroes.RandomUtil.getIntBetween;

/**
 * @author Evgeny Borisov
 */
@DeutscheBankConfig
public class ScreenSaverConf {




    @Bean
    @Scope("prototype")
    public Color color(){
        return new Color(getIntBetween(0, 255), getIntBetween(0, 255), getIntBetween(0, 255));
    }



    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScreenSaverConf.class);
        while (true) {
            ColorFrame colorFrame = context.getBean(ColorFrame.class);
            colorFrame.moveToRandomLocation();
            Thread.sleep(80);
        }
    }
}
