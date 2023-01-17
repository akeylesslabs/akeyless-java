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
import io.akeyless.client.model.Extension;
import io.akeyless.client.model.Name;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * CertificateInfo
 */

public class CertificateInfo {
  public static final String SERIALIZED_NAME_EXT_KEY_USAGE = "ExtKeyUsage";
  @SerializedName(SERIALIZED_NAME_EXT_KEY_USAGE)
  private List<Long> extKeyUsage = null;

  public static final String SERIALIZED_NAME_KEY_USAGE = "KeyUsage";
  @SerializedName(SERIALIZED_NAME_KEY_USAGE)
  private Long keyUsage;

  public static final String SERIALIZED_NAME_DNS_NAMES = "dns_names";
  @SerializedName(SERIALIZED_NAME_DNS_NAMES)
  private List<String> dnsNames = null;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESSES = "email_addresses";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESSES)
  private List<String> emailAddresses = null;

  public static final String SERIALIZED_NAME_EXTENSIONS = "extensions";
  @SerializedName(SERIALIZED_NAME_EXTENSIONS)
  private List<Extension> extensions = null;

  public static final String SERIALIZED_NAME_IP_ADDRESSES = "ip_addresses";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESSES)
  private List<String> ipAddresses = null;

  public static final String SERIALIZED_NAME_IS_CA = "is_ca";
  @SerializedName(SERIALIZED_NAME_IS_CA)
  private Boolean isCa;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private Name issuer;

  public static final String SERIALIZED_NAME_ISSUING_CERTIFICATE_URL = "issuing_certificate_url";
  @SerializedName(SERIALIZED_NAME_ISSUING_CERTIFICATE_URL)
  private List<String> issuingCertificateUrl = null;

  public static final String SERIALIZED_NAME_KEY_SIZE = "key_size";
  @SerializedName(SERIALIZED_NAME_KEY_SIZE)
  private Long keySize;

  public static final String SERIALIZED_NAME_NOT_AFTER = "not_after";
  @SerializedName(SERIALIZED_NAME_NOT_AFTER)
  private OffsetDateTime notAfter;

  public static final String SERIALIZED_NAME_NOT_BEFORE = "not_before";
  @SerializedName(SERIALIZED_NAME_NOT_BEFORE)
  private OffsetDateTime notBefore;

  public static final String SERIALIZED_NAME_OCSP_SERVER = "ocsp_server";
  @SerializedName(SERIALIZED_NAME_OCSP_SERVER)
  private List<String> ocspServer = null;

  public static final String SERIALIZED_NAME_PUBLIC_KEY_ALGORITHM_NAME = "public_key_algorithm_name";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY_ALGORITHM_NAME)
  private String publicKeyAlgorithmName;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "serial_number";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private String serialNumber;

  public static final String SERIALIZED_NAME_SHA1_FINGERPRINT = "sha_1_fingerprint";
  @SerializedName(SERIALIZED_NAME_SHA1_FINGERPRINT)
  private String sha1Fingerprint;

  public static final String SERIALIZED_NAME_SHA256_FINGERPRINT = "sha_256_fingerprint";
  @SerializedName(SERIALIZED_NAME_SHA256_FINGERPRINT)
  private String sha256Fingerprint;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature;

  public static final String SERIALIZED_NAME_SIGNATURE_ALGORITHM_NAME = "signature_algorithm_name";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_ALGORITHM_NAME)
  private String signatureAlgorithmName;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private Name subject;

  public static final String SERIALIZED_NAME_SUBJECT_PUBLIC_KEY = "subject_public_key";
  @SerializedName(SERIALIZED_NAME_SUBJECT_PUBLIC_KEY)
  private String subjectPublicKey;

  public static final String SERIALIZED_NAME_URIS = "uris";
  @SerializedName(SERIALIZED_NAME_URIS)
  private List<String> uris = null;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Long version;


  public CertificateInfo extKeyUsage(List<Long> extKeyUsage) {
    
    this.extKeyUsage = extKeyUsage;
    return this;
  }

  public CertificateInfo addExtKeyUsageItem(Long extKeyUsageItem) {
    if (this.extKeyUsage == null) {
      this.extKeyUsage = new ArrayList<Long>();
    }
    this.extKeyUsage.add(extKeyUsageItem);
    return this;
  }

   /**
   * Get extKeyUsage
   * @return extKeyUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getExtKeyUsage() {
    return extKeyUsage;
  }


  public void setExtKeyUsage(List<Long> extKeyUsage) {
    this.extKeyUsage = extKeyUsage;
  }


  public CertificateInfo keyUsage(Long keyUsage) {
    
    this.keyUsage = keyUsage;
    return this;
  }

   /**
   * KeyUsage represents the set of actions that are valid for a given key. It&#39;s a bitmap of the KeyUsage* constants.
   * @return keyUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "KeyUsage represents the set of actions that are valid for a given key. It's a bitmap of the KeyUsage* constants.")

  public Long getKeyUsage() {
    return keyUsage;
  }


  public void setKeyUsage(Long keyUsage) {
    this.keyUsage = keyUsage;
  }


  public CertificateInfo dnsNames(List<String> dnsNames) {
    
    this.dnsNames = dnsNames;
    return this;
  }

  public CertificateInfo addDnsNamesItem(String dnsNamesItem) {
    if (this.dnsNames == null) {
      this.dnsNames = new ArrayList<String>();
    }
    this.dnsNames.add(dnsNamesItem);
    return this;
  }

   /**
   * Get dnsNames
   * @return dnsNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDnsNames() {
    return dnsNames;
  }


  public void setDnsNames(List<String> dnsNames) {
    this.dnsNames = dnsNames;
  }


  public CertificateInfo emailAddresses(List<String> emailAddresses) {
    
    this.emailAddresses = emailAddresses;
    return this;
  }

  public CertificateInfo addEmailAddressesItem(String emailAddressesItem) {
    if (this.emailAddresses == null) {
      this.emailAddresses = new ArrayList<String>();
    }
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

   /**
   * Get emailAddresses
   * @return emailAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getEmailAddresses() {
    return emailAddresses;
  }


  public void setEmailAddresses(List<String> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }


  public CertificateInfo extensions(List<Extension> extensions) {
    
    this.extensions = extensions;
    return this;
  }

  public CertificateInfo addExtensionsItem(Extension extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new ArrayList<Extension>();
    }
    this.extensions.add(extensionsItem);
    return this;
  }

   /**
   * Get extensions
   * @return extensions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Extension> getExtensions() {
    return extensions;
  }


  public void setExtensions(List<Extension> extensions) {
    this.extensions = extensions;
  }


  public CertificateInfo ipAddresses(List<String> ipAddresses) {
    
    this.ipAddresses = ipAddresses;
    return this;
  }

  public CertificateInfo addIpAddressesItem(String ipAddressesItem) {
    if (this.ipAddresses == null) {
      this.ipAddresses = new ArrayList<String>();
    }
    this.ipAddresses.add(ipAddressesItem);
    return this;
  }

   /**
   * Get ipAddresses
   * @return ipAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIpAddresses() {
    return ipAddresses;
  }


  public void setIpAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
  }


  public CertificateInfo isCa(Boolean isCa) {
    
    this.isCa = isCa;
    return this;
  }

   /**
   * Get isCa
   * @return isCa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsCa() {
    return isCa;
  }


  public void setIsCa(Boolean isCa) {
    this.isCa = isCa;
  }


  public CertificateInfo issuer(Name issuer) {
    
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Name getIssuer() {
    return issuer;
  }


  public void setIssuer(Name issuer) {
    this.issuer = issuer;
  }


  public CertificateInfo issuingCertificateUrl(List<String> issuingCertificateUrl) {
    
    this.issuingCertificateUrl = issuingCertificateUrl;
    return this;
  }

  public CertificateInfo addIssuingCertificateUrlItem(String issuingCertificateUrlItem) {
    if (this.issuingCertificateUrl == null) {
      this.issuingCertificateUrl = new ArrayList<String>();
    }
    this.issuingCertificateUrl.add(issuingCertificateUrlItem);
    return this;
  }

   /**
   * Get issuingCertificateUrl
   * @return issuingCertificateUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIssuingCertificateUrl() {
    return issuingCertificateUrl;
  }


  public void setIssuingCertificateUrl(List<String> issuingCertificateUrl) {
    this.issuingCertificateUrl = issuingCertificateUrl;
  }


  public CertificateInfo keySize(Long keySize) {
    
    this.keySize = keySize;
    return this;
  }

   /**
   * Get keySize
   * @return keySize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getKeySize() {
    return keySize;
  }


  public void setKeySize(Long keySize) {
    this.keySize = keySize;
  }


  public CertificateInfo notAfter(OffsetDateTime notAfter) {
    
    this.notAfter = notAfter;
    return this;
  }

   /**
   * Get notAfter
   * @return notAfter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getNotAfter() {
    return notAfter;
  }


  public void setNotAfter(OffsetDateTime notAfter) {
    this.notAfter = notAfter;
  }


  public CertificateInfo notBefore(OffsetDateTime notBefore) {
    
    this.notBefore = notBefore;
    return this;
  }

   /**
   * Get notBefore
   * @return notBefore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getNotBefore() {
    return notBefore;
  }


  public void setNotBefore(OffsetDateTime notBefore) {
    this.notBefore = notBefore;
  }


  public CertificateInfo ocspServer(List<String> ocspServer) {
    
    this.ocspServer = ocspServer;
    return this;
  }

  public CertificateInfo addOcspServerItem(String ocspServerItem) {
    if (this.ocspServer == null) {
      this.ocspServer = new ArrayList<String>();
    }
    this.ocspServer.add(ocspServerItem);
    return this;
  }

   /**
   * Get ocspServer
   * @return ocspServer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getOcspServer() {
    return ocspServer;
  }


  public void setOcspServer(List<String> ocspServer) {
    this.ocspServer = ocspServer;
  }


  public CertificateInfo publicKeyAlgorithmName(String publicKeyAlgorithmName) {
    
    this.publicKeyAlgorithmName = publicKeyAlgorithmName;
    return this;
  }

   /**
   * Get publicKeyAlgorithmName
   * @return publicKeyAlgorithmName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPublicKeyAlgorithmName() {
    return publicKeyAlgorithmName;
  }


  public void setPublicKeyAlgorithmName(String publicKeyAlgorithmName) {
    this.publicKeyAlgorithmName = publicKeyAlgorithmName;
  }


  public CertificateInfo serialNumber(String serialNumber) {
    
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Get serialNumber
   * @return serialNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialNumber() {
    return serialNumber;
  }


  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public CertificateInfo sha1Fingerprint(String sha1Fingerprint) {
    
    this.sha1Fingerprint = sha1Fingerprint;
    return this;
  }

   /**
   * Get sha1Fingerprint
   * @return sha1Fingerprint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSha1Fingerprint() {
    return sha1Fingerprint;
  }


  public void setSha1Fingerprint(String sha1Fingerprint) {
    this.sha1Fingerprint = sha1Fingerprint;
  }


  public CertificateInfo sha256Fingerprint(String sha256Fingerprint) {
    
    this.sha256Fingerprint = sha256Fingerprint;
    return this;
  }

   /**
   * Get sha256Fingerprint
   * @return sha256Fingerprint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSha256Fingerprint() {
    return sha256Fingerprint;
  }


  public void setSha256Fingerprint(String sha256Fingerprint) {
    this.sha256Fingerprint = sha256Fingerprint;
  }


  public CertificateInfo signature(String signature) {
    
    this.signature = signature;
    return this;
  }

   /**
   * Get signature
   * @return signature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSignature() {
    return signature;
  }


  public void setSignature(String signature) {
    this.signature = signature;
  }


  public CertificateInfo signatureAlgorithmName(String signatureAlgorithmName) {
    
    this.signatureAlgorithmName = signatureAlgorithmName;
    return this;
  }

   /**
   * Get signatureAlgorithmName
   * @return signatureAlgorithmName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSignatureAlgorithmName() {
    return signatureAlgorithmName;
  }


  public void setSignatureAlgorithmName(String signatureAlgorithmName) {
    this.signatureAlgorithmName = signatureAlgorithmName;
  }


  public CertificateInfo subject(Name subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Name getSubject() {
    return subject;
  }


  public void setSubject(Name subject) {
    this.subject = subject;
  }


  public CertificateInfo subjectPublicKey(String subjectPublicKey) {
    
    this.subjectPublicKey = subjectPublicKey;
    return this;
  }

   /**
   * Get subjectPublicKey
   * @return subjectPublicKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubjectPublicKey() {
    return subjectPublicKey;
  }


  public void setSubjectPublicKey(String subjectPublicKey) {
    this.subjectPublicKey = subjectPublicKey;
  }


  public CertificateInfo uris(List<String> uris) {
    
    this.uris = uris;
    return this;
  }

  public CertificateInfo addUrisItem(String urisItem) {
    if (this.uris == null) {
      this.uris = new ArrayList<String>();
    }
    this.uris.add(urisItem);
    return this;
  }

   /**
   * Get uris
   * @return uris
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUris() {
    return uris;
  }


  public void setUris(List<String> uris) {
    this.uris = uris;
  }


  public CertificateInfo version(Long version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getVersion() {
    return version;
  }


  public void setVersion(Long version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateInfo certificateInfo = (CertificateInfo) o;
    return Objects.equals(this.extKeyUsage, certificateInfo.extKeyUsage) &&
        Objects.equals(this.keyUsage, certificateInfo.keyUsage) &&
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
    return Objects.hash(extKeyUsage, keyUsage, dnsNames, emailAddresses, extensions, ipAddresses, isCa, issuer, issuingCertificateUrl, keySize, notAfter, notBefore, ocspServer, publicKeyAlgorithmName, serialNumber, sha1Fingerprint, sha256Fingerprint, signature, signatureAlgorithmName, subject, subjectPublicKey, uris, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateInfo {\n");
    sb.append("    extKeyUsage: ").append(toIndentedString(extKeyUsage)).append("\n");
    sb.append("    keyUsage: ").append(toIndentedString(keyUsage)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
