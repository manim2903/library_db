package com.example.LMSbackend.Repository;

import com.example.LMSbackend.Models.Student;
import com.example.LMSbackend.RequestDto.StudentRequestDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {


}
