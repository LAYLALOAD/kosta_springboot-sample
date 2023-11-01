package com.example.sample.repository;

import com.example.sample.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {
  @Autowired
  StudentRepository studentRepository;
  @Test
  void findAll() {
    // given -- 데이터가 주어지면
    // when -- 어떤 테스트를 하면
    List<Student> allStudent = studentRepository.findAll();
    // then -- 결과가 ~이면
    assertThat(allStudent).isEqualTo(1);

  }
}