package in.ashokit.dao;

import in.ashokit.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserDao {

    @Autowired
    List<Users> usersList;

    public List<Users> findAll(){
        return usersList;
    }

    public Optional<Users> findById(int id){
       return  usersList.stream().filter(x->x.getId()==id).findFirst();
    }
}
