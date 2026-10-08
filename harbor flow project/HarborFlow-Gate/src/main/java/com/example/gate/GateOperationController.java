package com.example.gate;
import org.springframework.beans.factory.annotation.Autowired; import org.springframework.web.bind.annotation.*; import org.springframework.web.client.RestTemplate;
@RestController public class GateOperationController {
 @Autowired GateOperationRepository gr; @Autowired RestTemplate rt;
 @PostMapping("/gate/checkin") public String checkin(@RequestBody GateOperation g){
  Object c=rt.getForObject("http://localhost:9093/container/retrieve/"+g.getContainerId(),Object.class);
  if(c==null)return "Container Not Available"; g.setOperation("CHECK_IN");g.setStatus("CHECKED_IN");gr.save(g);
  return "Container Check-In Successful";
 }
 @GetMapping("/gate/retrieve/{id}") public GateOperation retrieve(@PathVariable int id){return gr.findById(id).orElse(null);}
}
