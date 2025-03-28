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
import io.akeyless.client.model.Extension;
import io.akeyless.client.model.Name;
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
 * CertificateInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class CertificateInfo {
  public static final String SERIALIZED_NAME_EXT_KEY_USAGE = "ExtKeyUsage";
  @SerializedName(SERIALIZED_NAME_EXT_KEY_USAGE)
  @javax.annotation.Nullable
  private List<Long> extKeyUsage = new ArrayList<>();

  public static final String SERIALIZED_NAME_KEY_USAGE = "KeyUsage";
  @SerializedName(SERIALIZED_NAME_KEY_USAGE)
  @javax.annotation.Nullable
  private Long keyUsage;

  public static final String SERIALIZED_NAME_CRL_DISTRIBUTION_POINTS = "crl_distribution_points";
  @SerializedName(SERIALIZED_NAME_CRL_DISTRIBUTION_POINTS)
  @javax.annotation.Nullable
  private List<String> crlDistributionPoints = new ArrayList<>();

  public static final String SERIALIZED_NAME_DNS_NAMES = "dns_names";
  @SerializedName(SERIALIZED_NAME_DNS_NAMES)
  @javax.annotation.Nullable
  private List<String> dnsNames = new ArrayList<>();

  public static final String SERIALIZED_NAME_EMAIL_ADDRESSES = "email_addresses";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESSES)
  @javax.annotation.Nullable
  private List<String> emailAddresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXTENSIONS = "extensions";
  @SerializedName(SERIALIZED_NAME_EXTENSIONS)
  @javax.annotation.Nullable
  private List<Extension> extensions = new ArrayList<>();

  public static final String SERIALIZED_NAME_IP_ADDRESSES = "ip_addresses";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESSES)
  @javax.annotation.Nullable
  private List<String> ipAddresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_IS_CA = "is_ca";
  @SerializedName(SERIALIZED_NAME_IS_CA)
  @javax.annotation.Nullable
  private Boolean isCa;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  @javax.annotation.Nullable
  private Name issuer;

  public static final String SERIALIZED_NAME_ISSUING_CERTIFICATE_URL = "issuing_certificate_url";
  @SerializedName(SERIALIZED_NAME_ISSUING_CERTIFICATE_URL)
  @javax.annotation.Nullable
  private List<String> issuingCertificateUrl = new ArrayList<>();

  public static final String SERIALIZED_NAME_KEY_SIZE = "key_size";
  @SerializedName(SERIALIZED_NAME_KEY_SIZE)
  @javax.annotation.Nullable
  private Long keySize;

  public static final String SERIALIZED_NAME_NOT_AFTER = "not_after";
  @SerializedName(SERIALIZED_NAME_NOT_AFTER)
  @javax.annotation.Nullable
  private OffsetDateTime notAfter;

  public static final String SERIALIZED_NAME_NOT_BEFORE = "not_before";
  @SerializedName(SERIALIZED_NAME_NOT_BEFORE)
  @javax.annotation.Nullable
  private OffsetDateTime notBefore;

  public static final String SERIALIZED_NAME_OCSP_SERVER = "ocsp_server";
  @SerializedName(SERIALIZED_NAME_OCSP_SERVER)
  @javax.annotation.Nullable
  private List<String> ocspServer = new ArrayList<>();

  public static final String SERIALIZED_NAME_PUBLIC_KEY_ALGORITHM_NAME = "public_key_algorithm_name";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY_ALGORITHM_NAME)
  @javax.annotation.Nullable
  private String publicKeyAlgorithmName;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "serial_number";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  @javax.annotation.Nullable
  private String serialNumber;

  public static final String SERIALIZED_NAME_SHA1_FINGERPRINT = "sha_1_fingerprint";
  @SerializedName(SERIALIZED_NAME_SHA1_FINGERPRINT)
  @javax.annotation.Nullable
  private String sha1Fingerprint;

  public static final String SERIALIZED_NAME_SHA256_FINGERPRINT = "sha_256_fingerprint";
  @SerializedName(SERIALIZED_NAME_SHA256_FINGERPRINT)
  @javax.annotation.Nullable
  private String sha256Fingerprint;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  @javax.annotation.Nullable
  private String signature;

  public static final String SERIALIZED_NAME_SIGNATURE_ALGORITHM_NAME = "signature_algorithm_name";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_ALGORITHM_NAME)
  @javax.annotation.Nullable
  private String signatureAlgorithmName;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  @javax.annotation.Nullable
  private Name subject;

  public static final String SERIALIZED_NAME_SUBJECT_PUBLIC_KEY = "subject_public_key";
  @SerializedName(SERIALIZED_NAME_SUBJECT_PUBLIC_KEY)
  @javax.annotation.Nullable
  private String subjectPublicKey;

  public static final String SERIALIZED_NAME_URIS = "uris";
  @SerializedName(SERIALIZED_NAME_URIS)
  @javax.annotation.Nullable
  private List<String> uris = new ArrayList<>();

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  @javax.annotation.Nullable
  private Long version;

  public CertificateInfo() {
  }

  public CertificateInfo extKeyUsage(@javax.annotation.Nullable List<Long> extKeyUsage) {
    this.extKeyUsage = extKeyUsage;
    return this;
  }

  public CertificateInfo addExtKeyUsageItem(Long extKeyUsageItem) {
    if (this.extKeyUsage == null) {
      this.extKeyUsage = new ArrayList<>();
    }
    this.extKeyUsage.add(extKeyUsageItem);
    return this;
  }

  /**
   * Get extKeyUsage
   * @return extKeyUsage
   */
  @javax.annotation.Nullable
  public List<Long> getExtKeyUsage() {
    return extKeyUsage;
  }

  public void setExtKeyUsage(@javax.annotation.Nullable List<Long> extKeyUsage) {
    this.extKeyUsage = extKeyUsage;
  }


  public CertificateInfo keyUsage(@javax.annotation.Nullable Long keyUsage) {
    this.keyUsage = keyUsage;
    return this;
  }

  /**
   * KeyUsage represents the set of actions that are valid for a given key. It&#39;s a bitmap of the KeyUsage* constants.
   * @return keyUsage
   */
  @javax.annotation.Nullable
  public Long getKeyUsage() {
    return keyUsage;
  }

  public void setKeyUsage(@javax.annotation.Nullable Long keyUsage) {
    this.keyUsage = keyUsage;
  }


  public CertificateInfo crlDistributionPoints(@javax.annotation.Nullable List<String> crlDistributionPoints) {
    this.crlDistributionPoints = crlDistributionPoints;
    return this;
  }

  public CertificateInfo addCrlDistributionPointsItem(String crlDistributionPointsItem) {
    if (this.crlDistributionPoints == null) {
      this.crlDistributionPoints = new ArrayList<>();
    }
    this.crlDistributionPoints.add(crlDistributionPointsItem);
    return this;
  }

  /**
   * Get crlDistributionPoints
   * @return crlDistributionPoints
   */
  @javax.annotation.Nullable
  public List<String> getCrlDistributionPoints() {
    return crlDistributionPoints;
  }

  public void setCrlDistributionPoints(@javax.annotation.Nullable List<String> crlDistributionPoints) {
    this.crlDistributionPoints = crlDistributionPoints;
  }


  public CertificateInfo dnsNames(@javax.annotation.Nullable List<String> dnsNames) {
    this.dnsNames = dnsNames;
    return this;
  }

  public CertificateInfo addDnsNamesItem(String dnsNamesItem) {
    if (this.dnsNames == null) {
      this.dnsNames = new ArrayList<>();
    }
    this.dnsNames.add(dnsNamesItem);
    return this;
  }

  /**
   * Get dnsNames
   * @return dnsNames
   */
  @javax.annotation.Nullable
  public List<String> getDnsNames() {
    return dnsNames;
  }

  public void setDnsNames(@javax.annotation.Nullable List<String> dnsNames) {
    this.dnsNames = dnsNames;
  }


  public CertificateInfo emailAddresses(@javax.annotation.Nullable List<String> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  public CertificateInfo addEmailAddressesItem(String emailAddressesItem) {
    if (this.emailAddresses == null) {
      this.emailAddresses = new ArrayList<>();
    }
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

  /**
   * Get emailAddresses
   * @return emailAddresses
   */
  @javax.annotation.Nullable
  public List<String> getEmailAddresses() {
    return emailAddresses;
  }

  public void setEmailAddresses(@javax.annotation.Nullable List<String> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }


  public CertificateInfo extensions(@javax.annotation.Nullable List<Extension> extensions) {
    this.extensions = extensions;
    return this;
  }

  public CertificateInfo addExtensionsItem(Extension extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new ArrayList<>();
    }
    this.extensions.add(extensionsItem);
    return this;
  }

  /**
   * Get extensions
   * @return extensions
   */
  @javax.annotation.Nullable
  public List<Extension> getExtensions() {
    return extensions;
  }

  public void setExtensions(@javax.annotation.Nullable List<Extension> extensions) {
    this.extensions = extensions;
  }


  public CertificateInfo ipAddresses(@javax.annotation.Nullable List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  public CertificateInfo addIpAddressesItem(String ipAddressesItem) {
    if (this.ipAddresses == null) {
      this.ipAddresses = new ArrayList<>();
    }
    this.ipAddresses.add(ipAddressesItem);
    return this;
  }

  /**
   * Get ipAddresses
   * @return ipAddresses
   */
  @javax.annotation.Nullable
  public List<String> getIpAddresses() {
    return ipAddresses;
  }

  public void setIpAddresses(@javax.annotation.Nullable List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
  }


  public CertificateInfo isCa(@javax.annotation.Nullable Boolean isCa) {
    this.isCa = isCa;
    return this;
  }

  /**
   * Get isCa
   * @return isCa
   */
  @javax.annotation.Nullable
  public Boolean getIsCa() {
    return isCa;
  }

  public void setIsCa(@javax.annotation.Nullable Boolean isCa) {
    this.isCa = isCa;
  }


  public CertificateInfo issuer(@javax.annotation.Nullable Name issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Get issuer
   * @return issuer
   */
  @javax.annotation.Nullable
  public Name getIssuer() {
    return issuer;
  }

  public void setIssuer(@javax.annotation.Nullable Name issuer) {
    this.issuer = issuer;
  }


  public CertificateInfo issuingCertificateUrl(@javax.annotation.Nullable List<String> issuingCertificateUrl) {
    this.issuingCertificateUrl = issuingCertificateUrl;
    return this;
  }

  public CertificateInfo addIssuingCertificateUrlItem(String issuingCertificateUrlItem) {
    if (this.issuingCertificateUrl == null) {
      this.issuingCertificateUrl = new ArrayList<>();
    }
    this.issuingCertificateUrl.add(issuingCertificateUrlItem);
    return this;
  }

  /**
   * Get issuingCertificateUrl
   * @return issuingCertificateUrl
   */
  @javax.annotation.Nullable
  public List<String> getIssuingCertificateUrl() {
    return issuingCertificateUrl;
  }

  public void setIssuingCertificateUrl(@javax.annotation.Nullable List<String> issuingCertificateUrl) {
    this.issuingCertificateUrl = issuingCertificateUrl;
  }


  public CertificateInfo keySize(@javax.annotation.Nullable Long keySize) {
    this.keySize = keySize;
    return this;
  }

  /**
   * Get keySize
   * @return keySize
   */
  @javax.annotation.Nullable
  public Long getKeySize() {
    return keySize;
  }

  public void setKeySize(@javax.annotation.Nullable Long keySize) {
    this.keySize = keySize;
  }


  public CertificateInfo notAfter(@javax.annotation.Nullable OffsetDateTime notAfter) {
    this.notAfter = notAfter;
    return this;
  }

  /**
   * Get notAfter
   * @return notAfter
   */
  @javax.annotation.Nullable
  public OffsetDateTime getNotAfter() {
    return notAfter;
  }

  public void setNotAfter(@javax.annotation.Nullable OffsetDateTime notAfter) {
    this.notAfter = notAfter;
  }


  public CertificateInfo notBefore(@javax.annotation.Nullable OffsetDateTime notBefore) {
    this.notBefore = notBefore;
    return this;
  }

  /**
   * Get notBefore
   * @return notBefore
   */
  @javax.annotation.Nullable
  public OffsetDateTime getNotBefore() {
    return notBefore;
  }

  public void setNotBefore(@javax.annotation.Nullable OffsetDateTime notBefore) {
    this.notBefore = notBefore;
  }


  public CertificateInfo ocspServer(@javax.annotation.Nullable List<String> ocspServer) {
    this.ocspServer = ocspServer;
    return this;
  }

  public CertificateInfo addOcspServerItem(String ocspServerItem) {
    if (this.ocspServer == null) {
      this.ocspServer = new ArrayList<>();
    }
    this.ocspServer.add(ocspServerItem);
    return this;
  }

  /**
   * Get ocspServer
   * @return ocspServer
   */
  @javax.annotation.Nullable
  public List<String> getOcspServer() {
    return ocspServer;
  }

  public void setOcspServer(@javax.annotation.Nullable List<String> ocspServer) {
    this.ocspServer = ocspServer;
  }


  public CertificateInfo publicKeyAlgorithmName(@javax.annotation.Nullable String publicKeyAlgorithmName) {
    this.publicKeyAlgorithmName = publicKeyAlgorithmName;
    return this;
  }

  /**
   * Get publicKeyAlgorithmName
   * @return publicKeyAlgorithmName
   */
  @javax.annotation.Nullable
  public String getPublicKeyAlgorithmName() {
    return publicKeyAlgorithmName;
  }

  public void setPublicKeyAlgorithmName(@javax.annotation.Nullable String publicKeyAlgorithmName) {
    this.publicKeyAlgorithmName = publicKeyAlgorithmName;
  }


  public CertificateInfo serialNumber(@javax.annotation.Nullable String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Get serialNumber
   * @return serialNumber
   */
  @javax.annotation.Nullable
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(@javax.annotation.Nullable String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public CertificateInfo sha1Fingerprint(@javax.annotation.Nullable String sha1Fingerprint) {
    this.sha1Fingerprint = sha1Fingerprint;
    return this;
  }

  /**
   * Get sha1Fingerprint
   * @return sha1Fingerprint
   */
  @javax.annotation.Nullable
  public String getSha1Fingerprint() {
    return sha1Fingerprint;
  }

  public void setSha1Fingerprint(@javax.annotation.Nullable String sha1Fingerprint) {
    this.sha1Fingerprint = sha1Fingerprint;
  }


  public CertificateInfo sha256Fingerprint(@javax.annotation.Nullable String sha256Fingerprint) {
    this.sha256Fingerprint = sha256Fingerprint;
    return this;
  }

  /**
   * Get sha256Fingerprint
   * @return sha256Fingerprint
   */
  @javax.annotation.Nullable
  public String getSha256Fingerprint() {
    return sha256Fingerprint;
  }

  public void setSha256Fingerprint(@javax.annotation.Nullable String sha256Fingerprint) {
    this.sha256Fingerprint = sha256Fingerprint;
  }


  public CertificateInfo signature(@javax.annotation.Nullable String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Get signature
   * @return signature
   */
  @javax.annotation.Nullable
  public String getSignature() {
    return signature;
  }

  public void setSignature(@javax.annotation.Nullable String signature) {
    this.signature = signature;
  }


  public CertificateInfo signatureAlgorithmName(@javax.annotation.Nullable String signatureAlgorithmName) {
    this.signatureAlgorithmName = signatureAlgorithmName;
    return this;
  }

  /**
   * Get signatureAlgorithmName
   * @return signatureAlgorithmName
   */
  @javax.annotation.Nullable
  public String getSignatureAlgorithmName() {
    return signatureAlgorithmName;
  }

  public void setSignatureAlgorithmName(@javax.annotation.Nullable String signatureAlgorithmName) {
    this.signatureAlgorithmName = signatureAlgorithmName;
  }


  public CertificateInfo subject(@javax.annotation.Nullable Name subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
   */
  @javax.annotation.Nullable
  public Name getSubject() {
    return subject;
  }

  public void setSubject(@javax.annotation.Nullable Name subject) {
    this.subject = subject;
  }


  public CertificateInfo subjectPublicKey(@javax.annotation.Nullable String subjectPublicKey) {
    this.subjectPublicKey = subjectPublicKey;
    return this;
  }

  /**
   * Get subjectPublicKey
   * @return subjectPublicKey
   */
  @javax.annotation.Nullable
  public String getSubjectPublicKey() {
    return subjectPublicKey;
  }

  public void setSubjectPublicKey(@javax.annotation.Nullable String subjectPublicKey) {
    this.subjectPublicKey = subjectPublicKey;
  }


  public CertificateInfo uris(@javax.annotation.Nullable List<String> uris) {
    this.uris = uris;
    return this;
  }

  public CertificateInfo addUrisItem(String urisItem) {
    if (this.uris == null) {
      this.uris = new ArrayList<>();
    }
    this.uris.add(urisItem);
    return this;
  }

  /**
   * Get uris
   * @return uris
   */
  @javax.annotation.Nullable
  public List<String> getUris() {
    return uris;
  }

  public void setUris(@javax.annotation.Nullable List<String> uris) {
    this.uris = uris;
  }


  public CertificateInfo version(@javax.annotation.Nullable Long version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nullable
  public Long getVersion() {
    return version;
  }

  public void setVersion(@javax.annotation.Nullable Long version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateInfo certificateInfo = (CertificateInfo) o;
    return Objects.equals(this.extKeyUsage, certificateInfo.extKeyUsage) &&
        Objects.equals(this.keyUsage, certificateInfo.keyUsage) &&
        Objects.equals(this.crlDistributionPoints, certificateInfo.crlDistributionPoints) &&
        Objects.equals(this.dnsNames, certificateInfo.dnsNames) &&
        Objects.equals(this.emailAddresses, certificateInfo.emailAddresses) &&
        Objects.equals(this.extensions, certificateInfo.extensions) &&
        Objects.equals(this.ipAddresses, certificateInfo.ipAddresses) &&
        Objects.equals(this.isCa, certificateInfo.isCa) &&
        Objects.equals(this.issuer, certificateInfo.issuer) &&
        Objects.equals(this.issuingCertificateUrl, certificateInfo.issuingCertificateUrl) &&
        Objects.equals(this.keySize, certificateInfo.keySize) &&
        Objects.equals(this.notAfter, certificateInfo.notAfter) &&
        Objects.equals(this.notBefore, certificateInfo.notBefore) &&
        Objects.equals(this.ocspServer, certificateInfo.ocspServer) &&
        Objects.equals(this.publicKeyAlgorithmName, certificateInfo.publicKeyAlgorithmName) &&
        Objects.equals(this.serialNumber, certificateInfo.serialNumber) &&
        Objects.equals(this.sha1Fingerprint, certificateInfo.sha1Fingerprint) &&
        Objects.equals(this.sha256Fingerprint, certificateInfo.sha256Fingerprint) &&
        Objects.equals(this.signature, certificateInfo.signature) &&
        Objects.equals(this.signatureAlgorithmName, certificateInfo.signatureAlgorithmName) &&
        Objects.equals(this.subject, certificateInfo.subject) &&
        Objects.equals(this.subjectPublicKey, certificateInfo.subjectPublicKey) &&
        Objects.equals(this.uris, certificateInfo.uris) &&
        Objects.equals(this.version, certificateInfo.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extKeyUsage, keyUsage, crlDistributionPoints, dnsNames, emailAddresses, extensions, ipAddresses, isCa, issuer, issuingCertificateUrl, keySize, notAfter, notBefore, ocspServer, publicKeyAlgorithmName, serialNumber, sha1Fingerprint, sha256Fingerprint, signature, signatureAlgorithmName, subject, subjectPublicKey, uris, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateInfo {\n");
    sb.append("    extKeyUsage: ").append(toIndentedString(extKeyUsage)).append("\n");
    sb.append("    keyUsage: ").append(toIndentedString(keyUsage)).append("\n");
    sb.append("    crlDistributionPoints: ").append(toIndentedString(crlDistributionPoints)).append("\n");
    sb.append("    dnsNames: ").append(toIndentedString(dnsNames)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    isCa: ").append(toIndentedString(isCa)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    issuingCertificateUrl: ").append(toIndentedString(issuingCertificateUrl)).append("\n");
    sb.append("    keySize: ").append(toIndentedString(keySize)).append("\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
    sb.append("    ocspServer: ").append(toIndentedString(ocspServer)).append("\n");
    sb.append("    publicKeyAlgorithmName: ").append(toIndentedString(publicKeyAlgorithmName)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    sha1Fingerprint: ").append(toIndentedString(sha1Fingerprint)).append("\n");
    sb.append("    sha256Fingerprint: ").append(toIndentedString(sha256Fingerprint)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    signatureAlgorithmName: ").append(toIndentedString(signatureAlgorithmName)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    subjectPublicKey: ").append(toIndentedString(subjectPublicKey)).append("\n");
    sb.append("    uris: ").append(toIndentedString(uris)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("ExtKeyUsage");
    openapiFields.add("KeyUsage");
    openapiFields.add("crl_distribution_points");
    openapiFields.add("dns_names");
    openapiFields.add("email_addresses");
    openapiFields.add("extensions");
    openapiFields.add("ip_addresses");
    openapiFields.add("is_ca");
    openapiFields.add("issuer");
    openapiFields.add("issuing_certificate_url");
    openapiFields.add("key_size");
    openapiFields.add("not_after");
    openapiFields.add("not_before");
    openapiFields.add("ocsp_server");
    openapiFields.add("public_key_algorithm_name");
    openapiFields.add("serial_number");
    openapiFields.add("sha_1_fingerprint");
    openapiFields.add("sha_256_fingerprint");
    openapiFields.add("signature");
    openapiFields.add("signature_algorithm_name");
    openapiFields.add("subject");
    openapiFields.add("subject_public_key");
    openapiFields.add("uris");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CertificateInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CertificateInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CertificateInfo is not found in the empty JSON string", CertificateInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CertificateInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CertificateInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("ExtKeyUsage") != null && !jsonObj.get("ExtKeyUsage").isJsonNull() && !jsonObj.get("ExtKeyUsage").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ExtKeyUsage` to be an array in the JSON string but got `%s`", jsonObj.get("ExtKeyUsage").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("crl_distribution_points") != null && !jsonObj.get("crl_distribution_points").isJsonNull() && !jsonObj.get("crl_distribution_points").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `crl_distribution_points` to be an array in the JSON string but got `%s`", jsonObj.get("crl_distribution_points").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("dns_names") != null && !jsonObj.get("dns_names").isJsonNull() && !jsonObj.get("dns_names").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dns_names` to be an array in the JSON string but got `%s`", jsonObj.get("dns_names").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("email_addresses") != null && !jsonObj.get("email_addresses").isJsonNull() && !jsonObj.get("email_addresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_addresses` to be an array in the JSON string but got `%s`", jsonObj.get("email_addresses").toString()));
      }
      if (jsonObj.get("extensions") != null && !jsonObj.get("extensions").isJsonNull()) {
        JsonArray jsonArrayextensions = jsonObj.getAsJsonArray("extensions");
        if (jsonArrayextensions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("extensions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `extensions` to be an array in the JSON string but got `%s`", jsonObj.get("extensions").toString()));
          }

          // validate the optional field `extensions` (array)
          for (int i = 0; i < jsonArrayextensions.size(); i++) {
            Extension.validateJsonElement(jsonArrayextensions.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ip_addresses") != null && !jsonObj.get("ip_addresses").isJsonNull() && !jsonObj.get("ip_addresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip_addresses` to be an array in the JSON string but got `%s`", jsonObj.get("ip_addresses").toString()));
      }
      // validate the optional field `issuer`
      if (jsonObj.get("issuer") != null && !jsonObj.get("issuer").isJsonNull()) {
        Name.validateJsonElement(jsonObj.get("issuer"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("issuing_certificate_url") != null && !jsonObj.get("issuing_certificate_url").isJsonNull() && !jsonObj.get("issuing_certificate_url").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuing_certificate_url` to be an array in the JSON string but got `%s`", jsonObj.get("issuing_certificate_url").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ocsp_server") != null && !jsonObj.get("ocsp_server").isJsonNull() && !jsonObj.get("ocsp_server").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ocsp_server` to be an array in the JSON string but got `%s`", jsonObj.get("ocsp_server").toString()));
      }
      if ((jsonObj.get("public_key_algorithm_name") != null && !jsonObj.get("public_key_algorithm_name").isJsonNull()) && !jsonObj.get("public_key_algorithm_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `public_key_algorithm_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("public_key_algorithm_name").toString()));
      }
      if ((jsonObj.get("serial_number") != null && !jsonObj.get("serial_number").isJsonNull()) && !jsonObj.get("serial_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serial_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serial_number").toString()));
      }
      if ((jsonObj.get("sha_1_fingerprint") != null && !jsonObj.get("sha_1_fingerprint").isJsonNull()) && !jsonObj.get("sha_1_fingerprint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sha_1_fingerprint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sha_1_fingerprint").toString()));
      }
      if ((jsonObj.get("sha_256_fingerprint") != null && !jsonObj.get("sha_256_fingerprint").isJsonNull()) && !jsonObj.get("sha_256_fingerprint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sha_256_fingerprint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sha_256_fingerprint").toString()));
      }
      if ((jsonObj.get("signature") != null && !jsonObj.get("signature").isJsonNull()) && !jsonObj.get("signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature").toString()));
      }
      if ((jsonObj.get("signature_algorithm_name") != null && !jsonObj.get("signature_algorithm_name").isJsonNull()) && !jsonObj.get("signature_algorithm_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature_algorithm_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature_algorithm_name").toString()));
      }
      // validate the optional field `subject`
      if (jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) {
        Name.validateJsonElement(jsonObj.get("subject"));
      }
      if ((jsonObj.get("subject_public_key") != null && !jsonObj.get("subject_public_key").isJsonNull()) && !jsonObj.get("subject_public_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject_public_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject_public_key").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("uris") != null && !jsonObj.get("uris").isJsonNull() && !jsonObj.get("uris").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `uris` to be an array in the JSON string but got `%s`", jsonObj.get("uris").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CertificateInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CertificateInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CertificateInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CertificateInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CertificateInfo>() {
           @Override
           public void write(JsonWriter out, CertificateInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CertificateInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CertificateInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CertificateInfo
   * @throws IOException if the JSON string is invalid with respect to CertificateInfo
   */
  public static CertificateInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CertificateInfo.class);
  }

  /**
   * Convert an instance of CertificateInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

