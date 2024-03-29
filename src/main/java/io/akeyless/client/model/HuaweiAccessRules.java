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
 * HuaweiAccessRules
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HuaweiAccessRules {
  public static final String SERIALIZED_NAME_AUTH_ENDPOINT = "auth_endpoint";
  @SerializedName(SERIALIZED_NAME_AUTH_ENDPOINT)
  private String authEndpoint;

  public static final String SERIALIZED_NAME_DOMAIN_ID = "domain_id";
  @SerializedName(SERIALIZED_NAME_DOMAIN_ID)
  private List<String> domainId = null;

  public static final String SERIALIZED_NAME_DOMAIN_NAME = "domain_name";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  private List<String> domainName = null;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenant_id";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private List<String> tenantId = null;

  public static final String SERIALIZED_NAME_TENANT_NAME = "tenant_name";
  @SerializedName(SERIALIZED_NAME_TENANT_NAME)
  private List<String> tenantName = null;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private List<String> userId = null;

  public static final String SERIALIZED_NAME_USER_NAME = "user_name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private List<String> userName = null;

  public HuaweiAccessRules() { 
  }

  public HuaweiAccessRules authEndpoint(String authEndpoint) {
    
    this.authEndpoint = authEndpoint;
    return this;
  }

   /**
   * The auth URL.
   * @return authEndpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The auth URL.")

  public String getAuthEndpoint() {
    return authEndpoint;
  }


  public void setAuthEndpoint(String authEndpoint) {
    this.authEndpoint = authEndpoint;
  }


  public HuaweiAccessRules domainId(List<String> domainId) {
    
    this.domainId = domainId;
    return this;
  }

  public HuaweiAccessRules addDomainIdItem(String domainIdItem) {
    if (this.domainId == null) {
      this.domainId = new ArrayList<String>();
    }
    this.domainId.add(domainIdItem);
    return this;
  }

   /**
   * The list of domain ids that the login is restricted to.
   * @return domainId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of domain ids that the login is restricted to.")

  public List<String> getDomainId() {
    return domainId;
  }


  public void setDomainId(List<String> domainId) {
    this.domainId = domainId;
  }


  public HuaweiAccessRules domainName(List<String> domainName) {
    
    this.domainName = domainName;
    return this;
  }

  public HuaweiAccessRules addDomainNameItem(String domainNameItem) {
    if (this.domainName == null) {
      this.domainName = new ArrayList<String>();
    }
    this.domainName.add(domainNameItem);
    return this;
  }

   /**
   * The list of domainNames that the login is restricted to.
   * @return domainName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of domainNames that the login is restricted to.")

  public List<String> getDomainName() {
    return domainName;
  }


  public void setDomainName(List<String> domainName) {
    this.domainName = domainName;
  }


  public HuaweiAccessRules tenantId(List<String> tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

  public HuaweiAccessRules addTenantIdItem(String tenantIdItem) {
    if (this.tenantId == null) {
      this.tenantId = new ArrayList<String>();
    }
    this.tenantId.add(tenantIdItem);
    return this;
  }

   /**
   * The list of tenantIDs  that the login is restricted to.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of tenantIDs  that the login is restricted to.")

  public List<String> getTenantId() {
    return tenantId;
  }


  public void setTenantId(List<String> tenantId) {
    this.tenantId = tenantId;
  }


  public HuaweiAccessRules tenantName(List<String> tenantName) {
    
    this.tenantName = tenantName;
    return this;
  }

  public HuaweiAccessRules addTenantNameItem(String tenantNameItem) {
    if (this.tenantName == null) {
      this.tenantName = new ArrayList<String>();
    }
    this.tenantName.add(tenantNameItem);
    return this;
  }

   /**
   * The list of tenantNames  that the login is restricted to.
   * @return tenantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of tenantNames  that the login is restricted to.")

  public List<String> getTenantName() {
    return tenantName;
  }


  public void setTenantName(List<String> tenantName) {
    this.tenantName = tenantName;
  }


  public HuaweiAccessRules userId(List<String> userId) {
    
    this.userId = userId;
    return this;
  }

  public HuaweiAccessRules addUserIdItem(String userIdItem) {
    if (this.userId == null) {
      this.userId = new ArrayList<String>();
    }
    this.userId.add(userIdItem);
    return this;
  }

   /**
   * The list of user ids that the login is restricted to.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of user ids that the login is restricted to.")

  public List<String> getUserId() {
    return userId;
  }


  public void setUserId(List<String> userId) {
    this.userId = userId;
  }


  public HuaweiAccessRules userName(List<String> userName) {
    
    this.userName = userName;
    return this;
  }

  public HuaweiAccessRules addUserNameItem(String userNameItem) {
    if (this.userName == null) {
      this.userName = new ArrayList<String>();
    }
    this.userName.add(userNameItem);
    return this;
  }

   /**
   * The list of user names that the login is restricted to.
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of user names that the login is restricted to.")

  public List<String> getUserName() {
    return userName;
  }


  public void setUserName(List<String> userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HuaweiAccessRules huaweiAccessRules = (HuaweiAccessRules) o;
    return Objects.equals(this.authEndpoint, huaweiAccessRules.authEndpoint) &&
        Objects.equals(this.domainId, huaweiAccessRules.domainId) &&
        Objects.equals(this.domainName, huaweiAccessRules.domainName) &&
        Objects.equals(this.tenantId, huaweiAccessRules.tenantId) &&
        Objects.equals(this.tenantName, huaweiAccessRules.tenantName) &&
        Objects.equals(this.userId, huaweiAccessRules.userId) &&
        Objects.equals(this.userName, huaweiAccessRules.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authEndpoint, domainId, domainName, tenantId, tenantName, userId, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HuaweiAccessRules {\n");
    sb.append("    authEndpoint: ").append(toIndentedString(authEndpoint)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

