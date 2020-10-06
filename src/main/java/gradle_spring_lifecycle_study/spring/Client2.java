package gradle_spring_lifecycle_study.spring;

import org.springframework.stereotype.Component;

@Component
public class Client2 {
	private String host;

	public void setHost(String host) {
		this.host = host;
	}

	public void send() {
		System.out.println("Client2.send() to " + host);
	}


	public void close() {
		System.out.println("Client2.close() 실행");
	}

	public void connect() {
		System.out.println("Client2.connect() 실행");
	}
}
