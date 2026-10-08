package com.example.carrier;
import jakarta.persistence.Entity; import jakarta.persistence.Id;
@Entity public class Carrier {
 @Id private int cid; private String cname; private String contact;
 public int getCid(){return cid;} public void setCid(int v){cid=v;}
 public String getCname(){return cname;} public void setCname(String v){cname=v;}
 public String getContact(){return contact;} public void setContact(String v){contact=v;}
}
