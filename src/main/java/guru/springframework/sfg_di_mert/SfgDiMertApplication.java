package guru.springframework.sfg_di_mert;

import guru.springframework.sfg_di_mert.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiMertApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiMertApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        String greeting = myController.sayHello();

        System.out.println(greeting);
    }

}
