/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.healthconnect_pro.opencagedata.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * ResponseTimestamp
 */

public class ResponseTimestamp {
  @JsonProperty("created_unix")
  private Integer created_unix = null;

  @JsonProperty("created_http")
  private String created_http = null;

  public ResponseTimestamp created_unix(Integer created_unix) {
    this.created_unix = created_unix;
    return this;
  }

   /**
   * Get created_unix
   * @return created_unix
  **/
  public Integer getCreatedUnix() {
    return created_unix;
  }

  public void setCreatedUnix(Integer created_unix) {
    this.created_unix = created_unix;
  }

  public ResponseTimestamp created_http(String created_http) {
    this.created_http = created_http;
    return this;
  }

   /**
   * Get created_http
   * @return created_http
  **/
  public String getCreatedHttp() {
    return created_http;
  }

  public void setCreatedHttp(String created_http) {
    this.created_http = created_http;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseTimestamp Response_timestamp = (ResponseTimestamp) o;
    return Objects.equals(this.created_unix, Response_timestamp.created_unix) &&
        Objects.equals(this.created_http, Response_timestamp.created_http);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created_unix, created_http);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseTimestamp {\n");
    
    sb.append("    created_unix: ").append(toIndentedString(created_unix)).append("\n");
    sb.append("    created_http: ").append(toIndentedString(created_http)).append("\n");
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
