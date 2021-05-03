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
import java.util.ArrayList;
import java.util.List;

/**
 * UploadRSA
 */

public class UploadRSA {
  public static final String SERIALIZED_NAME_ALG = "alg";
  @SerializedName(SERIALIZED_NAME_ALG)
  private String alg;

  public static final String SERIALIZED_NAME_CERT = "cert";
  @SerializedName(SERIALIZED_NAME_CERT)
  private String cert;

  public static final String SERIALIZED_NAME_CERT_FILE_DATA = "cert-file-data";
  @SerializedName(SERIALIZED_NAME_CERT_FILE_DATA)
  private String certFileData;

  public static final String SERIALIZED_NAME_CUSTOMER_FRG_ID = "customer-frg-id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_FRG_ID)
  private String customerFrgId;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RSA_FILE_DATA = "rsa-file-data";
  @SerializedName(SERIALIZED_NAME_RSA_FILE_DATA)
  private String rsaFileData;

  public static final String SERIALIZED_NAME_RSA_KEY_FILE_PATH = "rsa-key-file-path";
  @SerializedName(SERIALIZED_NAME_RSA_KEY_FILE_PATH)
  private String rsaKeyFilePath;

  public static final String SERIALIZED_NAME_SPLIT_LEVEL = "split-level";
  @SerializedName(SERIALIZED_NAME_SPLIT_LEVEL)
  private Long splitLevel = 2l;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private List<String> tag = null;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public UploadRSA alg(String alg) {
    
    this.alg = alg;
    return this;
  }

   /**
   * Key type. options: [RSA1024, RSA2048, RSA3072, RSA4096]
   * @return alg
  **/
  @ApiModelProperty(required = true, value = "Key type. options: [RSA1024, RSA2048, RSA3072, RSA4096]")

  public String getAlg() {
    return alg;
  }


  public void setAlg(String alg) {
    this.alg = alg;
  }


  public UploadRSA cert(String cert) {
    
    this.cert = cert;
    return this;
  }

   /**
   * Path to a file that contain the certificate in a PEM format.
   * @return cert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path to a file that contain the certificate in a PEM format.")

  public String getCert() {
    return cert;
  }


  public void setCert(String cert) {
    this.cert = cert;
  }


  public UploadRSA certFileData(String certFileData) {
    
    this.certFileData = certFileData;
    return this;
  }

   /**
   * Certificate in a PEM format.
   * @return certFileData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Certificate in a PEM format.")

  public String getCertFileData() {
    return certFileData;
  }


  public void setCertFileData(String certFileData) {
    this.certFileData = certFileData;
  }


  public UploadRSA customerFrgId(String customerFrgId) {
    
    this.customerFrgId = customerFrgId;
    return this;
  }

   /**
   * The customer fragment ID that will be used to split the key (if empty, the key will be created independently of a customer fragment)
   * @return customerFrgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The customer fragment ID that will be used to split the key (if empty, the key will be created independently of a customer fragment)")

  public String getCustomerFrgId() {
    return customerFrgId;
  }


  public void setCustomerFrgId(String customerFrgId) {
    this.customerFrgId = customerFrgId;
  }


  public UploadRSA metadata(String metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * A metadata about the key
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A metadata about the key")

  public String getMetadata() {
    return metadata;
  }


  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }


  public UploadRSA name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of key to be created
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of key to be created")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UploadRSA rsaFileData(String rsaFileData) {
    
    this.rsaFileData = rsaFileData;
    return this;
  }

   /**
   * RSA private key data, base64 encoded
   * @return rsaFileData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RSA private key data, base64 encoded")

  public String getRsaFileData() {
    return rsaFileData;
  }


  public void setRsaFileData(String rsaFileData) {
    this.rsaFileData = rsaFileData;
  }


  public UploadRSA rsaKeyFilePath(String rsaKeyFilePath) {
    
    this.rsaKeyFilePath = rsaKeyFilePath;
    return this;
  }

   /**
   * RSA private key file path
   * @return rsaKeyFilePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RSA private key file path")

  public String getRsaKeyFilePath() {
    return rsaKeyFilePath;
  }


  public void setRsaKeyFilePath(String rsaKeyFilePath) {
    this.rsaKeyFilePath = rsaKeyFilePath;
  }


  public UploadRSA splitLevel(Long splitLevel) {
    
    this.splitLevel = splitLevel;
    return this;
  }

   /**
   * The number of fragments that the item will be split into
   * @return splitLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of fragments that the item will be split into")

  public Long getSplitLevel() {
    return splitLevel;
  }


  public void setSplitLevel(Long splitLevel) {
    this.splitLevel = splitLevel;
  }


  public UploadRSA tag(List<String> tag) {
    
    this.tag = tag;
    return this;
  }

  public UploadRSA addTagItem(String tagItem) {
    if (this.tag == null) {
      this.tag = new ArrayList<String>();
    }
    this.tag.add(tagItem);
    return this;
  }

   /**
   * List of the tags attached to this key
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the tags attached to this key")

  public List<String> getTag() {
    return tag;
  }


  public void setTag(List<String> tag) {
    this.tag = tag;
  }


  public UploadRSA token(String token) {
    
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


  public UploadRSA uidToken(String uidToken) {
    
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadRSA uploadRSA = (UploadRSA) o;
    return Objects.equals(this.alg, uploadRSA.alg) &&
        Objects.equals(this.cert, uploadRSA.cert) &&
        Objects.equals(this.certFileData, uploadRSA.certFileData) &&
        Objects.equals(this.customerFrgId, uploadRSA.customerFrgId) &&
        Objects.equals(this.metadata, uploadRSA.metadata) &&
        Objects.equals(this.name, uploadRSA.name) &&
        Objects.equals(this.rsaFileData, uploadRSA.rsaFileData) &&
        Objects.equals(this.rsaKeyFilePath, uploadRSA.rsaKeyFilePath) &&
        Objects.equals(this.splitLevel, uploadRSA.splitLevel) &&
        Objects.equals(this.tag, uploadRSA.tag) &&
        Objects.equals(this.token, uploadRSA.token) &&
        Objects.equals(this.uidToken, uploadRSA.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alg, cert, certFileData, customerFrgId, metadata, name, rsaFileData, rsaKeyFilePath, splitLevel, tag, token, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadRSA {\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    cert: ").append(toIndentedString(cert)).append("\n");
    sb.append("    certFileData: ").append(toIndentedString(certFileData)).append("\n");
    sb.append("    customerFrgId: ").append(toIndentedString(customerFrgId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rsaFileData: ").append(toIndentedString(rsaFileData)).append("\n");
    sb.append("    rsaKeyFilePath: ").append(toIndentedString(rsaKeyFilePath)).append("\n");
    sb.append("    splitLevel: ").append(toIndentedString(splitLevel)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

