package ie.com.mymoney.mymoney.repository;

import org.springframework.data.repository.CrudRepository;

import ie.com.mymoney.mymoney.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
