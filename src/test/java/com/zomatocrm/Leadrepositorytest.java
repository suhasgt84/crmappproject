package com.zomatocrm;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.zomatocrm.entities.Lead;
import com.zomatocrm.repositories.Leadrepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class Leadrepositorytest {

	@Autowired
    private Leadrepository leadrepo;
	
	@Test
	public void saveonelead() {
		Lead l=new Lead("mike","m","mike@gmail.com","5666547857","online");
		leadrepo.save(l);
		
		assertThat(l.getId()).isGreaterThan(0);

	}
	@Test
	public void saverestlead() {
		Lead l1=new Lead("stallon","s","stallon@gmail.com","9899909878","radio");
		Lead l2=new Lead("dakk","d","dakk@gmail.com","8909008987","online");
		leadrepo.save(l1);
		leadrepo.save(l2);
		
		assertThat(l1.getId()).isGreaterThan(0);
		assertThat(l1.getId()).isGreaterThan(0);

	}

}
