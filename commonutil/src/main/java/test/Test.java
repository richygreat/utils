package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.User;

public class Test {
	
	public static void main(String[] args) {
		lambdaTest();
	}

	public static void lambdaTest() {
		Runnable runnable = () -> System.out.println("Cool");
		runnable.run();

		List<User> users = new ArrayList<>();
		User user = new User();
		user.setUserId(1);
		user.setUserName("Richy");
		users.add(user);
		user = new User();
		user.setUserId(2);
		user.setUserName("Abraham");
		users.add(user);
		user = new User();
		user.setUserId(3);
		user.setUserName("John");
		users.add(user);
		user = new User();
		user.setUserId(4);
		user.setUserName("Santhosh");
		users.add(user);

		Collections.sort(users, (u1, u2) -> u1.getUserName().compareTo(u2.getUserName()));
		System.out.println(users);
	}

}
