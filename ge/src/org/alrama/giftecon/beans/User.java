
package org.alrama.giftecon.beans;

// Start of user code for imports
import java.util.*;
// End of user code

public class User extends JSONSerializer {
  private Request[] requests;
  
  private int yearBirth;
  
  private String surname;
  
  private Testimony[] testimonies;
  
  private Good good;
  
  private String loginProvider;
  
  private Photo[] photos;
  
  private Byte[] dht_id;
  
  private String login;
  
  private String[] addresses;
  
  private String name;
  
  private Location location;
  
  private JSONSerializer jsonserializer;
  
  private Offer[] offers;
  
  
  public User() {
    super();
  }
  public void getLatestPhoto(String path) {
  }
  
  public void getLatestAddress(String address) {
  }
}
