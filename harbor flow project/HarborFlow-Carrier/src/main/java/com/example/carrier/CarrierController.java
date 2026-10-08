package com.example.carrier;
import org.springframework.beans.factory.annotation.Autowired; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController public class CarrierController {
 @Autowired CarrierRepository cr;
 @PostMapping("/carrier/insert") public Carrier insert(@RequestBody Carrier c){return cr.save(c);}
 @GetMapping("/carrier/retrieve/{id}") public Carrier retrieve(@PathVariable int id){return cr.findById(id).orElse(null);}
 @GetMapping("/carrier/all") public List<Carrier> all(){return cr.findAll();}
 @PutMapping("/carrier/update") public Carrier update(@RequestBody Carrier c){return cr.save(c);}
 @DeleteMapping("/carrier/delete/{id}") public String delete(@PathVariable int id){cr.deleteById(id);return "Carrier Deleted";}
}
