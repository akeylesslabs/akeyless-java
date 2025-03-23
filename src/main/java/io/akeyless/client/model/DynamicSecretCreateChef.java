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
 * dynamicSecretCreateChef is a command that creates chef dynamic secret
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class DynamicSecretCreateChef {
  public static final String SERIALIZED_NAME_CHEF_ORGS = "chef-orgs";
  @SerializedName(SERIALIZED_NAME_CHEF_ORGS)
  @javax.annotation.Nullable
  private String chefOrgs;

  public static final String SERIALIZED_NAME_CHEF_SERVER_KEY = "chef-server-key";
  @SerializedName(SERIALIZED_NAME_CHEF_SERVER_KEY)
  @javax.annotation.Nullable
  private String chefServerKey;

  public static final String SERIALIZED_NAME_CHEF_SERVER_URL = "chef-server-url";
  @SerializedName(SERIALIZED_NAME_CHEF_SERVER_URL)
  @javax.annotation.Nullable
  private String chefServerUrl;

  public static final String SERIALIZED_NAME_CHEF_SERVER_USERNAME = "chef-server-username";
  @SerializedName(SERIALIZED_NAME_CHEF_SERVER_USERNAME)
  @javax.annotation.Nullable
  private String chefServerUsername;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  @javax.annotation.Nullable
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD_LENGTH = "password-length";
  @SerializedName(SERIALIZED_NAME_PASSWORD_LENGTH)
  @javax.annotation.Nullable
  private String passwordLength;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  @javax.annotation.Nullable
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_SKIP_SSL = "skip-ssl";
  @SerializedName(SERIALIZED_NAME_SKIP_SSL)
  @javax.annotation.Nullable
  private Boolean skipSsl = true;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @javax.annotation.Nullable
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TARGET_NAME = "target-name";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  @javax.annotation.Nullable
  private String targetName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public static final String SERIALIZED_NAME_USER_TTL = "user-ttl";
  @SerializedName(SERIALIZED_NAME_USER_TTL)
  @javax.annotation.Nullable
  private String userTtl = "60m";

  public DynamicSecretCreateChef() {
  }

  public DynamicSecretCreateChef chefOrgs(@javax.annotation.Nullable String chefOrgs) {
    this.chefOrgs = chefOrgs;
    return this;
  }

  /**
   * Organizations
   * @return chefOrgs
   */
  @javax.annotation.Nullable
  public String getChefOrgs() {
    return chefOrgs;
  }

  public void setChefOrgs(@javax.annotation.Nullable String chefOrgs) {
    this.chefOrgs = chefOrgs;
  }


  public DynamicSecretCreateChef chefServerKey(@javax.annotation.Nullable String chefServerKey) {
    this.chefServerKey = chefServerKey;
    return this;
  }

  /**
   * Server key
   * @return chefServerKey
   */
  @javax.annotation.Nullable
  public String getChefServerKey() {
    return chefServerKey;
  }

  public void setChefServerKey(@javax.annotation.Nullable String chefServerKey) {
    this.chefServerKey = chefServerKey;
  }


  public DynamicSecretCreateChef chefServerUrl(@javax.annotation.Nullable String chefServerUrl) {
    this.chefServerUrl = chefServerUrl;
    return this;
  }

  /**
   * Server URL
   * @return chefServerUrl
   */
  @javax.annotation.Nullable
  public String getChefServerUrl() {
    return chefServerUrl;
  }

  public void setChefServerUrl(@javax.annotation.Nullable String chefServerUrl) {
    this.chefServerUrl = chefServerUrl;
  }


  public DynamicSecretCreateChef chefServerUsername(@javax.annotation.Nullable String chefServerUsername) {
    this.chefServerUsername = chefServerUsername;
    return this;
  }

  /**
   * Server username
   * @return chefServerUsername
   */
  @javax.annotation.Nullable
  public String getChefServerUsername() {
    return chefServerUsername;
  }

  public void setChefServerUsername(@javax.annotation.Nullable String chefServerUsername) {
    this.chefServerUsername = chefServerUsername;
  }


  public DynamicSecretCreateChef deleteProtection(@javax.annotation.Nullable String deleteProtection) {
    this.deleteProtection = deleteProtection;
    return this;
  }

  /**
   * Protection from accidental deletion of this object [true/false]
   * @return deleteProtection
   */
  @javax.annotation.Nullable
  public String getDeleteProtection() {
    return deleteProtection;
  }

  public void setDeleteProtection(@javax.annotation.Nullable String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public DynamicSecretCreateChef description(@javax.annotation.Nullable String description) {
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


  public DynamicSecretCreateChef json(@javax.annotation.Nullable Boolean json) {
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


  public DynamicSecretCreateChef name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Dynamic secret name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public DynamicSecretCreateChef passwordLength(@javax.annotation.Nullable String passwordLength) {
    this.passwordLength = passwordLength;
    return this;
  }

  /**
   * The length of the password to be generated
   * @return passwordLength
   */
  @javax.annotation.Nullable
  public String getPasswordLength() {
    return passwordLength;
  }

  public void setPasswordLength(@javax.annotation.Nullable String passwordLength) {
    this.passwordLength = passwordLength;
  }


  public DynamicSecretCreateChef producerEncryptionKeyName(@javax.annotation.Nullable String producerEncryptionKeyName) {
    this.producerEncryptionKeyName = producerEncryptionKeyName;
    return this;
  }

  /**
   * Dynamic producer encryption key
   * @return producerEncryptionKeyName
   */
  @javax.annotation.Nullable
  public String getProducerEncryptionKeyName() {
    return producerEncryptionKeyName;
  }

  public void setProducerEncryptionKeyName(@javax.annotation.Nullable String producerEncryptionKeyName) {
    this.producerEncryptionKeyName = producerEncryptionKeyName;
  }


  public DynamicSecretCreateChef skipSsl(@javax.annotation.Nullable Boolean skipSsl) {
    this.skipSsl = skipSsl;
    return this;
  }

  /**
   * Skip SSL
   * @return skipSsl
   */
  @javax.annotation.Nullable
  public Boolean getSkipSsl() {
    return skipSsl;
  }

  public void setSkipSsl(@javax.annotation.Nullable Boolean skipSsl) {
    this.skipSsl = skipSsl;
  }


  public DynamicSecretCreateChef tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
    return this;
  }

  public DynamicSecretCreateChef addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Add tags attached to this object
   * @return tags
   */
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
  }


  public DynamicSecretCreateChef targetName(@javax.annotation.Nullable String targetName) {
    this.targetName = targetName;
    return this;
  }

  /**
   * Target name
   * @return targetName
   */
  @javax.annotation.Nullable
  public String getTargetName() {
    return targetName;
  }

  public void setTargetName(@javax.annotation.Nullable String targetName) {
    this.targetName = targetName;
  }


  public DynamicSecretCreateChef token(@javax.annotation.Nullable String token) {
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


  public DynamicSecretCreateChef uidToken(@javax.annotation.Nullable String uidToken) {
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


  public DynamicSecretCreateChef userTtl(@javax.annotation.Nullable String userTtl) {
    this.userTtl = userTtl;
    return this;
  }

  /**
   * User TTL
   * @return userTtl
   */
  @javax.annotation.Nullable
  public String getUserTtl() {
    return userTtl;
  }

  public void setUserTtl(@javax.annotation.Nullable String userTtl) {
    this.userTtl = userTtl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicSecretCreateChef dynamicSecretCreateChef = (DynamicSecretCreateChef) o;
    return Objects.equals(this.chefOrgs, dynamicSecretCreateChef.chefOrgs) &&
        Objects.equals(this.chefServerKey, dynamicSecretCreateChef.chefServerKey) &&
        Objects.equals(this.chefServerUrl, dynamicSecretCreateChef.chefServerUrl) &&
        Objects.equals(this.chefServerUsername, dynamicSecretCreateChef.chefServerUsername) &&
        Objects.equals(this.deleteProtection, dynamicSecretCreateChef.deleteProtection) &&
        Objects.equals(this.description, dynamicSecretCreateChef.description) &&
        Objects.equals(this.json, dynamicSecretCreateChef.json) &&
        Objects.equals(this.name, dynamicSecretCreateChef.name) &&
        Objects.equals(this.passwordLength, dynamicSecretCreateChef.passwordLength) &&
        Objects.equals(this.producerEncryptionKeyName, dynamicSecretCreateChef.producerEncryptionKeyName) &&
        Objects.equals(this.skipSsl, dynamicSecretCreateChef.skipSsl) &&
        Objects.equals(this.tags, dynamicSecretCreateChef.tags) &&
        Objects.equals(this.targetName, dynamicSecretCreateChef.targetName) &&
        Objects.equals(this.token, dynamicSecretCreateChef.token) &&
        Objects.equals(this.uidToken, dynamicSecretCreateChef.uidToken) &&
        Objects.equals(this.userTtl, dynamicSecretCreateChef.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chefOrgs, chefServerKey, chefServerUrl, chefServerUsername, deleteProtection, description, json, name, passwordLength, producerEncryptionKeyName, skipSsl, tags, targetName, token, uidToken, userTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicSecretCreateChef {\n");
    sb.append("    chefOrgs: ").append(toIndentedString(chefOrgs)).append("\n");
    sb.append("    chefServerKey: ").append(toIndentedString(chefServerKey)).append("\n");
    sb.append("    chefServerUrl: ").append(toIndentedString(chefServerUrl)).append("\n");
    sb.append("    chefServerUsername: ").append(toIndentedString(chefServerUsername)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    passwordLength: ").append(toIndentedString(passwordLength)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    skipSsl: ").append(toIndentedString(skipSsl)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    userTtl: ").append(toIndentedString(userTtl)).append("\n");
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
    openapiFields.add("chef-orgs");
    openapiFields.add("chef-server-key");
    openapiFields.add("chef-server-url");
    openapiFields.add("chef-server-username");
    openapiFields.add("delete_protection");
    openapiFields.add("description");
    openapiFields.add("json");
    openapiFields.add("name");
    openapiFields.add("password-length");
    openapiFields.add("producer-encryption-key-name");
    openapiFields.add("skip-ssl");
    openapiFields.add("tags");
    openapiFields.add("target-name");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("user-ttl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DynamicSecretCreateChef
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DynamicSecretCreateChef.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DynamicSecretCreateChef is not found in the empty JSON string", DynamicSecretCreateChef.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DynamicSecretCreateChef.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DynamicSecretCreateChef` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DynamicSecretCreateChef.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("chef-orgs") != null && !jsonObj.get("chef-orgs").isJsonNull()) && !jsonObj.get("chef-orgs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chef-orgs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chef-orgs").toString()));
      }
      if ((jsonObj.get("chef-server-key") != null && !jsonObj.get("chef-server-key").isJsonNull()) && !jsonObj.get("chef-server-key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chef-server-key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chef-server-key").toString()));
      }
      if ((jsonObj.get("chef-server-url") != null && !jsonObj.get("chef-server-url").isJsonNull()) && !jsonObj.get("chef-server-url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chef-server-url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chef-server-url").toString()));
      }
      if ((jsonObj.get("chef-server-username") != null && !jsonObj.get("chef-server-username").isJsonNull()) && !jsonObj.get("chef-server-username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chef-server-username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chef-server-username").toString()));
      }
      if ((jsonObj.get("delete_protection") != null && !jsonObj.get("delete_protection").isJsonNull()) && !jsonObj.get("delete_protection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delete_protection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delete_protection").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("password-length") != null && !jsonObj.get("password-length").isJsonNull()) && !jsonObj.get("password-length").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password-length` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password-length").toString()));
      }
      if ((jsonObj.get("producer-encryption-key-name") != null && !jsonObj.get("producer-encryption-key-name").isJsonNull()) && !jsonObj.get("producer-encryption-key-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `producer-encryption-key-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("producer-encryption-key-name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("target-name") != null && !jsonObj.get("target-name").isJsonNull()) && !jsonObj.get("target-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target-name").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
      if ((jsonObj.get("user-ttl") != null && !jsonObj.get("user-ttl").isJsonNull()) && !jsonObj.get("user-ttl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user-ttl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user-ttl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DynamicSecretCreateChef.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DynamicSecretCreateChef' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DynamicSecretCreateChef> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DynamicSecretCreateChef.class));

       return (TypeAdapter<T>) new TypeAdapter<DynamicSecretCreateChef>() {
           @Override
           public void write(JsonWriter out, DynamicSecretCreateChef value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DynamicSecretCreateChef read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DynamicSecretCreateChef given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DynamicSecretCreateChef
   * @throws IOException if the JSON string is invalid with respect to DynamicSecretCreateChef
   */
  public static DynamicSecretCreateChef fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DynamicSecretCreateChef.class);
  }

  /**
   * Convert an instance of DynamicSecretCreateChef to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

