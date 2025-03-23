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
import io.akeyless.client.model.LogForwardingConfigPart;
import io.akeyless.client.model.SshBastionSessionTermination;
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
 * SshBastionConf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class SshBastionConf {
  public static final String SERIALIZED_NAME_HIDE_SESSION_RECORDING = "hide_session_recording";
  @SerializedName(SERIALIZED_NAME_HIDE_SESSION_RECORDING)
  @javax.annotation.Nullable
  private Boolean hideSessionRecording;

  public static final String SERIALIZED_NAME_KEXALGS = "kexalgs";
  @SerializedName(SERIALIZED_NAME_KEXALGS)
  @javax.annotation.Nullable
  private String kexalgs;

  public static final String SERIALIZED_NAME_LOG_FORWARDING = "log_forwarding";
  @SerializedName(SERIALIZED_NAME_LOG_FORWARDING)
  @javax.annotation.Nullable
  private LogForwardingConfigPart logForwarding;

  public static final String SERIALIZED_NAME_SESSION_TERMINATION = "session_termination";
  @SerializedName(SERIALIZED_NAME_SESSION_TERMINATION)
  @javax.annotation.Nullable
  private SshBastionSessionTermination sessionTermination;

  public SshBastionConf() {
  }

  public SshBastionConf hideSessionRecording(@javax.annotation.Nullable Boolean hideSessionRecording) {
    this.hideSessionRecording = hideSessionRecording;
    return this;
  }

  /**
   * Get hideSessionRecording
   * @return hideSessionRecording
   */
  @javax.annotation.Nullable
  public Boolean getHideSessionRecording() {
    return hideSessionRecording;
  }

  public void setHideSessionRecording(@javax.annotation.Nullable Boolean hideSessionRecording) {
    this.hideSessionRecording = hideSessionRecording;
  }


  public SshBastionConf kexalgs(@javax.annotation.Nullable String kexalgs) {
    this.kexalgs = kexalgs;
    return this;
  }

  /**
   * Get kexalgs
   * @return kexalgs
   */
  @javax.annotation.Nullable
  public String getKexalgs() {
    return kexalgs;
  }

  public void setKexalgs(@javax.annotation.Nullable String kexalgs) {
    this.kexalgs = kexalgs;
  }


  public SshBastionConf logForwarding(@javax.annotation.Nullable LogForwardingConfigPart logForwarding) {
    this.logForwarding = logForwarding;
    return this;
  }

  /**
   * Get logForwarding
   * @return logForwarding
   */
  @javax.annotation.Nullable
  public LogForwardingConfigPart getLogForwarding() {
    return logForwarding;
  }

  public void setLogForwarding(@javax.annotation.Nullable LogForwardingConfigPart logForwarding) {
    this.logForwarding = logForwarding;
  }


  public SshBastionConf sessionTermination(@javax.annotation.Nullable SshBastionSessionTermination sessionTermination) {
    this.sessionTermination = sessionTermination;
    return this;
  }

  /**
   * Get sessionTermination
   * @return sessionTermination
   */
  @javax.annotation.Nullable
  public SshBastionSessionTermination getSessionTermination() {
    return sessionTermination;
  }

  public void setSessionTermination(@javax.annotation.Nullable SshBastionSessionTermination sessionTermination) {
    this.sessionTermination = sessionTermination;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SshBastionConf sshBastionConf = (SshBastionConf) o;
    return Objects.equals(this.hideSessionRecording, sshBastionConf.hideSessionRecording) &&
        Objects.equals(this.kexalgs, sshBastionConf.kexalgs) &&
        Objects.equals(this.logForwarding, sshBastionConf.logForwarding) &&
        Objects.equals(this.sessionTermination, sshBastionConf.sessionTermination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hideSessionRecording, kexalgs, logForwarding, sessionTermination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SshBastionConf {\n");
    sb.append("    hideSessionRecording: ").append(toIndentedString(hideSessionRecording)).append("\n");
    sb.append("    kexalgs: ").append(toIndentedString(kexalgs)).append("\n");
    sb.append("    logForwarding: ").append(toIndentedString(logForwarding)).append("\n");
    sb.append("    sessionTermination: ").append(toIndentedString(sessionTermination)).append("\n");
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
    openapiFields.add("hide_session_recording");
    openapiFields.add("kexalgs");
    openapiFields.add("log_forwarding");
    openapiFields.add("session_termination");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SshBastionConf
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SshBastionConf.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SshBastionConf is not found in the empty JSON string", SshBastionConf.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SshBastionConf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SshBastionConf` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("kexalgs") != null && !jsonObj.get("kexalgs").isJsonNull()) && !jsonObj.get("kexalgs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kexalgs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kexalgs").toString()));
      }
      // validate the optional field `log_forwarding`
      if (jsonObj.get("log_forwarding") != null && !jsonObj.get("log_forwarding").isJsonNull()) {
        LogForwardingConfigPart.validateJsonElement(jsonObj.get("log_forwarding"));
      }
      // validate the optional field `session_termination`
      if (jsonObj.get("session_termination") != null && !jsonObj.get("session_termination").isJsonNull()) {
        SshBastionSessionTermination.validateJsonElement(jsonObj.get("session_termination"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SshBastionConf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SshBastionConf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SshBastionConf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SshBastionConf.class));

       return (TypeAdapter<T>) new TypeAdapter<SshBastionConf>() {
           @Override
           public void write(JsonWriter out, SshBastionConf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SshBastionConf read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SshBastionConf given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SshBastionConf
   * @throws IOException if the JSON string is invalid with respect to SshBastionConf
   */
  public static SshBastionConf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SshBastionConf.class);
  }

  /**
   * Convert an instance of SshBastionConf to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

