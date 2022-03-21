/*
 * Akeyless API
 * The purpose of this application is to provide access to Akeyless API.
 *
 * The version of the OpenAPI document: 2.0
 * Contact: support@akeyless.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.akeyless.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SetRoleRule
 */

public class SetRoleRule {
  public static final String SERIALIZED_NAME_CAPABILITY = "capability";
  @SerializedName(SERIALIZED_NAME_CAPABILITY)
  private List<String> capability = new ArrayList<String>();

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_ROLE_NAME = "role-name";
  @SerializedName(SERIALIZED_NAME_ROLE_NAME)
  private String roleName;

  public static final String SERIALIZED_NAME_RULE_TYPE = "rule-type";
  @SerializedName(SERIALIZED_NAME_RULE_TYPE)
  private String ruleType = "item-rule";

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public SetRoleRule capability(List<String> capability) {
    
    this.capability = capability;
    return this;
  }

  public SetRoleRule addCapabilityItem(String capabilityItem) {
    this.capability.add(capabilityItem);
    return this;
  }

   /**
   * List of the approved/denied capabilities in the path options: [read, create, update, delete, list, deny]
   * @return capability
  **/
  @ApiModelProperty(required = true, value = "List of the approved/denied capabilities in the path options: [read, create, update, delete, list, deny]")

  public List<String> getCapability() {
    return capability;
  }


  public void setCapability(List<String> capability) {
    this.capability = capability;
  }


  public SetRoleRule path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * The path the rule refers to
   * @return path
  **/
  @ApiModelProperty(required = true, value = "The path the rule refers to")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public SetRoleRule roleName(String roleName) {
    
    this.roleName = roleName;
    return this;
  }

   /**
   * The role name to be updated
   * @return roleName
  **/
  @ApiModelProperty(required = true, value = "The role name to be updated")

  public String getRoleName() {
    return roleName;
  }


  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  public SetRoleRule ruleType(String ruleType) {
    
    this.ruleType = ruleType;
    return this;
  }

   /**
   * item-rule, target-rule, role-rule, auth-method-rule, search-rule or reports-rule
   * @return ruleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "item-rule, target-rule, role-rule, auth-method-rule, search-rule or reports-rule")

  public String getRuleType() {
    return ruleType;
  }


  public void setRuleType(String ruleType) {
    this.ruleType = ruleType;
  }


  public SetRoleRule token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;)
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Authentication token (see `/auth` and `/configure`)")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public SetRoleRule uidToken(String uidToken) {
    
    this.uidToken = uidToken;
    return this;
  }

   /**
   * The universal identity token, Required only for universal_identity authentication
   * @return uidToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The universal identity token, Required only for universal_identity authentication")

  public String getUidToken() {
    return uidToken;
  }


  public void setUidToken(String uidToken) {
    this.uidToken = uidToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetRoleRule setRoleRule = (SetRoleRule) o;
    return Objects.equals(this.capability, setRoleRule.capability) &&
        Objects.equals(this.path, setRoleRule.path) &&
        Objects.equals(this.roleName, setRoleRule.roleName) &&
        Objects.equals(this.ruleType, setRoleRule.ruleType) &&
        Objects.equals(this.token, setRoleRule.token) &&
        Objects.equals(this.uidToken, setRoleRule.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capability, path, roleName, ruleType, token, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetRoleRule {\n");
    sb.append("    capability: ").append(toIndentedString(capability)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

