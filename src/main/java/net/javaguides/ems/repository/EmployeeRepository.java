package net.javaguides.ems.repository;

import net.javaguides.ems.entity.Employee;
import net.javaguides.ems.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
