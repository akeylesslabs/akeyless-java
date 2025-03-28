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
import java.io.IOException;
import java.util.Arrays;

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
 * UpdateGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class UpdateGroup {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_GROUP_ALIAS = "group-alias";
  @SerializedName(SERIALIZED_NAME_GROUP_ALIAS)
  @javax.annotation.Nonnull
  private String groupAlias;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  @javax.annotation.Nullable
  private String newName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public static final String SERIALIZED_NAME_USER_ASSIGNMENT = "user-assignment";
  @SerializedName(SERIALIZED_NAME_USER_ASSIGNMENT)
  @javax.annotation.Nullable
  private String userAssignment;

  public UpdateGroup() {
  }

  public UpdateGroup description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the object
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public UpdateGroup groupAlias(@javax.annotation.Nonnull String groupAlias) {
    this.groupAlias = groupAlias;
    return this;
  }

  /**
   * A short group alias
   * @return groupAlias
   */
  @javax.annotation.Nonnull
  public String getGroupAlias() {
    return groupAlias;
  }

  public void setGroupAlias(@javax.annotation.Nonnull String groupAlias) {
    this.groupAlias = groupAlias;
  }


  public UpdateGroup json(@javax.annotation.Nullable Boolean json) {
    this.json = json;
    return this;
  }

  /**
   * Set output format to JSON
   * @return json
   */
  @javax.annotation.Nullable
  public Boolean getJson() {
    return json;
  }

  public void setJson(@javax.annotation.Nullable Boolean json) {
    this.json = json;
  }


  public UpdateGroup name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Group name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public UpdateGroup newName(@javax.annotation.Nullable String newName) {
    this.newName = newName;
    return this;
  }

  /**
   * Group new name
   * @return newName
   */
  @javax.annotation.Nullable
  public String getNewName() {
    return newName;
  }

  public void setNewName(@javax.annotation.Nullable String newName) {
    this.newName = newName;
  }


  public UpdateGroup token(@javax.annotation.Nullable String token) {
    this.token = token;
    return this;
  }

  /**
   * Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;)
   * @return token
   */
  @javax.annotation.Nullable
  public String getToken() {
    return token;
  }

  public void setToken(@javax.annotation.Nullable String token) {
    this.token = token;
  }


  public UpdateGroup uidToken(@javax.annotation.Nullable String uidToken) {
    this.uidToken = uidToken;
    return this;
  }

  /**
   * The universal identity token, Required only for universal_identity authentication
   * @return uidToken
   */
  @javax.annotation.Nullable
  public String getUidToken() {
    return uidToken;
  }

  public void setUidToken(@javax.annotation.Nullable String uidToken) {
    this.uidToken = uidToken;
  }


  public UpdateGroup userAssignment(@javax.annotation.Nullable String userAssignment) {
    this.userAssignment = userAssignment;
    return this;
  }

  /**
   * A json string defining the access permission assignment for this client
   * @return userAssignment
   */
  @javax.annotation.Nullable
  public String getUserAssignment() {
    return userAssignment;
  }

  public void setUserAssignment(@javax.annotation.Nullable String userAssignment) {
    this.userAssignment = userAssignment;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGroup updateGroup = (UpdateGroup) o;
    return Objects.equals(this.description, updateGroup.description) &&
        Objects.equals(this.groupAlias, updateGroup.groupAlias) &&
        Objects.equals(this.json, updateGroup.json) &&
        Objects.equals(this.name, updateGroup.name) &&
        Objects.equals(this.newName, updateGroup.newName) &&
        Objects.equals(this.token, updateGroup.token) &&
        Objects.equals(this.uidToken, updateGroup.uidToken) &&
        Objects.equals(this.userAssignment, updateGroup.userAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, groupAlias, json, name, newName, token, uidToken, userAssignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGroup {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groupAlias: ").append(toIndentedString(groupAlias)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    userAssignment: ").append(toIndentedString(userAssignment)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("group-alias");
    openapiFields.add("json");
    openapiFields.add("name");
    openapiFields.add("new-name");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("user-assignment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("group-alias");
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateGroup
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateGroup is not found in the empty JSON string", UpdateGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateGroup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateGroup.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("group-alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group-alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group-alias").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("new-name") != null && !jsonObj.get("new-name").isJsonNull()) && !jsonObj.get("new-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new-name").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
      if ((jsonObj.get("user-assignment") != null && !jsonObj.get("user-assignment").isJsonNull()) && !jsonObj.get("user-assignment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user-assignment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user-assignment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateGroup>() {
           @Override
           public void write(JsonWriter out, UpdateGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateGroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateGroup given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateGroup
   * @throws IOException if the JSON string is invalid with respect to UpdateGroup
   */
  public static UpdateGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateGroup.class);
  }

  /**
   * Convert an instance of UpdateGroup to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

