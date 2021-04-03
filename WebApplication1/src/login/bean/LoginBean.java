/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfiya
 */
package   src.login.bean;
import java.io.Serializable;

public class LoginBean implements Serializable
{
    private static final long serialVersionUID = 1;
    private String loginid;
    private String firstname;
    private String lastname;
    //private String email;
    private String password;
    
  // Getter
  public String getFirstName() {
    return firstname;
  }
  // Setter
  public void setFirstName(String newFirstName) {
    this.firstname = newFirstName;
  }
  
  // Getter
  public String getLastName() {
    return lastname;
  }
  // Setter
  public void setLastName(String newLastName) {
    this.lastname = newLastName;
  }
  
  // Getter
  public String getLoginId() {
    return loginid;
  }
  // Setter
  public void setLoginId(String newLoginId) {
    this.loginid = newLoginId;
  }
  
  /*/ Getter
  public String getEmail() {
    return email;
  }
  // Setter
  public void setEmail(String newEmail) {
    this.email = newEmail;
  }*/
  
  // Getter
  public String getPassword() {
    return password;
  }
  // Setter
  public void setPassword(String newPassword) {
    this.password = newPassword;
  }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
