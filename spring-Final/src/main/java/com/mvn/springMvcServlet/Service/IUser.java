//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.mvn.springMvcServlet.Service;

import com.mvn.springMvcServlet.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUser extends CrudRepository<User, Integer> {
    User findUserByUserNameAndPassWord(String userName, String password);
    User findUserByUserName(String userName);

    User findUserById(int id);

    User findUserByMailAddress(String mailAddress);
}
