package com.example.yard;
import jakarta.persistence.Entity; import jakarta.persistence.Id;
@Entity public class YardSlot {
 @Id private int slotId; private String slotCode; private int containerId; private String status;
 public int getSlotId(){return slotId;} public void setSlotId(int v){slotId=v;}
 public String getSlotCode(){return slotCode;} public void setSlotCode(String v){slotCode=v;}
 public int getContainerId(){return containerId;} public void setContainerId(int v){containerId=v;}
 public String getStatus(){return status;} public void setStatus(String v){status=v;}
}
