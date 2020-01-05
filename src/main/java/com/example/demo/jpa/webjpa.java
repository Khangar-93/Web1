package com.example.demo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.web;

public interface webjpa extends JpaRepository<web, Long> {

	/*web flush(web entity);*/

}
