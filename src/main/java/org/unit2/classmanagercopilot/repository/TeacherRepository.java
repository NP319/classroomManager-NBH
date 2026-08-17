package org.unit2.classmanagercopilot.repository;

import org.unit2.classmanagercopilot.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}