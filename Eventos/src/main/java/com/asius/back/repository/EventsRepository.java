package com.asius.back.repository;




import com.asius.back.entity.Events;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventsRepository extends JpaRepository<Events,Long> {
}
