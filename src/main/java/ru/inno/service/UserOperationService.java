package ru.inno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ru.inno.dao.UserDao;
import ru.inno.model.User;

import java.util.List;

@Service
public class UserOperationService {
  @Autowired
  private UserDao userDao;

  @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.SERIALIZABLE)
  public void addUsers(List<User> users) {
    for (User user : users) {
      userDao.addUserUsingSimpleJdbcInsert(user);
    }
  }
}
