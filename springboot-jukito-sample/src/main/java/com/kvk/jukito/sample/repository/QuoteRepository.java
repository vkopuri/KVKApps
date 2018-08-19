package com.kvk.jukito.sample.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kvk.jukito.sample.entity.QuoteEntity;

@Repository
public interface QuoteRepository extends JpaRepository<QuoteEntity,Integer> {

	public Optional<QuoteEntity> findByCcy(String ccy);
}
