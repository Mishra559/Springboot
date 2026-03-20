package in.ashokit.service;

import in.ashokit.dao.UserDao;
import in.ashokit.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public List<Users> fetchAll(){
        return userDao.findAll();
    }

    public void fetchById(int id){

        userDao.findById(id).ifPresent(System.out::println);
    }

}
