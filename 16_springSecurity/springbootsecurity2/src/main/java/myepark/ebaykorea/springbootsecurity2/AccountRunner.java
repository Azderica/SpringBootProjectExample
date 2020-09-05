package myepark.ebaykorea.springbootsecurity2;

import myepark.ebaykorea.springbootsecurity2.account.Account;
import myepark.ebaykorea.springbootsecurity2.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner {

    @Autowired
    AccountService accountService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account myepark = accountService.createAccount("myepark", "1234");

        // 절대 출력하면 안됨. 그저 보여주기위해서.
        //System.out.println(myepark.getUsername() + ", " + myepark.getPassword());
    }
}
