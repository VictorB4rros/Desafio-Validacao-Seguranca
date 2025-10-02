package com.devsuperior.bds04.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.bds04.entities.Event;
import com.devsuperior.bds04.projections.EventProjection;

public interface EventRepository extends JpaRepository<Event, Long> {

	@Query(nativeQuery = true, value = """
			SELECT tb_event.id, tb_event.name, tb_event.date, tb_event.url, tb_city.name AS cityName
			FROM tb_event
			INNER JOIN tb_city ON tb_event.city_id = tb_city.id
			""")
	Page<EventProjection> searchAll(Pageable pageable);
}
