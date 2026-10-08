package com.example.container;
import jakarta.persistence.Entity; import jakarta.persistence.Id;
@Entity public class Container {
 @Id private int containerId; private String containerNumber; private int carrierId; private String status; private int yardSlotId;
 public int getContainerId(){return containerId;} public void setContainerId(int v){containerId=v;}
 public String getContainerNumber(){return containerNumber;} public void setContainerNumber(String v){containerNumber=v;}
 public int getCarrierId(){return carrierId;} public void setCarrierId(int v){carrierId=v;}
 public String getStatus(){return status;} public void setStatus(String v){status=v;}
 public int getYardSlotId(){return yardSlotId;} public void setYardSlotId(int v){yardSlotId=v;}
}
