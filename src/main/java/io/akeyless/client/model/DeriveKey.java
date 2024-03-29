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
 * DeriveKey
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeriveKey {
  public static final String SERIALIZED_NAME_ACCESSIBILITY = "accessibility";
  @SerializedName(SERIALIZED_NAME_ACCESSIBILITY)
  private String accessibility = "regular";

  public static final String SERIALIZED_NAME_ALG = "alg";
  @SerializedName(SERIALIZED_NAME_ALG)
  private String alg = "pbkdf2";

  public static final String SERIALIZED_NAME_HASH_FUNCTION = "hash-function";
  @SerializedName(SERIALIZED_NAME_HASH_FUNCTION)
  private String hashFunction = "sha256";

  public static final String SERIALIZED_NAME_ITER = "iter";
  @SerializedName(SERIALIZED_NAME_ITER)
  private Long iter;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_KEY_LEN = "key-len";
  @SerializedName(SERIALIZED_NAME_KEY_LEN)
  private Long keyLen;

  public static final String SERIALIZED_NAME_MEM = "mem";
  @SerializedName(SERIALIZED_NAME_MEM)
  private Long mem = 16384l;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARALLELISM = "parallelism";
  @SerializedName(SERIALIZED_NAME_PARALLELISM)
  private Long parallelism = 1l;

  public static final String SERIALIZED_NAME_SALT = "salt";
  @SerializedName(SERIALIZED_NAME_SALT)
  private String salt;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public DeriveKey() { 
  }

  public DeriveKey accessibility(String accessibility) {
    
    this.accessibility = accessibility;
    return this;
  }

   /**
   * for personal password manager
   * @return accessibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "for personal password manager")

  public String getAccessibility() {
    return accessibility;
  }


  public void setAccessibility(String accessibility) {
    this.accessibility = accessibility;
  }


  public DeriveKey alg(String alg) {
    
    this.alg = alg;
    return this;
  }

   /**
   * Kdf algorithm
   * @return alg
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Kdf algorithm")

  public String getAlg() {
    return alg;
  }


  public void setAlg(String alg) {
    this.alg = alg;
  }


  public DeriveKey hashFunction(String hashFunction) {
    
    this.hashFunction = hashFunction;
    return this;
  }

   /**
   * HashFunction the hash function to use (relevant for pbkdf2)
   * @return hashFunction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HashFunction the hash function to use (relevant for pbkdf2)")

  public String getHashFunction() {
    return hashFunction;
  }


  public void setHashFunction(String hashFunction) {
    this.hashFunction = hashFunction;
  }


  public DeriveKey iter(Long iter) {
    
    this.iter = iter;
    return this;
  }

   /**
   * IterationCount the number of iterations
   * @return iter
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "IterationCount the number of iterations")

  public Long getIter() {
    return iter;
  }


  public void setIter(Long iter) {
    this.iter = iter;
  }


  public DeriveKey json(Boolean json) {
    
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


  public DeriveKey keyLen(Long keyLen) {
    
    this.keyLen = keyLen;
    return this;
  }

   /**
   * KeyLength the byte length of the generated key
   * @return keyLen
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "KeyLength the byte length of the generated key")

  public Long getKeyLen() {
    return keyLen;
  }


  public void setKeyLen(Long keyLen) {
    this.keyLen = keyLen;
  }


  public DeriveKey mem(Long mem) {
    
    this.mem = mem;
    return this;
  }

   /**
   * MemorySizeInKb the memory paramter in kb (relevant for argon2id)
   * @return mem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MemorySizeInKb the memory paramter in kb (relevant for argon2id)")

  public Long getMem() {
    return mem;
  }


  public void setMem(Long mem) {
    this.mem = mem;
  }


  public DeriveKey name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Static Secret full name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Static Secret full name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DeriveKey parallelism(Long parallelism) {
    
    this.parallelism = parallelism;
    return this;
  }

   /**
   * Parallelism the number of threads to use (relevant for argon2id)
   * @return parallelism
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parallelism the number of threads to use (relevant for argon2id)")

  public Long getParallelism() {
    return parallelism;
  }


  public void setParallelism(Long parallelism) {
    this.parallelism = parallelism;
  }


  public DeriveKey salt(String salt) {
    
    this.salt = salt;
    return this;
  }

   /**
   * Salt Base64 encoded salt value. If not provided, the salt will be generated as part of the operation. The salt should be securely-generated random bytes, minimum 64 bits, 128 bits is recommended
   * @return salt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Salt Base64 encoded salt value. If not provided, the salt will be generated as part of the operation. The salt should be securely-generated random bytes, minimum 64 bits, 128 bits is recommended")

  public String getSalt() {
    return salt;
  }


  public void setSalt(String salt) {
    this.salt = salt;
  }


  public DeriveKey token(String token) {
    
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


  public DeriveKey uidToken(String uidToken) {
    
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

}

