package com.example;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

 interface ReadingListRepository extends JpaRepository<Book,Long> {
	List<Book> findByReader(String reader);
}
