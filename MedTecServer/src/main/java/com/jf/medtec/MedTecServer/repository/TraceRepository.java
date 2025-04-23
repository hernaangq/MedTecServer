package com.jf.medtec.MedTecServer.repository;


import org.springframework.data.repository.CrudRepository;
import com.jf.medtec.MedTecServer.model.Trace;

public interface TraceRepository extends CrudRepository<Trace, Long> {
}