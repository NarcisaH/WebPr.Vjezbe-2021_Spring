package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

}
