package com.example.yard;
import org.springframework.beans.factory.annotation.Autowired; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController public class YardSlotController {
 @Autowired YardSlotRepository yr;
 @PostMapping("/yard/insert") public YardSlot insert(@RequestBody YardSlot y){return yr.save(y);}
 @GetMapping("/yard/retrieve/{id}") public YardSlot retrieve(@PathVariable int id){return yr.findById(id).orElse(null);}
 @GetMapping("/yard/all") public List<YardSlot> all(){return yr.findAll();}
 @PutMapping("/yard/place/{slotId}/{containerId}") public String place(@PathVariable int slotId,@PathVariable int containerId){
  YardSlot y=yr.findById(slotId).orElse(null); if(y==null)return "Yard Slot Not Available"; y.setContainerId(containerId); y.setStatus("OCCUPIED"); yr.save(y); return "Container Placed In Yard";
 }
 @PutMapping("/yard/release/{slotId}") public String release(@PathVariable int slotId){
  YardSlot y=yr.findById(slotId).orElse(null); if(y==null)return "Yard Slot Not Available"; y.setContainerId(0); y.setStatus("AVAILABLE"); yr.save(y); return "Yard Slot Released";
 }
 @PutMapping("/yard/loading/{slotId}") public String loading(@PathVariable int slotId){return update(slotId,"LOADING");}
 @PutMapping("/yard/unloading/{slotId}") public String unloading(@PathVariable int slotId){return update(slotId,"UNLOADING");}
 private String update(int id,String s){YardSlot y=yr.findById(id).orElse(null);if(y==null)return "Yard Slot Not Available";y.setStatus(s);yr.save(y);return "Yard Slot Updated: "+s;}
}
