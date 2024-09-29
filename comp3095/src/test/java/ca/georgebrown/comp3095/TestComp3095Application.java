package ca.georgebrown.comp3095;

import org.springframework.boot.SpringApplication;

public class TestComp3095Application {

    public static void main(String[] args) {
        SpringApplication.from(Comp3095Application::main).with(TestcontainersConfiguration.class).run(args);
    }

}
