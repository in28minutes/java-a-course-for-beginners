package com.in28minutes.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.spring.learnspringframework.enterprise.example.web.MyWebController;
import com.in28minutes.spring.learnspringframework.game.GameRunner;

@SpringBootApplication
//@ComponentScan("com.in28minutes.spring.learnspringframework")
//@ComponentScan({"com.package1", "com.package2"})
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		

		//MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();

		//GamingConsole game = new MarioGame(); //1
		//GameRunner runner = new GameRunner(game); //2

		ConfigurableApplicationContext context 
					= SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
		
		
	}

}
