package spring_demo.spring_boot_jpa_mysql;
import org.springframework.data.repository.CrudRepository;

import spring_demo.spring_boot_jpa_mysql.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}
