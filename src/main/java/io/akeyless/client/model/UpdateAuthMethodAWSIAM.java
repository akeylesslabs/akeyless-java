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
 * updateAuthMethodAWSIAM is a command that updates a new Auth Method that will be able to authenticate using AWS IAM credentials.
 */
@ApiModel(description = "updateAuthMethodAWSIAM is a command that updates a new Auth Method that will be able to authenticate using AWS IAM credentials.")

public class UpdateAuthMethodAWSIAM {
  public static final String SERIALIZED_NAME_ACCESS_EXPIRES = "access-expires";
  @SerializedName(SERIALIZED_NAME_ACCESS_EXPIRES)
  private Long accessExpires = 0l;

  public static final String SERIALIZED_NAME_BOUND_ARN = "bound-arn";
  @SerializedName(SERIALIZED_NAME_BOUND_ARN)
  private List<String> boundArn = null;

  public static final String SERIALIZED_NAME_BOUND_AWS_ACCOUNT_ID = "bound-aws-account-id";
  @SerializedName(SERIALIZED_NAME_BOUND_AWS_ACCOUNT_ID)
  private List<String> boundAwsAccountId = new ArrayList<String>();

  public static final String SERIALIZED_NAME_BOUND_IPS = "bound-ips";
  @SerializedName(SERIALIZED_NAME_BOUND_IPS)
  private List<String> boundIps = null;

  public static final String SERIALIZED_NAME_BOUND_RESOURCE_ID = "bound-resource-id";
  @SerializedName(SERIALIZED_NAME_BOUND_RESOURCE_ID)
  private List<String> boundResourceId = null;

  public static final String SERIALIZED_NAME_BOUND_ROLE_ID = "bound-role-id";
  @SerializedName(SERIALIZED_NAME_BOUND_ROLE_ID)
  private List<String> boundRoleId = null;

  public static final String SERIALIZED_NAME_BOUND_ROLE_NAME = "bound-role-name";
  @SerializedName(SERIALIZED_NAME_BOUND_ROLE_NAME)
  private List<String> boundRoleName = null;

  public static final String SERIALIZED_NAME_BOUND_USER_ID = "bound-user-id";
  @SerializedName(SERIALIZED_NAME_BOUND_USER_ID)
  private List<String> boundUserId = null;

  public static final String SERIALIZED_NAME_BOUND_USER_NAME = "bound-user-name";
  @SerializedName(SERIALIZED_NAME_BOUND_USER_NAME)
  private List<String> boundUserName = null;

  public static final String SERIALIZED_NAME_FORCE_SUB_CLAIMS = "force-sub-claims";
  @SerializedName(SERIALIZED_NAME_FORCE_SUB_CLAIMS)
  private Boolean forceSubClaims;

  public static final String SERIALIZED_NAME_GW_BOUND_IPS = "gw-bound-ips";
  @SerializedName(SERIALIZED_NAME_GW_BOUND_IPS)
  private List<String> gwBoundIps = null;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json;

  public static final String SERIALIZED_NAME_JWT_TTL = "jwt-ttl";
  @SerializedName(SERIALIZED_NAME_JWT_TTL)
  private Long jwtTtl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_STS_URL = "sts-url";
  @SerializedName(SERIALIZED_NAME_STS_URL)
  private String stsUrl = "https://sts.amazonaws.com";

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public UpdateAuthMethodAWSIAM accessExpires(Long accessExpires) {
    
    this.accessExpires = accessExpires;
    return this;
  }

   /**
   * Access expiration date in Unix timestamp (select 0 for access without expiry date)
   * @return accessExpires
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Access expiration date in Unix timestamp (select 0 for access without expiry date)")

  public Long getAccessExpires() {
    return accessExpires;
  }


  public void setAccessExpires(Long accessExpires) {
    this.accessExpires = accessExpires;
  }


  public UpdateAuthMethodAWSIAM boundArn(List<String> boundArn) {
    
    this.boundArn = boundArn;
    return this;
  }

  public UpdateAuthMethodAWSIAM addBoundArnItem(String boundArnItem) {
    if (this.boundArn == null) {
      this.boundArn = new ArrayList<String>();
    }
    this.boundArn.add(boundArnItem);
    return this;
  }

   /**
   * A list of full arns that the access is restricted to
   * @return boundArn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of full arns that the access is restricted to")

  public List<String> getBoundArn() {
    return boundArn;
  }


  public void setBoundArn(List<String> boundArn) {
    this.boundArn = boundArn;
  }


  public UpdateAuthMethodAWSIAM boundAwsAccountId(List<String> boundAwsAccountId) {
    
    this.boundAwsAccountId = boundAwsAccountId;
    return this;
  }

  public UpdateAuthMethodAWSIAM addBoundAwsAccountIdItem(String boundAwsAccountIdItem) {
    this.boundAwsAccountId.add(boundAwsAccountIdItem);
    return this;
  }

   /**
   * A list of AWS account-IDs that the access is restricted to
   * @return boundAwsAccountId
  **/
  @ApiModelProperty(required = true, value = "A list of AWS account-IDs that the access is restricted to")

  public List<String> getBoundAwsAccountId() {
    return boundAwsAccountId;
  }


  public void setBoundAwsAccountId(List<String> boundAwsAccountId) {
    this.boundAwsAccountId = boundAwsAccountId;
  }


  public UpdateAuthMethodAWSIAM boundIps(List<String> boundIps) {
    
    this.boundIps = boundIps;
    return this;
  }

  public UpdateAuthMethodAWSIAM addBoundIpsItem(String boundIpsItem) {
    if (this.boundIps == null) {
      this.boundIps = new ArrayList<String>();
    }
    this.boundIps.add(boundIpsItem);
    return this;
  }

   /**
   * A CIDR whitelist with the IPs that the access is restricted to
   * @return boundIps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A CIDR whitelist with the IPs that the access is restricted to")

  public List<String> getBoundIps() {
    return boundIps;
  }


  public void setBoundIps(List<String> boundIps) {
    this.boundIps = boundIps;
  }


  public UpdateAuthMethodAWSIAM boundResourceId(List<String> boundResourceId) {
    
    this.boundResourceId = boundResourceId;
    return this;
  }

  public UpdateAuthMethodAWSIAM addBoundResourceIdItem(String boundResourceIdItem) {
    if (this.boundResourceId == null) {
      this.boundResourceId = new ArrayList<String>();
    }
    this.boundResourceId.add(boundResourceIdItem);
    return this;
  }

   /**
   * A list of full resource ids that the access is restricted to
   * @return boundResourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of full resource ids that the access is restricted to")

  public List<String> getBoundResourceId() {
    return boundResourceId;
  }


  public void setBoundResourceId(List<String> boundResourceId) {
    this.boundResourceId = boundResourceId;
  }


  public UpdateAuthMethodAWSIAM boundRoleId(List<String> boundRoleId) {
    
    this.boundRoleId = boundRoleId;
    return this;
  }

  public UpdateAuthMethodAWSIAM addBoundRoleIdItem(String boundRoleIdItem) {
    if (this.boundRoleId == null) {
      this.boundRoleId = new ArrayList<String>();
    }
    this.boundRoleId.add(boundRoleIdItem);
    return this;
  }

   /**
   * A list of full role ids that the access is restricted to
   * @return boundRoleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of full role ids that the access is restricted to")

  public List<String> getBoundRoleId() {
    return boundRoleId;
  }


  public void setBoundRoleId(List<String> boundRoleId) {
    this.boundRoleId = boundRoleId;
  }


  public UpdateAuthMethodAWSIAM boundRoleName(List<String> boundRoleName) {
    
    this.boundRoleName = boundRoleName;
    return this;
  }

  public UpdateAuthMethodAWSIAM addBoundRoleNameItem(String boundRoleNameItem) {
    if (this.boundRoleName == null) {
      this.boundRoleName = new ArrayList<String>();
    }
    this.boundRoleName.add(boundRoleNameItem);
    return this;
  }

   /**
   * A list of full role-name that the access is restricted to
   * @return boundRoleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of full role-name that the access is restricted to")

  public List<String> getBoundRoleName() {
    return boundRoleName;
  }


  public void setBoundRoleName(List<String> boundRoleName) {
    this.boundRoleName = boundRoleName;
  }


  public UpdateAuthMethodAWSIAM boundUserId(List<String> boundUserId) {
    
    this.boundUserId = boundUserId;
    return this;
  }

  public UpdateAuthMethodAWSIAM addBoundUserIdItem(String boundUserIdItem) {
    if (this.boundUserId == null) {
      this.boundUserId = new ArrayList<String>();
    }
    this.boundUserId.add(boundUserIdItem);
    return this;
  }

   /**
   * A list of full user ids that the access is restricted to
   * @return boundUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of full user ids that the access is restricted to")

  public List<String> getBoundUserId() {
    return boundUserId;
  }


  public void setBoundUserId(List<String> boundUserId) {
    this.boundUserId = boundUserId;
  }


  public UpdateAuthMethodAWSIAM boundUserName(List<String> boundUserName) {
    
    this.boundUserName = boundUserName;
    return this;
  }

  public UpdateAuthMethodAWSIAM addBoundUserNameItem(String boundUserNameItem) {
    if (this.boundUserName == null) {
      this.boundUserName = new ArrayList<String>();
    }
    this.boundUserName.add(boundUserNameItem);
    return this;
  }

   /**
   * A list of full user-name that the access is restricted to
   * @return boundUserName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of full user-name that the access is restricted to")

  public List<String> getBoundUserName() {
    return boundUserName;
  }


  public void setBoundUserName(List<String> boundUserName) {
    this.boundUserName = boundUserName;
  }


  public UpdateAuthMethodAWSIAM forceSubClaims(Boolean forceSubClaims) {
    
    this.forceSubClaims = forceSubClaims;
    return this;
  }

   /**
   * if true: enforce role-association must include sub claims
   * @return forceSubClaims
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "if true: enforce role-association must include sub claims")

  public Boolean getForceSubClaims() {
    return forceSubClaims;
  }


  public void setForceSubClaims(Boolean forceSubClaims) {
    this.forceSubClaims = forceSubClaims;
  }


  public UpdateAuthMethodAWSIAM gwBoundIps(List<String> gwBoundIps) {
    
    this.gwBoundIps = gwBoundIps;
    return this;
  }

  public UpdateAuthMethodAWSIAM addGwBoundIpsItem(String gwBoundIpsItem) {
    if (this.gwBoundIps == null) {
      this.gwBoundIps = new ArrayList<String>();
    }
    this.gwBoundIps.add(gwBoundIpsItem);
    return this;
  }

   /**
   * A CIDR whitelist with the GW IPs that the access is restricted to
   * @return gwBoundIps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A CIDR whitelist with the GW IPs that the access is restricted to")

  public List<String> getGwBoundIps() {
    return gwBoundIps;
  }


  public void setGwBoundIps(List<String> gwBoundIps) {
    this.gwBoundIps = gwBoundIps;
  }


  public UpdateAuthMethodAWSIAM json(Boolean json) {
    
    this.json = json;
    return this;
  }

   /**
   * Set output format to JSON
   * @return json
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set output format to JSON")

  public Boolean getJson() {
    return json;
  }


  public void setJson(Boolean json) {
    this.json = json;
  }


  public UpdateAuthMethodAWSIAM jwtTtl(Long jwtTtl) {
    
    this.jwtTtl = jwtTtl;
    return this;
  }

   /**
   * Jwt TTL
   * @return jwtTtl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Jwt TTL")

  public Long getJwtTtl() {
    return jwtTtl;
  }


  public void setJwtTtl(Long jwtTtl) {
    this.jwtTtl = jwtTtl;
  }


  public UpdateAuthMethodAWSIAM name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Auth Method name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Auth Method name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateAuthMethodAWSIAM newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * Auth Method new name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Auth Method new name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public UpdateAuthMethodAWSIAM stsUrl(String stsUrl) {
    
    this.stsUrl = stsUrl;
    return this;
  }

   /**
   * sts URL
   * @return stsUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "sts URL")

  public String getStsUrl() {
    return stsUrl;
  }


  public void setStsUrl(String stsUrl) {
    this.stsUrl = stsUrl;
  }


  public UpdateAuthMethodAWSIAM token(String token) {
    
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


  public UpdateAuthMethodAWSIAM uidToken(String uidToken) {
    
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
    UpdateAuthMethodAWSIAM updateAuthMethodAWSIAM = (UpdateAuthMethodAWSIAM) o;
    return Objects.equals(this.accessExpires, updateAuthMethodAWSIAM.accessExpires) &&
        Objects.equals(this.boundArn, updateAuthMethodAWSIAM.boundArn) &&
        Objects.equals(this.boundAwsAccountId, updateAuthMethodAWSIAM.boundAwsAccountId) &&
        Objects.equals(this.boundIps, updateAuthMethodAWSIAM.boundIps) &&
        Objects.equals(this.boundResourceId, updateAuthMethodAWSIAM.boundResourceId) &&
        Objects.equals(this.boundRoleId, updateAuthMethodAWSIAM.boundRoleId) &&
        Objects.equals(this.boundRoleName, updateAuthMethodAWSIAM.boundRoleName) &&
        Objects.equals(this.boundUserId, updateAuthMethodAWSIAM.boundUserId) &&
        Objects.equals(this.boundUserName, updateAuthMethodAWSIAM.boundUserName) &&
        Objects.equals(this.forceSubClaims, updateAuthMethodAWSIAM.forceSubClaims) &&
        Objects.equals(this.gwBoundIps, updateAuthMethodAWSIAM.gwBoundIps) &&
        Objects.equals(this.json, updateAuthMethodAWSIAM.json) &&
        Objects.equals(this.jwtTtl, updateAuthMethodAWSIAM.jwtTtl) &&
        Objects.equals(this.name, updateAuthMethodAWSIAM.name) &&
        Objects.equals(this.newName, updateAuthMethodAWSIAM.newName) &&
        Objects.equals(this.stsUrl, updateAuthMethodAWSIAM.stsUrl) &&
        Objects.equals(this.token, updateAuthMethodAWSIAM.token) &&
        Objects.equals(this.uidToken, updateAuthMethodAWSIAM.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessExpires, boundArn, boundAwsAccountId, boundIps, boundResourceId, boundRoleId, boundRoleName, boundUserId, boundUserName, forceSubClaims, gwBoundIps, json, jwtTtl, name, newName, stsUrl, token, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAuthMethodAWSIAM {\n");
    sb.append("    accessExpires: ").append(toIndentedString(accessExpires)).append("\n");
    sb.append("    boundArn: ").append(toIndentedString(boundArn)).append("\n");
    sb.append("    boundAwsAccountId: ").append(toIndentedString(boundAwsAccountId)).append("\n");
    sb.append("    boundIps: ").append(toIndentedString(boundIps)).append("\n");
    sb.append("    boundResourceId: ").append(toIndentedString(boundResourceId)).append("\n");
    sb.append("    boundRoleId: ").append(toIndentedString(boundRoleId)).append("\n");
    sb.append("    boundRoleName: ").append(toIndentedString(boundRoleName)).append("\n");
    sb.append("    boundUserId: ").append(toIndentedString(boundUserId)).append("\n");
    sb.append("    boundUserName: ").append(toIndentedString(boundUserName)).append("\n");
    sb.append("    forceSubClaims: ").append(toIndentedString(forceSubClaims)).append("\n");
    sb.append("    gwBoundIps: ").append(toIndentedString(gwBoundIps)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    jwtTtl: ").append(toIndentedString(jwtTtl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    stsUrl: ").append(toIndentedString(stsUrl)).append("\n");
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

