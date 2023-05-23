package gcumsa.common;

import gcumsa.InHelloApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { InHelloApplication.class })
public class CucumberSpingConfiguration {}
