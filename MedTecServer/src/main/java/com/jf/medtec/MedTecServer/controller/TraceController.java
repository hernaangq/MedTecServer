package com.jf.medtec.MedTecServer.controller;


import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.jf.medtec.MedTecServer.model.Trace;
import com.jf.medtec.MedTecServer.repository.TraceRepository;


@RestController
public class TraceController {

  private final TraceRepository tr;
  
  public TraceController(TraceRepository tr) {
    this.tr = tr;
  }


  @GetMapping("/traces")
  List<Trace> all() {
    return (List<Trace>) tr.findAll();
  }


  @PostMapping("/traces")
  Trace newTraze(@RequestBody Trace newTrace) {
    return tr.save(newTrace);
  }


  @GetMapping("/traces/{id}")
  Trace one(@PathVariable Long id) {
    return tr.findById(id).orElseThrow();
  }


  @PutMapping("/traces/{id}")
  Trace replaceTraze(@RequestBody Trace newTrace, @PathVariable Long id) {
    return tr.findById(id).map(trace -> {
        trace.setTimestamp(newTrace.getTimestamp());
        trace.setLongitude(newTrace.getLongitude());
        trace.setLatitude(newTrace.getLatitude());
        trace.setTemperature(newTrace.getTemperature());
        trace.setNfc(newTrace.getNfc());
        trace.setArduino(newTrace.getArduino());
        return tr.save(trace);
    }).orElseGet(() -> {
        newTrace.setTraceId(id);
        return tr.save(newTrace);
    });
  }


  @DeleteMapping("/traces/{id}")
  void deleteTraze(@PathVariable Long id) {
    tr.deleteById(id);
  }

}

