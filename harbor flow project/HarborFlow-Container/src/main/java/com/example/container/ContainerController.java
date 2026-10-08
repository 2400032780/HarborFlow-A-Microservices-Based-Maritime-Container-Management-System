package com.example.container;
import org.springframework.beans.factory.annotation.Autowired; import org.springframework.web.bind.annotation.*; import org.springframework.web.client.RestTemplate; import java.util.*;
@RestController public class ContainerController {
 @Autowired ContainerRepository cr; @Autowired RestTemplate rt;
 @PostMapping("/container/insert") public Container insert(@RequestBody Container c){return cr.save(c);}
 @GetMapping("/container/retrieve/{id}") public Container retrieve(@PathVariable int id){return cr.findById(id).orElse(null);}
 @GetMapping("/container/all") public List<Container> all(){return cr.findAll();}
 @PutMapping("/container/update") public Container update(@RequestBody Container c){return cr.save(c);}
 @DeleteMapping("/container/delete/{id}") public String delete(@PathVariable int id){cr.deleteById(id);return "Container Deleted";}
 @PutMapping("/container/place/{containerId}/{slotId}") public String place(@PathVariable int containerId,@PathVariable int slotId){
  Container c=cr.findById(containerId).orElse(null); if(c==null)return "Container Not Available";
  String r=rt.put("http://localhost:9094/yard/place/"+slotId+"/"+containerId,null,String.class);
  c.setYardSlotId(slotId); c.setStatus("IN_YARD"); cr.save(c); return r;
 }
}
