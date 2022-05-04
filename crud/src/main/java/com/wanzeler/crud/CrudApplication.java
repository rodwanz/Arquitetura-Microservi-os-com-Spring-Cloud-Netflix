package com.wanzeler.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.wanzeler.crud.entities.Produto;

@SpringBootApplication
@EntityScan(basePackageClasses= Produto.class)
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
}
