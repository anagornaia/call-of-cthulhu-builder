package io.anagornii.callofcthulhu.characterbuilderservice;

import org.springframework.boot.SpringApplication;

public class TestCharacterBuilderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.from(CharacterBuilderServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
