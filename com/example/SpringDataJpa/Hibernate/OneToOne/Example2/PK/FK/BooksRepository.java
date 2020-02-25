package com.example.SpringDataJpa.Hibernate.OneToOne.Example2.PK.FK;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Books,Integer> {

}
