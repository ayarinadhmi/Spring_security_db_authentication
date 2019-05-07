package com.ayari.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayari.model.Task;

public interface TaskRepository extends JpaRepository<Task,Long> {

}
