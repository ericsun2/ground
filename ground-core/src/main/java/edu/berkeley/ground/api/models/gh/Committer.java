
package edu.berkeley.ground.api.models.gh;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({"name", "email", "username"})
public class Committer {

  @JsonProperty("name")
  private String name;

  @JsonProperty("email")
  private String email;

  @JsonProperty("username")
  private String username;

  @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  /** No args constructor for use in serialization */
  public Committer() {}

  /**
   * @param username
   * @param email
   * @param name
   */
  public Committer(String name, String email, String username) {
    this.name = name;
    this.email = email;
    this.username = username;
  }

  /** @return The name */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /** @param name The name */
  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /** @return The email */
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  /** @param email The email */
  @JsonProperty("email")
  public void setEmail(String email) {
    this.email = email;
  }

  /** @return The username */
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  /** @param username The username */
  @JsonProperty("username")
  public void setUsername(String username) {
    this.username = username;
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }
}
