package ru.inno;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.inno.dao.UserDao;
import ru.inno.model.User;
import ru.inno.service.UserOperationService;

import java.util.Arrays;
import java.util.List;

public final class App {
  private static final Logger logger = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
    ApplicationContext context =
        new ClassPathXmlApplicationContext("/application-context.xml");

    final UserDao userDao = context.getBean(UserDao.class);
    final UserOperationService userOperationService = context.getBean(UserOperationService.class);
    userDao.addUser(1);
    logger.info("{}", userDao.getAllUsers());
    logger.info("{}", userDao.getCountOfUsers());

    List<User> users = Arrays.asList(new User(2, "Anton", "Antonov", "Kazan"),
        new User(3, "Ivan", "Ivanov", "Innopolis"));

    userOperationService.addUsers(users);

    userDao.clearTable();
  }
}
