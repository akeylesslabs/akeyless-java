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

/**
 * CreateRole
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateRole {
  public static final String SERIALIZED_NAME_ANALYTICS_ACCESS = "analytics-access";
  @SerializedName(SERIALIZED_NAME_ANALYTICS_ACCESS)
  private String analyticsAccess;

  public static final String SERIALIZED_NAME_AUDIT_ACCESS = "audit-access";
  @SerializedName(SERIALIZED_NAME_AUDIT_ACCESS)
  private String auditAccess;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EVENT_CENTER_ACCESS = "event-center-access";
  @SerializedName(SERIALIZED_NAME_EVENT_CENTER_ACCESS)
  private String eventCenterAccess;

  public static final String SERIALIZED_NAME_EVENT_FORWARDERS_ACCESS = "event-forwarders-access";
  @SerializedName(SERIALIZED_NAME_EVENT_FORWARDERS_ACCESS)
  private String eventForwardersAccess;

  public static final String SERIALIZED_NAME_GW_ANALYTICS_ACCESS = "gw-analytics-access";
  @SerializedName(SERIALIZED_NAME_GW_ANALYTICS_ACCESS)
  private String gwAnalyticsAccess;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SRA_REPORTS_ACCESS = "sra-reports-access";
  @SerializedName(SERIALIZED_NAME_SRA_REPORTS_ACCESS)
  private String sraReportsAccess;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USAGE_REPORTS_ACCESS = "usage-reports-access";
  @SerializedName(SERIALIZED_NAME_USAGE_REPORTS_ACCESS)
  private String usageReportsAccess;

  public CreateRole() { 
  }

  public CreateRole analyticsAccess(String analyticsAccess) {
    
    this.analyticsAccess = analyticsAccess;
    return this;
  }

   /**
   * Allow this role to view analytics. Currently only &#39;none&#39;, &#39;own&#39;, &#39;all&#39; values are supported, allowing associated auth methods to view reports produced by the same auth methods.
   * @return analyticsAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow this role to view analytics. Currently only 'none', 'own', 'all' values are supported, allowing associated auth methods to view reports produced by the same auth methods.")

  public String getAnalyticsAccess() {
    return analyticsAccess;
  }


  public void setAnalyticsAccess(String analyticsAccess) {
    this.analyticsAccess = analyticsAccess;
  }


  public CreateRole auditAccess(String auditAccess) {
    
    this.auditAccess = auditAccess;
    return this;
  }

   /**
   * Allow this role to view audit logs. Currently only &#39;none&#39;, &#39;own&#39; and &#39;all&#39; values are supported, allowing associated auth methods to view audit logs produced by the same auth methods.
   * @return auditAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow this role to view audit logs. Currently only 'none', 'own' and 'all' values are supported, allowing associated auth methods to view audit logs produced by the same auth methods.")

  public String getAuditAccess() {
    return auditAccess;
  }


  public void setAuditAccess(String auditAccess) {
    this.auditAccess = auditAccess;
  }


  public CreateRole comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Deprecated - use description
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated - use description")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public CreateRole description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the object
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the object")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateRole eventCenterAccess(String eventCenterAccess) {
    
    this.eventCenterAccess = eventCenterAccess;
    return this;
  }

   /**
   * Allow this role to view Event Center. Currently only &#39;none&#39;, &#39;own&#39; and &#39;all&#39; values are supported
   * @return eventCenterAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow this role to view Event Center. Currently only 'none', 'own' and 'all' values are supported")

  public String getEventCenterAccess() {
    return eventCenterAccess;
  }


  public void setEventCenterAccess(String eventCenterAccess) {
    this.eventCenterAccess = eventCenterAccess;
  }


  public CreateRole eventForwardersAccess(String eventForwardersAccess) {
    
    this.eventForwardersAccess = eventForwardersAccess;
    return this;
  }

   /**
   * Allow this role to manage Event Forwarders. Currently only &#39;none&#39; and &#39;all&#39; values are supported.
   * @return eventForwardersAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow this role to manage Event Forwarders. Currently only 'none' and 'all' values are supported.")

  public String getEventForwardersAccess() {
    return eventForwardersAccess;
  }


  public void setEventForwardersAccess(String eventForwardersAccess) {
    this.eventForwardersAccess = eventForwardersAccess;
  }


  public CreateRole gwAnalyticsAccess(String gwAnalyticsAccess) {
    
    this.gwAnalyticsAccess = gwAnalyticsAccess;
    return this;
  }

   /**
   * Allow this role to view gw analytics. Currently only &#39;none&#39;, &#39;own&#39;, &#39;all&#39; values are supported, allowing associated auth methods to view reports produced by the same auth methods.
   * @return gwAnalyticsAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow this role to view gw analytics. Currently only 'none', 'own', 'all' values are supported, allowing associated auth methods to view reports produced by the same auth methods.")

  public String getGwAnalyticsAccess() {
    return gwAnalyticsAccess;
  }


  public void setGwAnalyticsAccess(String gwAnalyticsAccess) {
    this.gwAnalyticsAccess = gwAnalyticsAccess;
  }


  public CreateRole json(Boolean json) {
    
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


  public CreateRole name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Role name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Role name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateRole sraReportsAccess(String sraReportsAccess) {
    
    this.sraReportsAccess = sraReportsAccess;
    return this;
  }

   /**
   * Allow this role to view SRA Clusters. Currently only &#39;none&#39;, &#39;own&#39;, &#39;all&#39; values are supported.
   * @return sraReportsAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow this role to view SRA Clusters. Currently only 'none', 'own', 'all' values are supported.")

  public String getSraReportsAccess() {
    return sraReportsAccess;
  }


  public void setSraReportsAccess(String sraReportsAccess) {
    this.sraReportsAccess = sraReportsAccess;
  }


  public CreateRole token(String token) {
    
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


  public CreateRole uidToken(String uidToken) {
    
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


  public CreateRole usageReportsAccess(String usageReportsAccess) {
    
    this.usageReportsAccess = usageReportsAccess;
    return this;
  }

   /**
   * Allow this role to view Usage Report. Currently only &#39;none&#39; and &#39;all&#39; values are supported.
   * @return usageReportsAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow this role to view Usage Report. Currently only 'none' and 'all' values are supported.")

  public String getUsageReportsAccess() {
    return usageReportsAccess;
  }


  public void setUsageReportsAccess(String usageReportsAccess) {
    this.usageReportsAccess = usageReportsAccess;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRole createRole = (CreateRole) o;
    return Objects.equals(this.analyticsAccess, createRole.analyticsAccess) &&
        Objects.equals(this.auditAccess, createRole.auditAccess) &&
        Objects.equals(this.comment, createRole.comment) &&
        Objects.equals(this.description, createRole.description) &&
        Objects.equals(this.eventCenterAccess, createRole.eventCenterAccess) &&
        Objects.equals(this.eventForwardersAccess, createRole.eventForwardersAccess) &&
        Objects.equals(this.gwAnalyticsAccess, createRole.gwAnalyticsAccess) &&
        Objects.equals(this.json, createRole.json) &&
        Objects.equals(this.name, createRole.name) &&
        Objects.equals(this.sraReportsAccess, createRole.sraReportsAccess) &&
        Objects.equals(this.token, createRole.token) &&
        Objects.equals(this.uidToken, createRole.uidToken) &&
        Objects.equals(this.usageReportsAccess, createRole.usageReportsAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analyticsAccess, auditAccess, comment, description, eventCenterAccess, eventForwardersAccess, gwAnalyticsAccess, json, name, sraReportsAccess, token, uidToken, usageReportsAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRole {\n");
    sb.append("    analyticsAccess: ").append(toIndentedString(analyticsAccess)).append("\n");
    sb.append("    auditAccess: ").append(toIndentedString(auditAccess)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eventCenterAccess: ").append(toIndentedString(eventCenterAccess)).append("\n");
    sb.append("    eventForwardersAccess: ").append(toIndentedString(eventForwardersAccess)).append("\n");
    sb.append("    gwAnalyticsAccess: ").append(toIndentedString(gwAnalyticsAccess)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sraReportsAccess: ").append(toIndentedString(sraReportsAccess)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    usageReportsAccess: ").append(toIndentedString(usageReportsAccess)).append("\n");
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

