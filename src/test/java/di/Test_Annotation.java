package di;

import com.mycompany.springbasic1102.di.annotation.UserController;
import com.mycompany.springbasic1102.di.annotation.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:beans-config-3.xml"})
public class Test_Annotation {

    @Autowired
    private Users users;

    @Autowired
    private UserController userController;

    @Test
    public void t1() {
        System.out.println(users);

        //MVC模式
        //查詢所有users
        Users users = userController.getAll();
        System.out.println(users);
        //各別檢查john與rob是否在user“資料庫”
        Boolean check = userController.existByName("John");
        System.out.println(check);
    }
}
