package gcumsa.common;

import gcumsa.OutHelloApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { OutHelloApplication.class })
public class CucumberSpingConfiguration {}
