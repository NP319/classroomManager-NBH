package org.unit2.classmanagercopilot.repository;

import org.unit2.classmanagercopilot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}