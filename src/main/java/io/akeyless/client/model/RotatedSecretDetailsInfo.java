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
import io.akeyless.client.model.WindowsService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RotatedSecretDetailsInfo The rotated secret rotator info
 */
@ApiModel(description = "RotatedSecretDetailsInfo The rotated secret rotator info")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RotatedSecretDetailsInfo {
  public static final String SERIALIZED_NAME_DELETE_PREVIOUS_VERSION_IN_DAYS = "delete_previous_version_in_days";
  @SerializedName(SERIALIZED_NAME_DELETE_PREVIOUS_VERSION_IN_DAYS)
  private Integer deletePreviousVersionInDays;

  public static final String SERIALIZED_NAME_GRACE_ROTATION = "grace_rotation";
  @SerializedName(SERIALIZED_NAME_GRACE_ROTATION)
  private Boolean graceRotation;

  public static final String SERIALIZED_NAME_GW_CLUSTER_ID = "gw_cluster_id";
  @SerializedName(SERIALIZED_NAME_GW_CLUSTER_ID)
  private Long gwClusterId;

  public static final String SERIALIZED_NAME_LAST_ROTATION_ERROR = "last_rotation_error";
  @SerializedName(SERIALIZED_NAME_LAST_ROTATION_ERROR)
  private String lastRotationError;

  public static final String SERIALIZED_NAME_MAX_VERSIONS = "max_versions";
  @SerializedName(SERIALIZED_NAME_MAX_VERSIONS)
  private Long maxVersions;

  public static final String SERIALIZED_NAME_NUMBER_OF_VERSIONS_TO_SAVE = "number_of_versions_to_save";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_VERSIONS_TO_SAVE)
  private Integer numberOfVersionsToSave;

  public static final String SERIALIZED_NAME_ROTATION_HOUR = "rotation_hour";
  @SerializedName(SERIALIZED_NAME_ROTATION_HOUR)
  private Integer rotationHour;

  public static final String SERIALIZED_NAME_ROTATION_INTERVAL_MIN = "rotation_interval_min";
  @SerializedName(SERIALIZED_NAME_ROTATION_INTERVAL_MIN)
  private Boolean rotationIntervalMin;

  public static final String SERIALIZED_NAME_ROTATION_STATEMENT = "rotation_statement";
  @SerializedName(SERIALIZED_NAME_ROTATION_STATEMENT)
  private String rotationStatement;

  public static final String SERIALIZED_NAME_ROTATOR_CREDS_TYPE = "rotator_creds_type";
  @SerializedName(SERIALIZED_NAME_ROTATOR_CREDS_TYPE)
  private String rotatorCredsType;

  public static final String SERIALIZED_NAME_ROTATOR_STATUS = "rotator_status";
  @SerializedName(SERIALIZED_NAME_ROTATOR_STATUS)
  private String rotatorStatus;

  public static final String SERIALIZED_NAME_ROTATOR_TYPE = "rotator_type";
  @SerializedName(SERIALIZED_NAME_ROTATOR_TYPE)
  private String rotatorType;

  public static final String SERIALIZED_NAME_SAME_PASSWORD = "same_password";
  @SerializedName(SERIALIZED_NAME_SAME_PASSWORD)
  private Boolean samePassword;

  public static final String SERIALIZED_NAME_SERVICES_DETAILS = "services_details";
  @SerializedName(SERIALIZED_NAME_SERVICES_DETAILS)
  private List<WindowsService> servicesDetails = null;

  public RotatedSecretDetailsInfo() { 
  }

  public RotatedSecretDetailsInfo deletePreviousVersionInDays(Integer deletePreviousVersionInDays) {
    
    this.deletePreviousVersionInDays = deletePreviousVersionInDays;
    return this;
  }

   /**
   * Get deletePreviousVersionInDays
   * @return deletePreviousVersionInDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDeletePreviousVersionInDays() {
    return deletePreviousVersionInDays;
  }


  public void setDeletePreviousVersionInDays(Integer deletePreviousVersionInDays) {
    this.deletePreviousVersionInDays = deletePreviousVersionInDays;
  }


  public RotatedSecretDetailsInfo graceRotation(Boolean graceRotation) {
    
    this.graceRotation = graceRotation;
    return this;
  }

   /**
   * Get graceRotation
   * @return graceRotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getGraceRotation() {
    return graceRotation;
  }


  public void setGraceRotation(Boolean graceRotation) {
    this.graceRotation = graceRotation;
  }


  public RotatedSecretDetailsInfo gwClusterId(Long gwClusterId) {
    
    this.gwClusterId = gwClusterId;
    return this;
  }

   /**
   * Get gwClusterId
   * @return gwClusterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGwClusterId() {
    return gwClusterId;
  }


  public void setGwClusterId(Long gwClusterId) {
    this.gwClusterId = gwClusterId;
  }


  public RotatedSecretDetailsInfo lastRotationError(String lastRotationError) {
    
    this.lastRotationError = lastRotationError;
    return this;
  }

   /**
   * Get lastRotationError
   * @return lastRotationError
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastRotationError() {
    return lastRotationError;
  }


  public void setLastRotationError(String lastRotationError) {
    this.lastRotationError = lastRotationError;
  }


  public RotatedSecretDetailsInfo maxVersions(Long maxVersions) {
    
    this.maxVersions = maxVersions;
    return this;
  }

   /**
   * Get maxVersions
   * @return maxVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMaxVersions() {
    return maxVersions;
  }


  public void setMaxVersions(Long maxVersions) {
    this.maxVersions = maxVersions;
  }


  public RotatedSecretDetailsInfo numberOfVersionsToSave(Integer numberOfVersionsToSave) {
    
    this.numberOfVersionsToSave = numberOfVersionsToSave;
    return this;
  }

   /**
   * Get numberOfVersionsToSave
   * @return numberOfVersionsToSave
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNumberOfVersionsToSave() {
    return numberOfVersionsToSave;
  }


  public void setNumberOfVersionsToSave(Integer numberOfVersionsToSave) {
    this.numberOfVersionsToSave = numberOfVersionsToSave;
  }


  public RotatedSecretDetailsInfo rotationHour(Integer rotationHour) {
    
    this.rotationHour = rotationHour;
    return this;
  }

   /**
   * Get rotationHour
   * @return rotationHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRotationHour() {
    return rotationHour;
  }


  public void setRotationHour(Integer rotationHour) {
    this.rotationHour = rotationHour;
  }


  public RotatedSecretDetailsInfo rotationIntervalMin(Boolean rotationIntervalMin) {
    
    this.rotationIntervalMin = rotationIntervalMin;
    return this;
  }

   /**
   * Get rotationIntervalMin
   * @return rotationIntervalMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRotationIntervalMin() {
    return rotationIntervalMin;
  }


  public void setRotationIntervalMin(Boolean rotationIntervalMin) {
    this.rotationIntervalMin = rotationIntervalMin;
  }


  public RotatedSecretDetailsInfo rotationStatement(String rotationStatement) {
    
    this.rotationStatement = rotationStatement;
    return this;
  }

   /**
   * Get rotationStatement
   * @return rotationStatement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRotationStatement() {
    return rotationStatement;
  }


  public void setRotationStatement(String rotationStatement) {
    this.rotationStatement = rotationStatement;
  }


  public RotatedSecretDetailsInfo rotatorCredsType(String rotatorCredsType) {
    
    this.rotatorCredsType = rotatorCredsType;
    return this;
  }

   /**
   * Get rotatorCredsType
   * @return rotatorCredsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRotatorCredsType() {
    return rotatorCredsType;
  }


  public void setRotatorCredsType(String rotatorCredsType) {
    this.rotatorCredsType = rotatorCredsType;
  }


  public RotatedSecretDetailsInfo rotatorStatus(String rotatorStatus) {
    
    this.rotatorStatus = rotatorStatus;
    return this;
  }

   /**
   * RotationStatus defines types of rotation Status
   * @return rotatorStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RotationStatus defines types of rotation Status")

  public String getRotatorStatus() {
    return rotatorStatus;
  }


  public void setRotatorStatus(String rotatorStatus) {
    this.rotatorStatus = rotatorStatus;
  }


  public RotatedSecretDetailsInfo rotatorType(String rotatorType) {
    
    this.rotatorType = rotatorType;
    return this;
  }

   /**
   * Get rotatorType
   * @return rotatorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRotatorType() {
    return rotatorType;
  }


  public void setRotatorType(String rotatorType) {
    this.rotatorType = rotatorType;
  }


  public RotatedSecretDetailsInfo samePassword(Boolean samePassword) {
    
    this.samePassword = samePassword;
    return this;
  }

   /**
   * Get samePassword
   * @return samePassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSamePassword() {
    return samePassword;
  }


  public void setSamePassword(Boolean samePassword) {
    this.samePassword = samePassword;
  }


  public RotatedSecretDetailsInfo servicesDetails(List<WindowsService> servicesDetails) {
    
    this.servicesDetails = servicesDetails;
    return this;
  }

  public RotatedSecretDetailsInfo addServicesDetailsItem(WindowsService servicesDetailsItem) {
    if (this.servicesDetails == null) {
      this.servicesDetails = new ArrayList<WindowsService>();
    }
    this.servicesDetails.add(servicesDetailsItem);
    return this;
  }

   /**
   * Get servicesDetails
   * @return servicesDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<WindowsService> getServicesDetails() {
    return servicesDetails;
  }


  public void setServicesDetails(List<WindowsService> servicesDetails) {
    this.servicesDetails = servicesDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RotatedSecretDetailsInfo rotatedSecretDetailsInfo = (RotatedSecretDetailsInfo) o;
    return Objects.equals(this.deletePreviousVersionInDays, rotatedSecretDetailsInfo.deletePreviousVersionInDays) &&
        Objects.equals(this.graceRotation, rotatedSecretDetailsInfo.graceRotation) &&
        Objects.equals(this.gwClusterId, rotatedSecretDetailsInfo.gwClusterId) &&
        Objects.equals(this.lastRotationError, rotatedSecretDetailsInfo.lastRotationError) &&
        Objects.equals(this.maxVersions, rotatedSecretDetailsInfo.maxVersions) &&
        Objects.equals(this.numberOfVersionsToSave, rotatedSecretDetailsInfo.numberOfVersionsToSave) &&
        Objects.equals(this.rotationHour, rotatedSecretDetailsInfo.rotationHour) &&
        Objects.equals(this.rotationIntervalMin, rotatedSecretDetailsInfo.rotationIntervalMin) &&
        Objects.equals(this.rotationStatement, rotatedSecretDetailsInfo.rotationStatement) &&
        Objects.equals(this.rotatorCredsType, rotatedSecretDetailsInfo.rotatorCredsType) &&
        Objects.equals(this.rotatorStatus, rotatedSecretDetailsInfo.rotatorStatus) &&
        Objects.equals(this.rotatorType, rotatedSecretDetailsInfo.rotatorType) &&
        Objects.equals(this.samePassword, rotatedSecretDetailsInfo.samePassword) &&
        Objects.equals(this.servicesDetails, rotatedSecretDetailsInfo.servicesDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletePreviousVersionInDays, graceRotation, gwClusterId, lastRotationError, maxVersions, numberOfVersionsToSave, rotationHour, rotationIntervalMin, rotationStatement, rotatorCredsType, rotatorStatus, rotatorType, samePassword, servicesDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RotatedSecretDetailsInfo {\n");
    sb.append("    deletePreviousVersionInDays: ").append(toIndentedString(deletePreviousVersionInDays)).append("\n");
    sb.append("    graceRotation: ").append(toIndentedString(graceRotation)).append("\n");
    sb.append("    gwClusterId: ").append(toIndentedString(gwClusterId)).append("\n");
    sb.append("    lastRotationError: ").append(toIndentedString(lastRotationError)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    numberOfVersionsToSave: ").append(toIndentedString(numberOfVersionsToSave)).append("\n");
    sb.append("    rotationHour: ").append(toIndentedString(rotationHour)).append("\n");
    sb.append("    rotationIntervalMin: ").append(toIndentedString(rotationIntervalMin)).append("\n");
    sb.append("    rotationStatement: ").append(toIndentedString(rotationStatement)).append("\n");
    sb.append("    rotatorCredsType: ").append(toIndentedString(rotatorCredsType)).append("\n");
    sb.append("    rotatorStatus: ").append(toIndentedString(rotatorStatus)).append("\n");
    sb.append("    rotatorType: ").append(toIndentedString(rotatorType)).append("\n");
    sb.append("    samePassword: ").append(toIndentedString(samePassword)).append("\n");
    sb.append("    servicesDetails: ").append(toIndentedString(servicesDetails)).append("\n");
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

