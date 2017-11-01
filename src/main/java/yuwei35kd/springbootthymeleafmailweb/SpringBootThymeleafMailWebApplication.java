package yuwei35kd.springbootthymeleafmailweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.thymeleaf.templateresolver.ITemplateResolver;

@SpringBootApplication
@ComponentScan(basePackages={"thymeleafexamples.springmail"})
public class SpringBootThymeleafMailWebApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootThymeleafMailWebApplication.class, args);
		ITemplateResolver resolver = context.getBean(ITemplateResolver.class);
		System.out.println(resolver);
	}
}
