package guru.springframework.sfg_di_mert;

import guru.springframework.sfg_di_mert.controllers.ConstructorInjectedController;
import guru.springframework.sfg_di_mert.controllers.MyController;
import guru.springframework.sfg_di_mert.controllers.PropertyInjectedController;
import guru.springframework.sfg_di_mert.controllers.SetterInjectedController;
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



        System.out.println("--------- Property DI");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());


        System.out.println("--------- Setter DI");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());


        System.out.println("--------- Constructor DI");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

    }

}
