package com.example.gate;
import jakarta.persistence.Entity; import jakarta.persistence.Id;
@Entity public class GateOperation {
 @Id private int gateId; private int containerId; private String vehicleNumber; private String operation; private String status;
 public int getGateId(){return gateId;} public void setGateId(int v){gateId=v;}
 public int getContainerId(){return containerId;} public void setContainerId(int v){containerId=v;}
 public String getVehicleNumber(){return vehicleNumber;} public void setVehicleNumber(String v){vehicleNumber=v;}
 public String getOperation(){return operation;} public void setOperation(String v){operation=v;}
 public String getStatus(){return status;} public void setStatus(String v){status=v;}
}
