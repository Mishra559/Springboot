package in.ashokit.app.runner;

import in.ashokit.app.entity.Passport;
import in.ashokit.app.entity.Person;
import in.ashokit.app.repository.PassportRepo;
import in.ashokit.app.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
public class MyRunner implements ApplicationRunner {

    @Autowired
    private PassportRepo passportRepo;

    @Autowired
    private PersonRepo personRepo;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        savePassportWithPerson();

//        savePersonWithPassport();

        fetchPerson();

    }

    private void fetchPerson() {

        System.out.println(personRepo.findById(101).get());

    }

    private void savePersonWithPassport() {
        Person person = new Person();
        person.setId(102);
        person.setName("Shekher");

        Passport passport = new Passport();
        passport.setId("HAH124");
        passport.setExpiryDate(LocalDate.of(2026,5,18));

        person.setPassport(passport);

        personRepo.save(person);
    }

    private void savePassportWithPerson() {
        Passport passport = new Passport();
        passport.setId("HAH123");
        passport.setExpiryDate(LocalDate.of(2026,8,12));

        Person person = new Person();
        person.setId(101);
        person.setName("Ashok");

        passport.setPerson(person);
        passportRepo.save(passport);

    }
}
