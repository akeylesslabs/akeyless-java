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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GCPAccessRules
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GCPAccessRules {
  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private String audience = "akeyless.io";

  public static final String SERIALIZED_NAME_BOUND_LABELS = "bound_labels";
  @SerializedName(SERIALIZED_NAME_BOUND_LABELS)
  private Map<String, String> boundLabels = null;

  public static final String SERIALIZED_NAME_BOUND_PROJECTS = "bound_projects";
  @SerializedName(SERIALIZED_NAME_BOUND_PROJECTS)
  private List<String> boundProjects = null;

  public static final String SERIALIZED_NAME_BOUND_REGIONS = "bound_regions";
  @SerializedName(SERIALIZED_NAME_BOUND_REGIONS)
  private List<String> boundRegions = null;

  public static final String SERIALIZED_NAME_BOUND_SERVICE_ACCOUNTS = "bound_service_accounts";
  @SerializedName(SERIALIZED_NAME_BOUND_SERVICE_ACCOUNTS)
  private List<String> boundServiceAccounts = null;

  public static final String SERIALIZED_NAME_BOUND_ZONES = "bound_zones";
  @SerializedName(SERIALIZED_NAME_BOUND_ZONES)
  private List<String> boundZones = null;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT = "service_account";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT)
  private String serviceAccount;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UNIQUE_IDENTIFIER = "unique_identifier";
  @SerializedName(SERIALIZED_NAME_UNIQUE_IDENTIFIER)
  private String uniqueIdentifier;

  public GCPAccessRules() { 
  }

  public GCPAccessRules audience(String audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * The audience in the JWT
   * @return audience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The audience in the JWT")

  public String getAudience() {
    return audience;
  }


  public void setAudience(String audience) {
    this.audience = audience;
  }


  public GCPAccessRules boundLabels(Map<String, String> boundLabels) {
    
    this.boundLabels = boundLabels;
    return this;
  }

  public GCPAccessRules putBoundLabelsItem(String key, String boundLabelsItem) {
    if (this.boundLabels == null) {
      this.boundLabels = new HashMap<String, String>();
    }
    this.boundLabels.put(key, boundLabelsItem);
    return this;
  }

   /**
   * A map of GCP labels formatted as \&quot;key:value\&quot; strings that must be set on authorized GCE instances. TODO: Because GCP labels are not currently ACL&#39;d ....
   * @return boundLabels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A map of GCP labels formatted as \"key:value\" strings that must be set on authorized GCE instances. TODO: Because GCP labels are not currently ACL'd ....")

  public Map<String, String> getBoundLabels() {
    return boundLabels;
  }


  public void setBoundLabels(Map<String, String> boundLabels) {
    this.boundLabels = boundLabels;
  }


  public GCPAccessRules boundProjects(List<String> boundProjects) {
    
    this.boundProjects = boundProjects;
    return this;
  }

  public GCPAccessRules addBoundProjectsItem(String boundProjectsItem) {
    if (this.boundProjects == null) {
      this.boundProjects = new ArrayList<String>();
    }
    this.boundProjects.add(boundProjectsItem);
    return this;
  }

   /**
   * Human and Machine authentication section Array of GCP project IDs. Only entities belonging to any of the provided projects can authenticate.
   * @return boundProjects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Human and Machine authentication section Array of GCP project IDs. Only entities belonging to any of the provided projects can authenticate.")

  public List<String> getBoundProjects() {
    return boundProjects;
  }


  public void setBoundProjects(List<String> boundProjects) {
    this.boundProjects = boundProjects;
  }


  public GCPAccessRules boundRegions(List<String> boundRegions) {
    
    this.boundRegions = boundRegions;
    return this;
  }

  public GCPAccessRules addBoundRegionsItem(String boundRegionsItem) {
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


  public GCPAccessRules boundServiceAccounts(List<String> boundServiceAccounts) {
    
    this.boundServiceAccounts = boundServiceAccounts;
    return this;
  }

  public GCPAccessRules addBoundServiceAccountsItem(String boundServiceAccountsItem) {
    if (this.boundServiceAccounts == null) {
      this.boundServiceAccounts = new ArrayList<String>();
    }
    this.boundServiceAccounts.add(boundServiceAccountsItem);
    return this;
  }

   /**
   * List of service accounts the service account must be part of in order to be authenticated
   * @return boundServiceAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of service accounts the service account must be part of in order to be authenticated")

  public List<String> getBoundServiceAccounts() {
    return boundServiceAccounts;
  }


  public void setBoundServiceAccounts(List<String> boundServiceAccounts) {
    this.boundServiceAccounts = boundServiceAccounts;
  }


  public GCPAccessRules boundZones(List<String> boundZones) {
    
    this.boundZones = boundZones;
    return this;
  }

  public GCPAccessRules addBoundZonesItem(String boundZonesItem) {
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


  public GCPAccessRules serviceAccount(String serviceAccount) {
    
    this.serviceAccount = serviceAccount;
    return this;
  }

   /**
   * ServiceAccount holds the credentials file contents to be used by Akeyless to validate IAM (Human) and GCE (Machine) logins against GCP base64 encoded string
   * @return serviceAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ServiceAccount holds the credentials file contents to be used by Akeyless to validate IAM (Human) and GCE (Machine) logins against GCP base64 encoded string")

  public String getServiceAccount() {
    return serviceAccount;
  }


  public void setServiceAccount(String serviceAccount) {
    this.serviceAccount = serviceAccount;
  }


  public GCPAccessRules type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public GCPAccessRules uniqueIdentifier(String uniqueIdentifier) {
    
    this.uniqueIdentifier = uniqueIdentifier;
    return this;
  }

   /**
   * A unique identifier to distinguish different users
   * @return uniqueIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier to distinguish different users")

  public String getUniqueIdentifier() {
    return uniqueIdentifier;
  }


  public void setUniqueIdentifier(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPAccessRules gcPAccessRules = (GCPAccessRules) o;
    return Objects.equals(this.audience, gcPAccessRules.audience) &&
        Objects.equals(this.boundLabels, gcPAccessRules.boundLabels) &&
        Objects.equals(this.boundProjects, gcPAccessRules.boundProjects) &&
        Objects.equals(this.boundRegions, gcPAccessRules.boundRegions) &&
        Objects.equals(this.boundServiceAccounts, gcPAccessRules.boundServiceAccounts) &&
        Objects.equals(this.boundZones, gcPAccessRules.boundZones) &&
        Objects.equals(this.serviceAccount, gcPAccessRules.serviceAccount) &&
        Objects.equals(this.type, gcPAccessRules.type) &&
        Objects.equals(this.uniqueIdentifier, gcPAccessRules.uniqueIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audience, boundLabels, boundProjects, boundRegions, boundServiceAccounts, boundZones, serviceAccount, type, uniqueIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPAccessRules {\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    boundLabels: ").append(toIndentedString(boundLabels)).append("\n");
    sb.append("    boundProjects: ").append(toIndentedString(boundProjects)).append("\n");
    sb.append("    boundRegions: ").append(toIndentedString(boundRegions)).append("\n");
    sb.append("    boundServiceAccounts: ").append(toIndentedString(boundServiceAccounts)).append("\n");
    sb.append("    boundZones: ").append(toIndentedString(boundZones)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uniqueIdentifier: ").append(toIndentedString(uniqueIdentifier)).append("\n");
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

