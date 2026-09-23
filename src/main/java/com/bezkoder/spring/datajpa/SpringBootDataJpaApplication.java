package com.bezkoder.spring.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bezkoder.spring.datajpa.model.Tutorial;
import com.bezkoder.spring.datajpa.repository.TutorialRepository;

@SpringBootApplication
public class SpringBootDataJpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaApplication.class, args);
	}
	
	@Autowired
	private  TutorialRepository  tutorialRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Tutorial t = new Tutorial();
		t.setDescription("this sampel disrciple");
		t.setTitle("sampedV ASHDBV");
		t.setPublished(false);
		tutorialRepository.save(t);
		
		
	}
	
}
