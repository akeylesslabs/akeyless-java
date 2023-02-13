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
 * createAuthMethodGCP is a command that creates a new auth method that will be able to authenticate using GCP IAM Service Account credentials or GCE instance credentials.
 */
@ApiModel(description = "createAuthMethodGCP is a command that creates a new auth method that will be able to authenticate using GCP IAM Service Account credentials or GCE instance credentials.")

public class CreateAuthMethodGCP {
  public static final String SERIALIZED_NAME_ACCESS_EXPIRES = "access-expires";
  @SerializedName(SERIALIZED_NAME_ACCESS_EXPIRES)
  private Long accessExpires = 0l;

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private String audience = "akeyless.io";

  public static final String SERIALIZED_NAME_BOUND_IPS = "bound-ips";
  @SerializedName(SERIALIZED_NAME_BOUND_IPS)
  private List<String> boundIps = null;

  public static final String SERIALIZED_NAME_BOUND_LABELS = "bound-labels";
  @SerializedName(SERIALIZED_NAME_BOUND_LABELS)
  private List<String> boundLabels = null;

  public static final String SERIALIZED_NAME_BOUND_PROJECTS = "bound-projects";
  @SerializedName(SERIALIZED_NAME_BOUND_PROJECTS)
  private List<String> boundProjects = null;

  public static final String SERIALIZED_NAME_BOUND_REGIONS = "bound-regions";
  @SerializedName(SERIALIZED_NAME_BOUND_REGIONS)
  private List<String> boundRegions = null;

  public static final String SERIALIZED_NAME_BOUND_SERVICE_ACCOUNTS = "bound-service-accounts";
  @SerializedName(SERIALIZED_NAME_BOUND_SERVICE_ACCOUNTS)
  private List<String> boundServiceAccounts = null;

  public static final String SERIALIZED_NAME_BOUND_ZONES = "bound-zones";
  @SerializedName(SERIALIZED_NAME_BOUND_ZONES)
  private List<String> boundZones = null;

  public static final String SERIALIZED_NAME_FORCE_SUB_CLAIMS = "force-sub-claims";
  @SerializedName(SERIALIZED_NAME_FORCE_SUB_CLAIMS)
  private Boolean forceSubClaims;

  public static final String SERIALIZED_NAME_GW_BOUND_IPS = "gw-bound-ips";
  @SerializedName(SERIALIZED_NAME_GW_BOUND_IPS)
  private List<String> gwBoundIps = null;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_JWT_TTL = "jwt-ttl";
  @SerializedName(SERIALIZED_NAME_JWT_TTL)
  private Long jwtTtl = 0l;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_CREDS_DATA = "service-account-creds-data";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_CREDS_DATA)
  private String serviceAccountCredsData;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public CreateAuthMethodGCP accessExpires(Long accessExpires) {
    
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


  public CreateAuthMethodGCP audience(String audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * The audience to verify in the JWT received by the client
   * @return audience
  **/
  @ApiModelProperty(required = true, value = "The audience to verify in the JWT received by the client")

  public String getAudience() {
    return audience;
  }


  public void setAudience(String audience) {
    this.audience = audience;
  }


  public CreateAuthMethodGCP boundIps(List<String> boundIps) {
    
    this.boundIps = boundIps;
    return this;
  }

  public CreateAuthMethodGCP addBoundIpsItem(String boundIpsItem) {
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


  public CreateAuthMethodGCP boundLabels(List<String> boundLabels) {
    
    this.boundLabels = boundLabels;
    return this;
  }

  public CreateAuthMethodGCP addBoundLabelsItem(String boundLabelsItem) {
    if (this.boundLabels == null) {
      this.boundLabels = new ArrayList<String>();
    }
    this.boundLabels.add(boundLabelsItem);
    return this;
  }

   /**
   * A comma-separated list of GCP labels formatted as \&quot;key:value\&quot; strings that must be set on authorized GCE instances. TODO: Because GCP labels are not currently ACL&#39;d ....
   * @return boundLabels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A comma-separated list of GCP labels formatted as \"key:value\" strings that must be set on authorized GCE instances. TODO: Because GCP labels are not currently ACL'd ....")

  public List<String> getBoundLabels() {
    return boundLabels;
  }


  public void setBoundLabels(List<String> boundLabels) {
    this.boundLabels = boundLabels;
  }


  public CreateAuthMethodGCP boundProjects(List<String> boundProjects) {
    
    this.boundProjects = boundProjects;
    return this;
  }

  public CreateAuthMethodGCP addBoundProjectsItem(String boundProjectsItem) {
    if (this.boundProjects == null) {
      this.boundProjects = new ArrayList<String>();
    }
    this.boundProjects.add(boundProjectsItem);
    return this;
  }

   /**
   * &#x3D;&#x3D;&#x3D; Human and Machine authentication section &#x3D;&#x3D;&#x3D; Array of GCP project IDs. Only entities belonging to any of the provided projects can authenticate.
   * @return boundProjects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "=== Human and Machine authentication section === Array of GCP project IDs. Only entities belonging to any of the provided projects can authenticate.")

  public List<String> getBoundProjects() {
    return boundProjects;
  }


  public void setBoundProjects(List<String> boundProjects) {
    this.boundProjects = boundProjects;
  }


  public CreateAuthMethodGCP boundRegions(List<String> boundRegions) {
    
    this.boundRegions = boundRegions;
    return this;
  }

  public CreateAuthMethodGCP addBoundRegionsItem(String boundRegionsItem) {
    if (this.boundRegions == null) {
      this.boundRegions = new ArrayList<String>();
    }
    this.boundRegions.add(boundRegionsItem);
    return this;
  }

   /**
   * List of regions that a GCE instance must belong to in order to be authenticated. TODO: If bound_instance_groups is provided, it is assumed to be a regional group and the group must belong to this region. If bound_zones are provided, this attribute is ignored.
   * @return boundRegions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of regions that a GCE instance must belong to in order to be authenticated. TODO: If bound_instance_groups is provided, it is assumed to be a regional group and the group must belong to this region. If bound_zones are provided, this attribute is ignored.")

  public List<String> getBoundRegions() {
    return boundRegions;
  }


  public void setBoundRegions(List<String> boundRegions) {
    this.boundRegions = boundRegions;
  }


  public CreateAuthMethodGCP boundServiceAccounts(List<String> boundServiceAccounts) {
    
    this.boundServiceAccounts = boundServiceAccounts;
    return this;
  }

  public CreateAuthMethodGCP addBoundServiceAccountsItem(String boundServiceAccountsItem) {
    if (this.boundServiceAccounts == null) {
      this.boundServiceAccounts = new ArrayList<String>();
    }
    this.boundServiceAccounts.add(boundServiceAccountsItem);
    return this;
  }

   /**
   * List of service accounts the service account must be part of in order to be authenticated.
   * @return boundServiceAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of service accounts the service account must be part of in order to be authenticated.")

  public List<String> getBoundServiceAccounts() {
    return boundServiceAccounts;
  }


  public void setBoundServiceAccounts(List<String> boundServiceAccounts) {
    this.boundServiceAccounts = boundServiceAccounts;
  }


  public CreateAuthMethodGCP boundZones(List<String> boundZones) {
    
    this.boundZones = boundZones;
    return this;
  }

  public CreateAuthMethodGCP addBoundZonesItem(String boundZonesItem) {
    if (this.boundZones == null) {
      this.boundZones = new ArrayList<String>();
    }
    this.boundZones.add(boundZonesItem);
    return this;
  }

   /**
   * &#x3D;&#x3D;&#x3D; Machine authentication section &#x3D;&#x3D;&#x3D; List of zones that a GCE instance must belong to in order to be authenticated. TODO: If bound_instance_groups is provided, it is assumed to be a zonal group and the group must belong to this zone.
   * @return boundZones
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "=== Machine authentication section === List of zones that a GCE instance must belong to in order to be authenticated. TODO: If bound_instance_groups is provided, it is assumed to be a zonal group and the group must belong to this zone.")

  public List<String> getBoundZones() {
    return boundZones;
  }


  public void setBoundZones(List<String> boundZones) {
    this.boundZones = boundZones;
  }


  public CreateAuthMethodGCP forceSubClaims(Boolean forceSubClaims) {
    
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


  public CreateAuthMethodGCP gwBoundIps(List<String> gwBoundIps) {
    
    this.gwBoundIps = gwBoundIps;
    return this;
  }

  public CreateAuthMethodGCP addGwBoundIpsItem(String gwBoundIpsItem) {
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


  public CreateAuthMethodGCP json(Boolean json) {
    
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


  public CreateAuthMethodGCP jwtTtl(Long jwtTtl) {
    
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


  public CreateAuthMethodGCP name(String name) {
    
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


  public CreateAuthMethodGCP serviceAccountCredsData(String serviceAccountCredsData) {
    
    this.serviceAccountCredsData = serviceAccountCredsData;
    return this;
  }

   /**
   * ServiceAccount credentials data instead of giving a file path, base64 encoded
   * @return serviceAccountCredsData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ServiceAccount credentials data instead of giving a file path, base64 encoded")

  public String getServiceAccountCredsData() {
    return serviceAccountCredsData;
  }


  public void setServiceAccountCredsData(String serviceAccountCredsData) {
    this.serviceAccountCredsData = serviceAccountCredsData;
  }


  public CreateAuthMethodGCP token(String token) {
    
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


  public CreateAuthMethodGCP type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of the GCP Access Rules
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of the GCP Access Rules")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public CreateAuthMethodGCP uidToken(String uidToken) {
    
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
    CreateAuthMethodGCP createAuthMethodGCP = (CreateAuthMethodGCP) o;
    return Objects.equals(this.accessExpires, createAuthMethodGCP.accessExpires) &&
        Objects.equals(this.audience, createAuthMethodGCP.audience) &&
        Objects.equals(this.boundIps, createAuthMethodGCP.boundIps) &&
        Objects.equals(this.boundLabels, createAuthMethodGCP.boundLabels) &&
        Objects.equals(this.boundProjects, createAuthMethodGCP.boundProjects) &&
        Objects.equals(this.boundRegions, createAuthMethodGCP.boundRegions) &&
        Objects.equals(this.boundServiceAccounts, createAuthMethodGCP.boundServiceAccounts) &&
        Objects.equals(this.boundZones, createAuthMethodGCP.boundZones) &&
        Objects.equals(this.forceSubClaims, createAuthMethodGCP.forceSubClaims) &&
        Objects.equals(this.gwBoundIps, createAuthMethodGCP.gwBoundIps) &&
        Objects.equals(this.json, createAuthMethodGCP.json) &&
        Objects.equals(this.jwtTtl, createAuthMethodGCP.jwtTtl) &&
        Objects.equals(this.name, createAuthMethodGCP.name) &&
        Objects.equals(this.serviceAccountCredsData, createAuthMethodGCP.serviceAccountCredsData) &&
        Objects.equals(this.token, createAuthMethodGCP.token) &&
        Objects.equals(this.type, createAuthMethodGCP.type) &&
        Objects.equals(this.uidToken, createAuthMethodGCP.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessExpires, audience, boundIps, boundLabels, boundProjects, boundRegions, boundServiceAccounts, boundZones, forceSubClaims, gwBoundIps, json, jwtTtl, name, serviceAccountCredsData, token, type, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAuthMethodGCP {\n");
    sb.append("    accessExpires: ").append(toIndentedString(accessExpires)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    boundIps: ").append(toIndentedString(boundIps)).append("\n");
    sb.append("    boundLabels: ").append(toIndentedString(boundLabels)).append("\n");
    sb.append("    boundProjects: ").append(toIndentedString(boundProjects)).append("\n");
    sb.append("    boundRegions: ").append(toIndentedString(boundRegions)).append("\n");
    sb.append("    boundServiceAccounts: ").append(toIndentedString(boundServiceAccounts)).append("\n");
    sb.append("    boundZones: ").append(toIndentedString(boundZones)).append("\n");
    sb.append("    forceSubClaims: ").append(toIndentedString(forceSubClaims)).append("\n");
    sb.append("    gwBoundIps: ").append(toIndentedString(gwBoundIps)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    jwtTtl: ").append(toIndentedString(jwtTtl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceAccountCredsData: ").append(toIndentedString(serviceAccountCredsData)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

