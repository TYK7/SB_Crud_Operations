package com.tyk;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tyk.entity.Player;
import com.tyk.repository.PlayerRepository;

@SpringBootApplication
public class SpringBootDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDataJpaApplication.class, args);
		PlayerRepository playerRepository = context.getBean("playerRepository", PlayerRepository.class);
		System.out.println(playerRepository.getClass().getName());
		Player p1= new Player();
		p1.setPlayerId(110);
		p1.setPlayerName("DineshKarthik");
		p1.setPlayerAge(36);
		p1.setPlayerLoction("Tamilanadu");
		playerRepository.save(p1);
//		Iterable<Player> findAll = playerRepository.findAll();
//		System.out.println(findAll);
//		System.out.println(playerRepository.count());
////		Optional<Player> findById = playerRepository.findById(101);
//		System.out.println(findById);
		System.out.println("Data Inserted");
	}

}
