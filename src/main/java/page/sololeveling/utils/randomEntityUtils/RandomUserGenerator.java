package page.sololeveling.utils.randomEntityUtils;

import com.github.javafaker.Faker;
import page.sololeveling.entity.Category;
import page.sololeveling.entity.User;


public class RandomUserGenerator {

    Faker faker = new Faker();

    public String randomFirstName(){
        return faker.name().firstName();
    }

    public String randomLastName(){
        return faker.name().lastName();
    }

    public String randomEmail(){
        return faker.internet().emailAddress();
    }

    public String randomPassword(){
        return faker.internet().password();
    }

    public String randomUsername(){
        return faker.name().username();
    }

    public User randomize(){
        return new User(randomFirstName(),randomLastName(),randomEmail(),randomUsername(),randomPassword());
    }



//    public Category CategoryName(){
//        return new Category("ElenHouse");
//    }
    public String randomName(){
        return faker.name().name();
    }

}
