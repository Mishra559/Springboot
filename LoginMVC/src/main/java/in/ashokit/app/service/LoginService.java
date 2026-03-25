package in.ashokit.app.service;


import in.ashokit.app.entity.User;
import in.ashokit.app.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserRepo userRepo;

    public boolean saveUser(User user){
       if(userRepo.findByUserName(user.getUserName()) != null){
           return false;
       }
       else{
           userRepo.save(user);
           return true;
       }
    }

    public User loginUser(User user){
        User fromDB = userRepo.findByEmail(user.getEmail());
        if(fromDB != null){
            if(fromDB.getPassword().equals(user.getPassword())){
                return fromDB;
            }
        }
        return null;
    }
}
