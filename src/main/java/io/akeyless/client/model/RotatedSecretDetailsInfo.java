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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.akeyless.client.model.WindowsService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.akeyless.client.JSON;

/**
 * RotatedSecretDetailsInfo The rotated secret rotator info
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class RotatedSecretDetailsInfo {
  public static final String SERIALIZED_NAME_DELETE_PREVIOUS_VERSION_IN_DAYS = "delete_previous_version_in_days";
  @SerializedName(SERIALIZED_NAME_DELETE_PREVIOUS_VERSION_IN_DAYS)
  @javax.annotation.Nullable
  private Integer deletePreviousVersionInDays;

  public static final String SERIALIZED_NAME_GRACE_ROTATION = "grace_rotation";
  @SerializedName(SERIALIZED_NAME_GRACE_ROTATION)
  @javax.annotation.Nullable
  private Boolean graceRotation;

  public static final String SERIALIZED_NAME_GW_CLUSTER_ID = "gw_cluster_id";
  @SerializedName(SERIALIZED_NAME_GW_CLUSTER_ID)
  @javax.annotation.Nullable
  private Long gwClusterId;

  public static final String SERIALIZED_NAME_LAST_ROTATION_ERROR = "last_rotation_error";
  @SerializedName(SERIALIZED_NAME_LAST_ROTATION_ERROR)
  @javax.annotation.Nullable
  private String lastRotationError;

  public static final String SERIALIZED_NAME_MANAGED_BY_AKEYLESS = "managed_by_akeyless";
  @SerializedName(SERIALIZED_NAME_MANAGED_BY_AKEYLESS)
  @javax.annotation.Nullable
  private Boolean managedByAkeyless;

  public static final String SERIALIZED_NAME_MAX_VERSIONS = "max_versions";
  @SerializedName(SERIALIZED_NAME_MAX_VERSIONS)
  @javax.annotation.Nullable
  private Long maxVersions;

  public static final String SERIALIZED_NAME_NUMBER_OF_VERSIONS_TO_SAVE = "number_of_versions_to_save";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_VERSIONS_TO_SAVE)
  @javax.annotation.Nullable
  private Integer numberOfVersionsToSave;

  public static final String SERIALIZED_NAME_ROTATION_HOUR = "rotation_hour";
  @SerializedName(SERIALIZED_NAME_ROTATION_HOUR)
  @javax.annotation.Nullable
  private Integer rotationHour;

  public static final String SERIALIZED_NAME_ROTATION_INTERVAL_MIN = "rotation_interval_min";
  @SerializedName(SERIALIZED_NAME_ROTATION_INTERVAL_MIN)
  @javax.annotation.Nullable
  private Boolean rotationIntervalMin;

  public static final String SERIALIZED_NAME_ROTATION_STATEMENT = "rotation_statement";
  @SerializedName(SERIALIZED_NAME_ROTATION_STATEMENT)
  @javax.annotation.Nullable
  private String rotationStatement;

  public static final String SERIALIZED_NAME_ROTATOR_CREDS_TYPE = "rotator_creds_type";
  @SerializedName(SERIALIZED_NAME_ROTATOR_CREDS_TYPE)
  @javax.annotation.Nullable
  private String rotatorCredsType;

  public static final String SERIALIZED_NAME_ROTATOR_STATUS = "rotator_status";
  @SerializedName(SERIALIZED_NAME_ROTATOR_STATUS)
  @javax.annotation.Nullable
  private String rotatorStatus;

  public static final String SERIALIZED_NAME_ROTATOR_TYPE = "rotator_type";
  @SerializedName(SERIALIZED_NAME_ROTATOR_TYPE)
  @javax.annotation.Nullable
  private String rotatorType;

  public static final String SERIALIZED_NAME_SAME_PASSWORD = "same_password";
  @SerializedName(SERIALIZED_NAME_SAME_PASSWORD)
  @javax.annotation.Nullable
  private Boolean samePassword;

  public static final String SERIALIZED_NAME_SERVICES_DETAILS = "services_details";
  @SerializedName(SERIALIZED_NAME_SERVICES_DETAILS)
  @javax.annotation.Nullable
  private List<WindowsService> servicesDetails = new ArrayList<>();

  public static final String SERIALIZED_NAME_TIMEOUT_SECONDS = "timeout_seconds";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_SECONDS)
  @javax.annotation.Nullable
  private Long timeoutSeconds;

  public RotatedSecretDetailsInfo() {
  }

  public RotatedSecretDetailsInfo deletePreviousVersionInDays(@javax.annotation.Nullable Integer deletePreviousVersionInDays) {
    this.deletePreviousVersionInDays = deletePreviousVersionInDays;
    return this;
  }

  /**
   * Get deletePreviousVersionInDays
   * @return deletePreviousVersionInDays
   */
  @javax.annotation.Nullable
  public Integer getDeletePreviousVersionInDays() {
    return deletePreviousVersionInDays;
  }

  public void setDeletePreviousVersionInDays(@javax.annotation.Nullable Integer deletePreviousVersionInDays) {
    this.deletePreviousVersionInDays = deletePreviousVersionInDays;
  }


  public RotatedSecretDetailsInfo graceRotation(@javax.annotation.Nullable Boolean graceRotation) {
    this.graceRotation = graceRotation;
    return this;
  }

  /**
   * Get graceRotation
   * @return graceRotation
   */
  @javax.annotation.Nullable
  public Boolean getGraceRotation() {
    return graceRotation;
  }

  public void setGraceRotation(@javax.annotation.Nullable Boolean graceRotation) {
    this.graceRotation = graceRotation;
  }


  public RotatedSecretDetailsInfo gwClusterId(@javax.annotation.Nullable Long gwClusterId) {
    this.gwClusterId = gwClusterId;
    return this;
  }

  /**
   * Get gwClusterId
   * @return gwClusterId
   */
  @javax.annotation.Nullable
  public Long getGwClusterId() {
    return gwClusterId;
  }

  public void setGwClusterId(@javax.annotation.Nullable Long gwClusterId) {
    this.gwClusterId = gwClusterId;
  }


  public RotatedSecretDetailsInfo lastRotationError(@javax.annotation.Nullable String lastRotationError) {
    this.lastRotationError = lastRotationError;
    return this;
  }

  /**
   * Get lastRotationError
   * @return lastRotationError
   */
  @javax.annotation.Nullable
  public String getLastRotationError() {
    return lastRotationError;
  }

  public void setLastRotationError(@javax.annotation.Nullable String lastRotationError) {
    this.lastRotationError = lastRotationError;
  }


  public RotatedSecretDetailsInfo managedByAkeyless(@javax.annotation.Nullable Boolean managedByAkeyless) {
    this.managedByAkeyless = managedByAkeyless;
    return this;
  }

  /**
   * Get managedByAkeyless
   * @return managedByAkeyless
   */
  @javax.annotation.Nullable
  public Boolean getManagedByAkeyless() {
    return managedByAkeyless;
  }

  public void setManagedByAkeyless(@javax.annotation.Nullable Boolean managedByAkeyless) {
    this.managedByAkeyless = managedByAkeyless;
  }


  public RotatedSecretDetailsInfo maxVersions(@javax.annotation.Nullable Long maxVersions) {
    this.maxVersions = maxVersions;
    return this;
  }

  /**
   * Get maxVersions
   * @return maxVersions
   */
  @javax.annotation.Nullable
  public Long getMaxVersions() {
    return maxVersions;
  }

  public void setMaxVersions(@javax.annotation.Nullable Long maxVersions) {
    this.maxVersions = maxVersions;
  }


  public RotatedSecretDetailsInfo numberOfVersionsToSave(@javax.annotation.Nullable Integer numberOfVersionsToSave) {
    this.numberOfVersionsToSave = numberOfVersionsToSave;
    return this;
  }

  /**
   * Get numberOfVersionsToSave
   * @return numberOfVersionsToSave
   */
  @javax.annotation.Nullable
  public Integer getNumberOfVersionsToSave() {
    return numberOfVersionsToSave;
  }

  public void setNumberOfVersionsToSave(@javax.annotation.Nullable Integer numberOfVersionsToSave) {
    this.numberOfVersionsToSave = numberOfVersionsToSave;
  }


  public RotatedSecretDetailsInfo rotationHour(@javax.annotation.Nullable Integer rotationHour) {
    this.rotationHour = rotationHour;
    return this;
  }

  /**
   * Get rotationHour
   * @return rotationHour
   */
  @javax.annotation.Nullable
  public Integer getRotationHour() {
    return rotationHour;
  }

  public void setRotationHour(@javax.annotation.Nullable Integer rotationHour) {
    this.rotationHour = rotationHour;
  }


  public RotatedSecretDetailsInfo rotationIntervalMin(@javax.annotation.Nullable Boolean rotationIntervalMin) {
    this.rotationIntervalMin = rotationIntervalMin;
    return this;
  }

  /**
   * Get rotationIntervalMin
   * @return rotationIntervalMin
   */
  @javax.annotation.Nullable
  public Boolean getRotationIntervalMin() {
    return rotationIntervalMin;
  }

  public void setRotationIntervalMin(@javax.annotation.Nullable Boolean rotationIntervalMin) {
    this.rotationIntervalMin = rotationIntervalMin;
  }


  public RotatedSecretDetailsInfo rotationStatement(@javax.annotation.Nullable String rotationStatement) {
    this.rotationStatement = rotationStatement;
    return this;
  }

  /**
   * Get rotationStatement
   * @return rotationStatement
   */
  @javax.annotation.Nullable
  public String getRotationStatement() {
    return rotationStatement;
  }

  public void setRotationStatement(@javax.annotation.Nullable String rotationStatement) {
    this.rotationStatement = rotationStatement;
  }


  public RotatedSecretDetailsInfo rotatorCredsType(@javax.annotation.Nullable String rotatorCredsType) {
    this.rotatorCredsType = rotatorCredsType;
    return this;
  }

  /**
   * Get rotatorCredsType
   * @return rotatorCredsType
   */
  @javax.annotation.Nullable
  public String getRotatorCredsType() {
    return rotatorCredsType;
  }

  public void setRotatorCredsType(@javax.annotation.Nullable String rotatorCredsType) {
    this.rotatorCredsType = rotatorCredsType;
  }


  public RotatedSecretDetailsInfo rotatorStatus(@javax.annotation.Nullable String rotatorStatus) {
    this.rotatorStatus = rotatorStatus;
    return this;
  }

  /**
   * RotationStatus defines types of rotation Status
   * @return rotatorStatus
   */
  @javax.annotation.Nullable
  public String getRotatorStatus() {
    return rotatorStatus;
  }

  public void setRotatorStatus(@javax.annotation.Nullable String rotatorStatus) {
    this.rotatorStatus = rotatorStatus;
  }


  public RotatedSecretDetailsInfo rotatorType(@javax.annotation.Nullable String rotatorType) {
    this.rotatorType = rotatorType;
    return this;
  }

  /**
   * Get rotatorType
   * @return rotatorType
   */
  @javax.annotation.Nullable
  public String getRotatorType() {
    return rotatorType;
  }

  public void setRotatorType(@javax.annotation.Nullable String rotatorType) {
    this.rotatorType = rotatorType;
  }


  public RotatedSecretDetailsInfo samePassword(@javax.annotation.Nullable Boolean samePassword) {
    this.samePassword = samePassword;
    return this;
  }

  /**
   * Get samePassword
   * @return samePassword
   */
  @javax.annotation.Nullable
  public Boolean getSamePassword() {
    return samePassword;
  }

  public void setSamePassword(@javax.annotation.Nullable Boolean samePassword) {
    this.samePassword = samePassword;
  }


  public RotatedSecretDetailsInfo servicesDetails(@javax.annotation.Nullable List<WindowsService> servicesDetails) {
    this.servicesDetails = servicesDetails;
    return this;
  }

  public RotatedSecretDetailsInfo addServicesDetailsItem(WindowsService servicesDetailsItem) {
    if (this.servicesDetails == null) {
      this.servicesDetails = new ArrayList<>();
    }
    this.servicesDetails.add(servicesDetailsItem);
    return this;
  }

  /**
   * Get servicesDetails
   * @return servicesDetails
   */
  @javax.annotation.Nullable
  public List<WindowsService> getServicesDetails() {
    return servicesDetails;
  }

  public void setServicesDetails(@javax.annotation.Nullable List<WindowsService> servicesDetails) {
    this.servicesDetails = servicesDetails;
  }


  public RotatedSecretDetailsInfo timeoutSeconds(@javax.annotation.Nullable Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  /**
   * Get timeoutSeconds
   * @return timeoutSeconds
   */
  @javax.annotation.Nullable
  public Long getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public void setTimeoutSeconds(@javax.annotation.Nullable Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
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
        Objects.equals(this.managedByAkeyless, rotatedSecretDetailsInfo.managedByAkeyless) &&
        Objects.equals(this.maxVersions, rotatedSecretDetailsInfo.maxVersions) &&
        Objects.equals(this.numberOfVersionsToSave, rotatedSecretDetailsInfo.numberOfVersionsToSave) &&
        Objects.equals(this.rotationHour, rotatedSecretDetailsInfo.rotationHour) &&
        Objects.equals(this.rotationIntervalMin, rotatedSecretDetailsInfo.rotationIntervalMin) &&
        Objects.equals(this.rotationStatement, rotatedSecretDetailsInfo.rotationStatement) &&
        Objects.equals(this.rotatorCredsType, rotatedSecretDetailsInfo.rotatorCredsType) &&
        Objects.equals(this.rotatorStatus, rotatedSecretDetailsInfo.rotatorStatus) &&
        Objects.equals(this.rotatorType, rotatedSecretDetailsInfo.rotatorType) &&
        Objects.equals(this.samePassword, rotatedSecretDetailsInfo.samePassword) &&
        Objects.equals(this.servicesDetails, rotatedSecretDetailsInfo.servicesDetails) &&
        Objects.equals(this.timeoutSeconds, rotatedSecretDetailsInfo.timeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletePreviousVersionInDays, graceRotation, gwClusterId, lastRotationError, managedByAkeyless, maxVersions, numberOfVersionsToSave, rotationHour, rotationIntervalMin, rotationStatement, rotatorCredsType, rotatorStatus, rotatorType, samePassword, servicesDetails, timeoutSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RotatedSecretDetailsInfo {\n");
    sb.append("    deletePreviousVersionInDays: ").append(toIndentedString(deletePreviousVersionInDays)).append("\n");
    sb.append("    graceRotation: ").append(toIndentedString(graceRotation)).append("\n");
    sb.append("    gwClusterId: ").append(toIndentedString(gwClusterId)).append("\n");
    sb.append("    lastRotationError: ").append(toIndentedString(lastRotationError)).append("\n");
    sb.append("    managedByAkeyless: ").append(toIndentedString(managedByAkeyless)).append("\n");
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
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("delete_previous_version_in_days");
    openapiFields.add("grace_rotation");
    openapiFields.add("gw_cluster_id");
    openapiFields.add("last_rotation_error");
    openapiFields.add("managed_by_akeyless");
    openapiFields.add("max_versions");
    openapiFields.add("number_of_versions_to_save");
    openapiFields.add("rotation_hour");
    openapiFields.add("rotation_interval_min");
    openapiFields.add("rotation_statement");
    openapiFields.add("rotator_creds_type");
    openapiFields.add("rotator_status");
    openapiFields.add("rotator_type");
    openapiFields.add("same_password");
    openapiFields.add("services_details");
    openapiFields.add("timeout_seconds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RotatedSecretDetailsInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RotatedSecretDetailsInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RotatedSecretDetailsInfo is not found in the empty JSON string", RotatedSecretDetailsInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RotatedSecretDetailsInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RotatedSecretDetailsInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("last_rotation_error") != null && !jsonObj.get("last_rotation_error").isJsonNull()) && !jsonObj.get("last_rotation_error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_rotation_error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_rotation_error").toString()));
      }
      if ((jsonObj.get("rotation_statement") != null && !jsonObj.get("rotation_statement").isJsonNull()) && !jsonObj.get("rotation_statement").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rotation_statement` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rotation_statement").toString()));
      }
      if ((jsonObj.get("rotator_creds_type") != null && !jsonObj.get("rotator_creds_type").isJsonNull()) && !jsonObj.get("rotator_creds_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rotator_creds_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rotator_creds_type").toString()));
      }
      if ((jsonObj.get("rotator_status") != null && !jsonObj.get("rotator_status").isJsonNull()) && !jsonObj.get("rotator_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rotator_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rotator_status").toString()));
      }
      if ((jsonObj.get("rotator_type") != null && !jsonObj.get("rotator_type").isJsonNull()) && !jsonObj.get("rotator_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rotator_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rotator_type").toString()));
      }
      if (jsonObj.get("services_details") != null && !jsonObj.get("services_details").isJsonNull()) {
        JsonArray jsonArrayservicesDetails = jsonObj.getAsJsonArray("services_details");
        if (jsonArrayservicesDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("services_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `services_details` to be an array in the JSON string but got `%s`", jsonObj.get("services_details").toString()));
          }

          // validate the optional field `services_details` (array)
          for (int i = 0; i < jsonArrayservicesDetails.size(); i++) {
            WindowsService.validateJsonElement(jsonArrayservicesDetails.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RotatedSecretDetailsInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RotatedSecretDetailsInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RotatedSecretDetailsInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RotatedSecretDetailsInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<RotatedSecretDetailsInfo>() {
           @Override
           public void write(JsonWriter out, RotatedSecretDetailsInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RotatedSecretDetailsInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RotatedSecretDetailsInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RotatedSecretDetailsInfo
   * @throws IOException if the JSON string is invalid with respect to RotatedSecretDetailsInfo
   */
  public static RotatedSecretDetailsInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RotatedSecretDetailsInfo.class);
  }

  /**
   * Convert an instance of RotatedSecretDetailsInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

