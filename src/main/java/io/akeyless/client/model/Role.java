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
import io.akeyless.client.model.RoleAuthMethodAssociation;
import io.akeyless.client.model.Rules;
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
 * Role
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class Role {
  public static final String SERIALIZED_NAME_ACCESS_DATE = "access_date";
  @SerializedName(SERIALIZED_NAME_ACCESS_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime accessDate;

  public static final String SERIALIZED_NAME_ACCESS_DATE_DISPLAY = "access_date_display";
  @SerializedName(SERIALIZED_NAME_ACCESS_DATE_DISPLAY)
  @javax.annotation.Nullable
  private String accessDateDisplay;

  public static final String SERIALIZED_NAME_CLIENT_PERMISSIONS = "client_permissions";
  @SerializedName(SERIALIZED_NAME_CLIENT_PERMISSIONS)
  @javax.annotation.Nullable
  private List<String> clientPermissions = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  @javax.annotation.Nullable
  private String comment;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creation_date";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  @javax.annotation.Nullable
  private Boolean deleteProtection;

  public static final String SERIALIZED_NAME_MODIFICATION_DATE = "modification_date";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime modificationDate;

  public static final String SERIALIZED_NAME_ROLE_AUTH_METHODS_ASSOC = "role_auth_methods_assoc";
  @SerializedName(SERIALIZED_NAME_ROLE_AUTH_METHODS_ASSOC)
  @javax.annotation.Nullable
  private List<RoleAuthMethodAssociation> roleAuthMethodsAssoc = new ArrayList<>();

  public static final String SERIALIZED_NAME_ROLE_NAME = "role_name";
  @SerializedName(SERIALIZED_NAME_ROLE_NAME)
  @javax.annotation.Nullable
  private String roleName;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  @javax.annotation.Nullable
  private Rules rules;

  public Role() {
  }

  public Role accessDate(@javax.annotation.Nullable OffsetDateTime accessDate) {
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


  public Role accessDateDisplay(@javax.annotation.Nullable String accessDateDisplay) {
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


  public Role clientPermissions(@javax.annotation.Nullable List<String> clientPermissions) {
    this.clientPermissions = clientPermissions;
    return this;
  }

  public Role addClientPermissionsItem(String clientPermissionsItem) {
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


  public Role comment(@javax.annotation.Nullable String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(@javax.annotation.Nullable String comment) {
    this.comment = comment;
  }


  public Role creationDate(@javax.annotation.Nullable OffsetDateTime creationDate) {
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


  public Role deleteProtection(@javax.annotation.Nullable Boolean deleteProtection) {
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


  public Role modificationDate(@javax.annotation.Nullable OffsetDateTime modificationDate) {
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


  public Role roleAuthMethodsAssoc(@javax.annotation.Nullable List<RoleAuthMethodAssociation> roleAuthMethodsAssoc) {
    this.roleAuthMethodsAssoc = roleAuthMethodsAssoc;
    return this;
  }

  public Role addRoleAuthMethodsAssocItem(RoleAuthMethodAssociation roleAuthMethodsAssocItem) {
    if (this.roleAuthMethodsAssoc == null) {
      this.roleAuthMethodsAssoc = new ArrayList<>();
    }
    this.roleAuthMethodsAssoc.add(roleAuthMethodsAssocItem);
    return this;
  }

  /**
   * Get roleAuthMethodsAssoc
   * @return roleAuthMethodsAssoc
   */
  @javax.annotation.Nullable
  public List<RoleAuthMethodAssociation> getRoleAuthMethodsAssoc() {
    return roleAuthMethodsAssoc;
  }

  public void setRoleAuthMethodsAssoc(@javax.annotation.Nullable List<RoleAuthMethodAssociation> roleAuthMethodsAssoc) {
    this.roleAuthMethodsAssoc = roleAuthMethodsAssoc;
  }


  public Role roleName(@javax.annotation.Nullable String roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * Get roleName
   * @return roleName
   */
  @javax.annotation.Nullable
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(@javax.annotation.Nullable String roleName) {
    this.roleName = roleName;
  }


  public Role rules(@javax.annotation.Nullable Rules rules) {
    this.rules = rules;
    return this;
  }

  /**
   * Get rules
   * @return rules
   */
  @javax.annotation.Nullable
  public Rules getRules() {
    return rules;
  }

  public void setRules(@javax.annotation.Nullable Rules rules) {
    this.rules = rules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.accessDate, role.accessDate) &&
        Objects.equals(this.accessDateDisplay, role.accessDateDisplay) &&
        Objects.equals(this.clientPermissions, role.clientPermissions) &&
        Objects.equals(this.comment, role.comment) &&
        Objects.equals(this.creationDate, role.creationDate) &&
        Objects.equals(this.deleteProtection, role.deleteProtection) &&
        Objects.equals(this.modificationDate, role.modificationDate) &&
        Objects.equals(this.roleAuthMethodsAssoc, role.roleAuthMethodsAssoc) &&
        Objects.equals(this.roleName, role.roleName) &&
        Objects.equals(this.rules, role.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessDate, accessDateDisplay, clientPermissions, comment, creationDate, deleteProtection, modificationDate, roleAuthMethodsAssoc, roleName, rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    sb.append("    accessDate: ").append(toIndentedString(accessDate)).append("\n");
    sb.append("    accessDateDisplay: ").append(toIndentedString(accessDateDisplay)).append("\n");
    sb.append("    clientPermissions: ").append(toIndentedString(clientPermissions)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    roleAuthMethodsAssoc: ").append(toIndentedString(roleAuthMethodsAssoc)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
    openapiFields.add("client_permissions");
    openapiFields.add("comment");
    openapiFields.add("creation_date");
    openapiFields.add("delete_protection");
    openapiFields.add("modification_date");
    openapiFields.add("role_auth_methods_assoc");
    openapiFields.add("role_name");
    openapiFields.add("rules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Role
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Role.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Role is not found in the empty JSON string", Role.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Role.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Role` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("access_date_display") != null && !jsonObj.get("access_date_display").isJsonNull()) && !jsonObj.get("access_date_display").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_date_display` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_date_display").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("client_permissions") != null && !jsonObj.get("client_permissions").isJsonNull() && !jsonObj.get("client_permissions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_permissions` to be an array in the JSON string but got `%s`", jsonObj.get("client_permissions").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if (jsonObj.get("role_auth_methods_assoc") != null && !jsonObj.get("role_auth_methods_assoc").isJsonNull()) {
        JsonArray jsonArrayroleAuthMethodsAssoc = jsonObj.getAsJsonArray("role_auth_methods_assoc");
        if (jsonArrayroleAuthMethodsAssoc != null) {
          // ensure the json data is an array
          if (!jsonObj.get("role_auth_methods_assoc").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `role_auth_methods_assoc` to be an array in the JSON string but got `%s`", jsonObj.get("role_auth_methods_assoc").toString()));
          }

          // validate the optional field `role_auth_methods_assoc` (array)
          for (int i = 0; i < jsonArrayroleAuthMethodsAssoc.size(); i++) {
            RoleAuthMethodAssociation.validateJsonElement(jsonArrayroleAuthMethodsAssoc.get(i));
          };
        }
      }
      if ((jsonObj.get("role_name") != null && !jsonObj.get("role_name").isJsonNull()) && !jsonObj.get("role_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role_name").toString()));
      }
      // validate the optional field `rules`
      if (jsonObj.get("rules") != null && !jsonObj.get("rules").isJsonNull()) {
        Rules.validateJsonElement(jsonObj.get("rules"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Role.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Role' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Role> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Role.class));

       return (TypeAdapter<T>) new TypeAdapter<Role>() {
           @Override
           public void write(JsonWriter out, Role value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Role read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Role given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Role
   * @throws IOException if the JSON string is invalid with respect to Role
   */
  public static Role fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Role.class);
  }

  /**
   * Convert an instance of Role to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

