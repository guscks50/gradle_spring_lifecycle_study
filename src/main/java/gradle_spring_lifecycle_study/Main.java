package gradle_spring_lifecycle_study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.w3c.dom.ls.LSInput;

import gradle_spring_lifecycle_study.config.AppCtx;
import gradle_spring_lifecycle_study.spring.Client;
import gradle_spring_lifecycle_study.spring.Client2;

public class Main {

	public static void main(String[] args) {
		try(AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class)){
			Client client = ctx.getBean(Client.class);
			client.setHost("host");
			client.send();
			
			Client2 client2 = ctx.getBean(Client2.class);
			client2.setHost("host2");
			client2.send();
		}

	}

}
