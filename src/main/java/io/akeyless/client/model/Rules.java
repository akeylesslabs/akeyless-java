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
import io.akeyless.client.model.PathRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Rules
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Rules {
  public static final String SERIALIZED_NAME_ADMIN = "admin";
  @SerializedName(SERIALIZED_NAME_ADMIN)
  private Boolean admin;

  public static final String SERIALIZED_NAME_PATH_RULES = "path_rules";
  @SerializedName(SERIALIZED_NAME_PATH_RULES)
  private List<PathRule> pathRules = null;

  public Rules() { 
  }

  public Rules admin(Boolean admin) {
    
    this.admin = admin;
    return this;
  }

   /**
   * Is admin
   * @return admin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is admin")

  public Boolean getAdmin() {
    return admin;
  }


  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }


  public Rules pathRules(List<PathRule> pathRules) {
    
    this.pathRules = pathRules;
    return this;
  }

  public Rules addPathRulesItem(PathRule pathRulesItem) {
    if (this.pathRules == null) {
      this.pathRules = new ArrayList<PathRule>();
    }
    this.pathRules.add(pathRulesItem);
    return this;
  }

   /**
   * The path the rules refers to
   * @return pathRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The path the rules refers to")

  public List<PathRule> getPathRules() {
    return pathRules;
  }


  public void setPathRules(List<PathRule> pathRules) {
    this.pathRules = pathRules;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rules rules = (Rules) o;
    return Objects.equals(this.admin, rules.admin) &&
        Objects.equals(this.pathRules, rules.pathRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(admin, pathRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rules {\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    pathRules: ").append(toIndentedString(pathRules)).append("\n");
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

