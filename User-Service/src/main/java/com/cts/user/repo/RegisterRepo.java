package com.cts.user.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.user.entity.Register;

@Repository
public interface RegisterRepo extends CrudRepository<Register, Integer> {

	Optional<Register> findById(Integer userId);
}
