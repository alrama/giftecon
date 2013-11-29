
package org.alrama.giftecon.beans;

// Start of user code for imports
import java.util.*;
// End of user code

public class User extends JSONSerializer {
  private Request[] ;
  
  private Int yearBirth;
  
  private Good good;
  
  private Location location;
  
  private String name;
  
  private JSONSerializer jsonserializer;
  
  private String login;
  
  private Byte[] dht_id;
  
  private String[] addresses;
  
  private String loginProvider;
  
  private String surname;
  
  private Photo[] photos;
  
  private Offer[] offers;
  
  private Testimony[] testimonies;
  
  
  public User() {
    super();
  }
  public void getLatestAddress(String address) {
  }
  
  public void getLatestPhoto(String path) {
  }
}
