package com.tinu.flight.reservation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tinu.flight.reservation.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
