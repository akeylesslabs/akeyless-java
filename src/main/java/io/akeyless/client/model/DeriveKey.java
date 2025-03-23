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
 * DeriveKey
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class DeriveKey {
  public static final String SERIALIZED_NAME_ACCESSIBILITY = "accessibility";
  @SerializedName(SERIALIZED_NAME_ACCESSIBILITY)
  @javax.annotation.Nullable
  private String accessibility = "regular";

  public static final String SERIALIZED_NAME_ALG = "alg";
  @SerializedName(SERIALIZED_NAME_ALG)
  @javax.annotation.Nonnull
  private String alg = "pbkdf2";

  public static final String SERIALIZED_NAME_HASH_FUNCTION = "hash-function";
  @SerializedName(SERIALIZED_NAME_HASH_FUNCTION)
  @javax.annotation.Nullable
  private String hashFunction = "sha256";

  public static final String SERIALIZED_NAME_ITER = "iter";
  @SerializedName(SERIALIZED_NAME_ITER)
  @javax.annotation.Nonnull
  private Long iter;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_KEY_LEN = "key-len";
  @SerializedName(SERIALIZED_NAME_KEY_LEN)
  @javax.annotation.Nonnull
  private Long keyLen;

  public static final String SERIALIZED_NAME_MEM = "mem";
  @SerializedName(SERIALIZED_NAME_MEM)
  @javax.annotation.Nullable
  private Long mem = 16384l;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_PARALLELISM = "parallelism";
  @SerializedName(SERIALIZED_NAME_PARALLELISM)
  @javax.annotation.Nullable
  private Long parallelism = 1l;

  public static final String SERIALIZED_NAME_SALT = "salt";
  @SerializedName(SERIALIZED_NAME_SALT)
  @javax.annotation.Nullable
  private String salt;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public DeriveKey() {
  }

  public DeriveKey accessibility(@javax.annotation.Nullable String accessibility) {
    this.accessibility = accessibility;
    return this;
  }

  /**
   * for personal password manager
   * @return accessibility
   */
  @javax.annotation.Nullable
  public String getAccessibility() {
    return accessibility;
  }

  public void setAccessibility(@javax.annotation.Nullable String accessibility) {
    this.accessibility = accessibility;
  }


  public DeriveKey alg(@javax.annotation.Nonnull String alg) {
    this.alg = alg;
    return this;
  }

  /**
   * Kdf algorithm
   * @return alg
   */
  @javax.annotation.Nonnull
  public String getAlg() {
    return alg;
  }

  public void setAlg(@javax.annotation.Nonnull String alg) {
    this.alg = alg;
  }


  public DeriveKey hashFunction(@javax.annotation.Nullable String hashFunction) {
    this.hashFunction = hashFunction;
    return this;
  }

  /**
   * HashFunction the hash function to use (relevant for pbkdf2)
   * @return hashFunction
   */
  @javax.annotation.Nullable
  public String getHashFunction() {
    return hashFunction;
  }

  public void setHashFunction(@javax.annotation.Nullable String hashFunction) {
    this.hashFunction = hashFunction;
  }


  public DeriveKey iter(@javax.annotation.Nonnull Long iter) {
    this.iter = iter;
    return this;
  }

  /**
   * IterationCount the number of iterations
   * @return iter
   */
  @javax.annotation.Nonnull
  public Long getIter() {
    return iter;
  }

  public void setIter(@javax.annotation.Nonnull Long iter) {
    this.iter = iter;
  }


  public DeriveKey json(@javax.annotation.Nullable Boolean json) {
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


  public DeriveKey keyLen(@javax.annotation.Nonnull Long keyLen) {
    this.keyLen = keyLen;
    return this;
  }

  /**
   * KeyLength the byte length of the generated key
   * @return keyLen
   */
  @javax.annotation.Nonnull
  public Long getKeyLen() {
    return keyLen;
  }

  public void setKeyLen(@javax.annotation.Nonnull Long keyLen) {
    this.keyLen = keyLen;
  }


  public DeriveKey mem(@javax.annotation.Nullable Long mem) {
    this.mem = mem;
    return this;
  }

  /**
   * MemorySizeInKb the memory paramter in kb (relevant for argon2id)
   * @return mem
   */
  @javax.annotation.Nullable
  public Long getMem() {
    return mem;
  }

  public void setMem(@javax.annotation.Nullable Long mem) {
    this.mem = mem;
  }


  public DeriveKey name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Static Secret full name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public DeriveKey parallelism(@javax.annotation.Nullable Long parallelism) {
    this.parallelism = parallelism;
    return this;
  }

  /**
   * Parallelism the number of threads to use (relevant for argon2id)
   * @return parallelism
   */
  @javax.annotation.Nullable
  public Long getParallelism() {
    return parallelism;
  }

  public void setParallelism(@javax.annotation.Nullable Long parallelism) {
    this.parallelism = parallelism;
  }


  public DeriveKey salt(@javax.annotation.Nullable String salt) {
    this.salt = salt;
    return this;
  }

  /**
   * Salt Base64 encoded salt value. If not provided, the salt will be generated as part of the operation. The salt should be securely-generated random bytes, minimum 64 bits, 128 bits is recommended
   * @return salt
   */
  @javax.annotation.Nullable
  public String getSalt() {
    return salt;
  }

  public void setSalt(@javax.annotation.Nullable String salt) {
    this.salt = salt;
  }


  public DeriveKey token(@javax.annotation.Nullable String token) {
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


  public DeriveKey uidToken(@javax.annotation.Nullable String uidToken) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeriveKey deriveKey = (DeriveKey) o;
    return Objects.equals(this.accessibility, deriveKey.accessibility) &&
        Objects.equals(this.alg, deriveKey.alg) &&
        Objects.equals(this.hashFunction, deriveKey.hashFunction) &&
        Objects.equals(this.iter, deriveKey.iter) &&
        Objects.equals(this.json, deriveKey.json) &&
        Objects.equals(this.keyLen, deriveKey.keyLen) &&
        Objects.equals(this.mem, deriveKey.mem) &&
        Objects.equals(this.name, deriveKey.name) &&
        Objects.equals(this.parallelism, deriveKey.parallelism) &&
        Objects.equals(this.salt, deriveKey.salt) &&
        Objects.equals(this.token, deriveKey.token) &&
        Objects.equals(this.uidToken, deriveKey.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessibility, alg, hashFunction, iter, json, keyLen, mem, name, parallelism, salt, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeriveKey {\n");
    sb.append("    accessibility: ").append(toIndentedString(accessibility)).append("\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    hashFunction: ").append(toIndentedString(hashFunction)).append("\n");
    sb.append("    iter: ").append(toIndentedString(iter)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keyLen: ").append(toIndentedString(keyLen)).append("\n");
    sb.append("    mem: ").append(toIndentedString(mem)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
    sb.append("    salt: ").append(toIndentedString(salt)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
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
    openapiFields.add("accessibility");
    openapiFields.add("alg");
    openapiFields.add("hash-function");
    openapiFields.add("iter");
    openapiFields.add("json");
    openapiFields.add("key-len");
    openapiFields.add("mem");
    openapiFields.add("name");
    openapiFields.add("parallelism");
    openapiFields.add("salt");
    openapiFields.add("token");
    openapiFields.add("uid-token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("alg");
    openapiRequiredFields.add("iter");
    openapiRequiredFields.add("key-len");
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DeriveKey
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeriveKey.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeriveKey is not found in the empty JSON string", DeriveKey.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeriveKey.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeriveKey` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeriveKey.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("accessibility") != null && !jsonObj.get("accessibility").isJsonNull()) && !jsonObj.get("accessibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accessibility").toString()));
      }
      if (!jsonObj.get("alg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alg").toString()));
      }
      if ((jsonObj.get("hash-function") != null && !jsonObj.get("hash-function").isJsonNull()) && !jsonObj.get("hash-function").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hash-function` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hash-function").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("salt") != null && !jsonObj.get("salt").isJsonNull()) && !jsonObj.get("salt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salt").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeriveKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeriveKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeriveKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeriveKey.class));

       return (TypeAdapter<T>) new TypeAdapter<DeriveKey>() {
           @Override
           public void write(JsonWriter out, DeriveKey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeriveKey read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DeriveKey given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeriveKey
   * @throws IOException if the JSON string is invalid with respect to DeriveKey
   */
  public static DeriveKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeriveKey.class);
  }

  /**
   * Convert an instance of DeriveKey to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

