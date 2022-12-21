//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.mvn.springMvcServlet.Service;

import com.mvn.springMvcServlet.model.DetailMail;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetail extends CrudRepository<DetailMail, Integer> {
    List<DetailMail> findAll();
}
