package com.cjc.demo.repositary;

import org.springframework.data.repository.CrudRepository;

import com.cjc.demo.model.Invoice;

public interface HomeRepositary extends CrudRepository<Invoice, Integer>{

}
