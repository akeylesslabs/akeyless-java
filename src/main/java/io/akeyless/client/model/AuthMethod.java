/*
 * Akeyless API
 * The purpose of this application is to provide access to Akeyless API.
 *
 * The version of the OpenAPI document: 3.0
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
import io.akeyless.client.model.AuthExpirationEvent;
import io.akeyless.client.model.AuthMethodAccessInfo;
import io.akeyless.client.model.AuthMethodAdditionalData;
import io.akeyless.client.model.AuthMethodRoleAssociation;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * AuthMethod
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class AuthMethod {
  public static final String SERIALIZED_NAME_ACCESS_DATE = "access_date";
  @SerializedName(SERIALIZED_NAME_ACCESS_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime accessDate;

  public static final String SERIALIZED_NAME_ACCESS_DATE_DISPLAY = "access_date_display";
  @SerializedName(SERIALIZED_NAME_ACCESS_DATE_DISPLAY)
  @javax.annotation.Nullable
  private String accessDateDisplay;

  public static final String SERIALIZED_NAME_ACCESS_INFO = "access_info";
  @SerializedName(SERIALIZED_NAME_ACCESS_INFO)
  @javax.annotation.Nullable
  private AuthMethodAccessInfo accessInfo;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  @javax.annotation.Nullable
  private String accountId;

  public static final String SERIALIZED_NAME_ASSOCIATED_GW_IDS = "associated_gw_ids";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_GW_IDS)
  @javax.annotation.Nullable
  private List<Long> associatedGwIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_AUTH_METHOD_ACCESS_ID = "auth_method_access_id";
  @SerializedName(SERIALIZED_NAME_AUTH_METHOD_ACCESS_ID)
  @javax.annotation.Nullable
  private String authMethodAccessId;

  public static final String SERIALIZED_NAME_AUTH_METHOD_ADDITIONAL_DATA = "auth_method_additional_data";
  @SerializedName(SERIALIZED_NAME_AUTH_METHOD_ADDITIONAL_DATA)
  @javax.annotation.Nullable
  private AuthMethodAdditionalData authMethodAdditionalData;

  public static final String SERIALIZED_NAME_AUTH_METHOD_NAME = "auth_method_name";
  @SerializedName(SERIALIZED_NAME_AUTH_METHOD_NAME)
  @javax.annotation.Nullable
  private String authMethodName;

  public static final String SERIALIZED_NAME_AUTH_METHOD_ROLES_ASSOC = "auth_method_roles_assoc";
  @SerializedName(SERIALIZED_NAME_AUTH_METHOD_ROLES_ASSOC)
  @javax.annotation.Nullable
  private List<AuthMethodRoleAssociation> authMethodRolesAssoc = new ArrayList<>();

  public static final String SERIALIZED_NAME_CLIENT_PERMISSIONS = "client_permissions";
  @SerializedName(SERIALIZED_NAME_CLIENT_PERMISSIONS)
  @javax.annotation.Nullable
  private List<String> clientPermissions = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATION_DATE = "creation_date";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  @javax.annotation.Nullable
  private Boolean deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_EXPIRATION_EVENTS = "expiration_events";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_EVENTS)
  @javax.annotation.Nullable
  private List<AuthExpirationEvent> expirationEvents = new ArrayList<>();

  public static final String SERIALIZED_NAME_IS_APPROVED = "is_approved";
  @SerializedName(SERIALIZED_NAME_IS_APPROVED)
  @javax.annotation.Nullable
  private Boolean isApproved;

  public static final String SERIALIZED_NAME_MODIFICATION_DATE = "modification_date";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime modificationDate;

  public AuthMethod() {
  }

  public AuthMethod accessDate(@javax.annotation.Nullable OffsetDateTime accessDate) {
    this.accessDate = accessDate;
    return this;
  }

  /**
   * Get accessDate
   * @return accessDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getAccessDate() {
    return accessDate;
  }

  public void setAccessDate(@javax.annotation.Nullable OffsetDateTime accessDate) {
    this.accessDate = accessDate;
  }


  public AuthMethod accessDateDisplay(@javax.annotation.Nullable String accessDateDisplay) {
    this.accessDateDisplay = accessDateDisplay;
    return this;
  }

  /**
   * Get accessDateDisplay
   * @return accessDateDisplay
   */
  @javax.annotation.Nullable
  public String getAccessDateDisplay() {
    return accessDateDisplay;
  }

  public void setAccessDateDisplay(@javax.annotation.Nullable String accessDateDisplay) {
    this.accessDateDisplay = accessDateDisplay;
  }


  public AuthMethod accessInfo(@javax.annotation.Nullable AuthMethodAccessInfo accessInfo) {
    this.accessInfo = accessInfo;
    return this;
  }

  /**
   * Get accessInfo
   * @return accessInfo
   */
  @javax.annotation.Nullable
  public AuthMethodAccessInfo getAccessInfo() {
    return accessInfo;
  }

  public void setAccessInfo(@javax.annotation.Nullable AuthMethodAccessInfo accessInfo) {
    this.accessInfo = accessInfo;
  }


  public AuthMethod accountId(@javax.annotation.Nullable String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
   */
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(@javax.annotation.Nullable String accountId) {
    this.accountId = accountId;
  }


  public AuthMethod associatedGwIds(@javax.annotation.Nullable List<Long> associatedGwIds) {
    this.associatedGwIds = associatedGwIds;
    return this;
  }

  public AuthMethod addAssociatedGwIdsItem(Long associatedGwIdsItem) {
    if (this.associatedGwIds == null) {
      this.associatedGwIds = new ArrayList<>();
    }
    this.associatedGwIds.add(associatedGwIdsItem);
    return this;
  }

  /**
   * Get associatedGwIds
   * @return associatedGwIds
   */
  @javax.annotation.Nullable
  public List<Long> getAssociatedGwIds() {
    return associatedGwIds;
  }

  public void setAssociatedGwIds(@javax.annotation.Nullable List<Long> associatedGwIds) {
    this.associatedGwIds = associatedGwIds;
  }


  public AuthMethod authMethodAccessId(@javax.annotation.Nullable String authMethodAccessId) {
    this.authMethodAccessId = authMethodAccessId;
    return this;
  }

  /**
   * Get authMethodAccessId
   * @return authMethodAccessId
   */
  @javax.annotation.Nullable
  public String getAuthMethodAccessId() {
    return authMethodAccessId;
  }

  public void setAuthMethodAccessId(@javax.annotation.Nullable String authMethodAccessId) {
    this.authMethodAccessId = authMethodAccessId;
  }


  public AuthMethod authMethodAdditionalData(@javax.annotation.Nullable AuthMethodAdditionalData authMethodAdditionalData) {
    this.authMethodAdditionalData = authMethodAdditionalData;
    return this;
  }

  /**
   * Get authMethodAdditionalData
   * @return authMethodAdditionalData
   */
  @javax.annotation.Nullable
  public AuthMethodAdditionalData getAuthMethodAdditionalData() {
    return authMethodAdditionalData;
  }

  public void setAuthMethodAdditionalData(@javax.annotation.Nullable AuthMethodAdditionalData authMethodAdditionalData) {
    this.authMethodAdditionalData = authMethodAdditionalData;
  }


  public AuthMethod authMethodName(@javax.annotation.Nullable String authMethodName) {
    this.authMethodName = authMethodName;
    return this;
  }

  /**
   * Get authMethodName
   * @return authMethodName
   */
  @javax.annotation.Nullable
  public String getAuthMethodName() {
    return authMethodName;
  }

  public void setAuthMethodName(@javax.annotation.Nullable String authMethodName) {
    this.authMethodName = authMethodName;
  }


  public AuthMethod authMethodRolesAssoc(@javax.annotation.Nullable List<AuthMethodRoleAssociation> authMethodRolesAssoc) {
    this.authMethodRolesAssoc = authMethodRolesAssoc;
    return this;
  }

  public AuthMethod addAuthMethodRolesAssocItem(AuthMethodRoleAssociation authMethodRolesAssocItem) {
    if (this.authMethodRolesAssoc == null) {
      this.authMethodRolesAssoc = new ArrayList<>();
    }
    this.authMethodRolesAssoc.add(authMethodRolesAssocItem);
    return this;
  }

  /**
   * Get authMethodRolesAssoc
   * @return authMethodRolesAssoc
   */
  @javax.annotation.Nullable
  public List<AuthMethodRoleAssociation> getAuthMethodRolesAssoc() {
    return authMethodRolesAssoc;
  }

  public void setAuthMethodRolesAssoc(@javax.annotation.Nullable List<AuthMethodRoleAssociation> authMethodRolesAssoc) {
    this.authMethodRolesAssoc = authMethodRolesAssoc;
  }


  public AuthMethod clientPermissions(@javax.annotation.Nullable List<String> clientPermissions) {
    this.clientPermissions = clientPermissions;
    return this;
  }

  public AuthMethod addClientPermissionsItem(String clientPermissionsItem) {
    if (this.clientPermissions == null) {
      this.clientPermissions = new ArrayList<>();
    }
    this.clientPermissions.add(clientPermissionsItem);
    return this;
  }

  /**
   * Get clientPermissions
   * @return clientPermissions
   */
  @javax.annotation.Nullable
  public List<String> getClientPermissions() {
    return clientPermissions;
  }

  public void setClientPermissions(@javax.annotation.Nullable List<String> clientPermissions) {
    this.clientPermissions = clientPermissions;
  }


  public AuthMethod creationDate(@javax.annotation.Nullable OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(@javax.annotation.Nullable OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public AuthMethod deleteProtection(@javax.annotation.Nullable Boolean deleteProtection) {
    this.deleteProtection = deleteProtection;
    return this;
  }

  /**
   * Get deleteProtection
   * @return deleteProtection
   */
  @javax.annotation.Nullable
  public Boolean getDeleteProtection() {
    return deleteProtection;
  }

  public void setDeleteProtection(@javax.annotation.Nullable Boolean deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public AuthMethod description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public AuthMethod expirationEvents(@javax.annotation.Nullable List<AuthExpirationEvent> expirationEvents) {
    this.expirationEvents = expirationEvents;
    return this;
  }

  public AuthMethod addExpirationEventsItem(AuthExpirationEvent expirationEventsItem) {
    if (this.expirationEvents == null) {
      this.expirationEvents = new ArrayList<>();
    }
    this.expirationEvents.add(expirationEventsItem);
    return this;
  }

  /**
   * Get expirationEvents
   * @return expirationEvents
   */
  @javax.annotation.Nullable
  public List<AuthExpirationEvent> getExpirationEvents() {
    return expirationEvents;
  }

  public void setExpirationEvents(@javax.annotation.Nullable List<AuthExpirationEvent> expirationEvents) {
    this.expirationEvents = expirationEvents;
  }


  public AuthMethod isApproved(@javax.annotation.Nullable Boolean isApproved) {
    this.isApproved = isApproved;
    return this;
  }

  /**
   * Get isApproved
   * @return isApproved
   */
  @javax.annotation.Nullable
  public Boolean getIsApproved() {
    return isApproved;
  }

  public void setIsApproved(@javax.annotation.Nullable Boolean isApproved) {
    this.isApproved = isApproved;
  }


  public AuthMethod modificationDate(@javax.annotation.Nullable OffsetDateTime modificationDate) {
    this.modificationDate = modificationDate;
    return this;
  }

  /**
   * Get modificationDate
   * @return modificationDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getModificationDate() {
    return modificationDate;
  }

  public void setModificationDate(@javax.annotation.Nullable OffsetDateTime modificationDate) {
    this.modificationDate = modificationDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthMethod authMethod = (AuthMethod) o;
    return Objects.equals(this.accessDate, authMethod.accessDate) &&
        Objects.equals(this.accessDateDisplay, authMethod.accessDateDisplay) &&
        Objects.equals(this.accessInfo, authMethod.accessInfo) &&
        Objects.equals(this.accountId, authMethod.accountId) &&
        Objects.equals(this.associatedGwIds, authMethod.associatedGwIds) &&
        Objects.equals(this.authMethodAccessId, authMethod.authMethodAccessId) &&
        Objects.equals(this.authMethodAdditionalData, authMethod.authMethodAdditionalData) &&
        Objects.equals(this.authMethodName, authMethod.authMethodName) &&
        Objects.equals(this.authMethodRolesAssoc, authMethod.authMethodRolesAssoc) &&
        Objects.equals(this.clientPermissions, authMethod.clientPermissions) &&
        Objects.equals(this.creationDate, authMethod.creationDate) &&
        Objects.equals(this.deleteProtection, authMethod.deleteProtection) &&
        Objects.equals(this.description, authMethod.description) &&
        Objects.equals(this.expirationEvents, authMethod.expirationEvents) &&
        Objects.equals(this.isApproved, authMethod.isApproved) &&
        Objects.equals(this.modificationDate, authMethod.modificationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessDate, accessDateDisplay, accessInfo, accountId, associatedGwIds, authMethodAccessId, authMethodAdditionalData, authMethodName, authMethodRolesAssoc, clientPermissions, creationDate, deleteProtection, description, expirationEvents, isApproved, modificationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthMethod {\n");
    sb.append("    accessDate: ").append(toIndentedString(accessDate)).append("\n");
    sb.append("    accessDateDisplay: ").append(toIndentedString(accessDateDisplay)).append("\n");
    sb.append("    accessInfo: ").append(toIndentedString(accessInfo)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    associatedGwIds: ").append(toIndentedString(associatedGwIds)).append("\n");
    sb.append("    authMethodAccessId: ").append(toIndentedString(authMethodAccessId)).append("\n");
    sb.append("    authMethodAdditionalData: ").append(toIndentedString(authMethodAdditionalData)).append("\n");
    sb.append("    authMethodName: ").append(toIndentedString(authMethodName)).append("\n");
    sb.append("    authMethodRolesAssoc: ").append(toIndentedString(authMethodRolesAssoc)).append("\n");
    sb.append("    clientPermissions: ").append(toIndentedString(clientPermissions)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expirationEvents: ").append(toIndentedString(expirationEvents)).append("\n");
    sb.append("    isApproved: ").append(toIndentedString(isApproved)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
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
    openapiFields.add("access_date");
    openapiFields.add("access_date_display");
    openapiFields.add("access_info");
    openapiFields.add("account_id");
    openapiFields.add("associated_gw_ids");
    openapiFields.add("auth_method_access_id");
    openapiFields.add("auth_method_additional_data");
    openapiFields.add("auth_method_name");
    openapiFields.add("auth_method_roles_assoc");
    openapiFields.add("client_permissions");
    openapiFields.add("creation_date");
    openapiFields.add("delete_protection");
    openapiFields.add("description");
    openapiFields.add("expiration_events");
    openapiFields.add("is_approved");
    openapiFields.add("modification_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AuthMethod
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuthMethod.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthMethod is not found in the empty JSON string", AuthMethod.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuthMethod.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthMethod` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("access_date_display") != null && !jsonObj.get("access_date_display").isJsonNull()) && !jsonObj.get("access_date_display").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_date_display` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_date_display").toString()));
      }
      // validate the optional field `access_info`
      if (jsonObj.get("access_info") != null && !jsonObj.get("access_info").isJsonNull()) {
        AuthMethodAccessInfo.validateJsonElement(jsonObj.get("access_info"));
      }
      if ((jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonNull()) && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("associated_gw_ids") != null && !jsonObj.get("associated_gw_ids").isJsonNull() && !jsonObj.get("associated_gw_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `associated_gw_ids` to be an array in the JSON string but got `%s`", jsonObj.get("associated_gw_ids").toString()));
      }
      if ((jsonObj.get("auth_method_access_id") != null && !jsonObj.get("auth_method_access_id").isJsonNull()) && !jsonObj.get("auth_method_access_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_method_access_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_method_access_id").toString()));
      }
      // validate the optional field `auth_method_additional_data`
      if (jsonObj.get("auth_method_additional_data") != null && !jsonObj.get("auth_method_additional_data").isJsonNull()) {
        AuthMethodAdditionalData.validateJsonElement(jsonObj.get("auth_method_additional_data"));
      }
      if ((jsonObj.get("auth_method_name") != null && !jsonObj.get("auth_method_name").isJsonNull()) && !jsonObj.get("auth_method_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_method_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_method_name").toString()));
      }
      if (jsonObj.get("auth_method_roles_assoc") != null && !jsonObj.get("auth_method_roles_assoc").isJsonNull()) {
        JsonArray jsonArrayauthMethodRolesAssoc = jsonObj.getAsJsonArray("auth_method_roles_assoc");
        if (jsonArrayauthMethodRolesAssoc != null) {
          // ensure the json data is an array
          if (!jsonObj.get("auth_method_roles_assoc").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `auth_method_roles_assoc` to be an array in the JSON string but got `%s`", jsonObj.get("auth_method_roles_assoc").toString()));
          }

          // validate the optional field `auth_method_roles_assoc` (array)
          for (int i = 0; i < jsonArrayauthMethodRolesAssoc.size(); i++) {
            AuthMethodRoleAssociation.validateJsonElement(jsonArrayauthMethodRolesAssoc.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("client_permissions") != null && !jsonObj.get("client_permissions").isJsonNull() && !jsonObj.get("client_permissions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_permissions` to be an array in the JSON string but got `%s`", jsonObj.get("client_permissions").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("expiration_events") != null && !jsonObj.get("expiration_events").isJsonNull()) {
        JsonArray jsonArrayexpirationEvents = jsonObj.getAsJsonArray("expiration_events");
        if (jsonArrayexpirationEvents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("expiration_events").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `expiration_events` to be an array in the JSON string but got `%s`", jsonObj.get("expiration_events").toString()));
          }

          // validate the optional field `expiration_events` (array)
          for (int i = 0; i < jsonArrayexpirationEvents.size(); i++) {
            AuthExpirationEvent.validateJsonElement(jsonArrayexpirationEvents.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthMethod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthMethod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthMethod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthMethod.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthMethod>() {
           @Override
           public void write(JsonWriter out, AuthMethod value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthMethod read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AuthMethod given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuthMethod
   * @throws IOException if the JSON string is invalid with respect to AuthMethod
   */
  public static AuthMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthMethod.class);
  }

  /**
   * Convert an instance of AuthMethod to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

