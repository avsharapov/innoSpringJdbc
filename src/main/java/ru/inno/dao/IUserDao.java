package ru.inno.dao;

import ru.inno.model.User;

import java.util.List;

public interface IUserDao {
    int getCountOfUsers();

    User getUser(final int id);

    List<User> getAllUsers();

    int addUser(final int id);

    int addUserUsingSimpleJdbcInsert(final User emp);

    void addUserUsingExecuteMethod();

    String getUserUsingMapSqlParameterSource();

    int getUserUsingBeanPropertySqlParameterSource();

    int[] batchUpdateUsingJDBCTemplate(final List<User> users);

    int[] batchUpdateUsingNamedParameterJDBCTemplate(final List<User> users);

    User getUserUsingSimpleJdbcCall(int id);

    void clearTable();
}
