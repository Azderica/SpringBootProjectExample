package myepark.ebaykorea.springbootneo4j;

import myepark.ebaykorea.springbootneo4j.account.Account;
import myepark.ebaykorea.springbootneo4j.account.AccountRepository;
import myepark.ebaykorea.springbootneo4j.account.Role;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Neo4jRunner implements ApplicationRunner {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account account = new Account();
        account.setEmail("aaaa@email.com");
        account.setUsername("aaaa");

        Role role = new Role();
        role.setName("user");

        account.getRoles().add(role);

        accountRepository.save(account);

        System.out.println("finished");
    }
}
