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
import com.healthconnect_pro.opencagedata.model.ResponseCurrency;
import com.healthconnect_pro.opencagedata.model.ResponseDMS;
import com.healthconnect_pro.opencagedata.model.ResponseMercator;
import com.healthconnect_pro.opencagedata.model.ResponseOSM;
import com.healthconnect_pro.opencagedata.model.ResponseRoadinfo;
import com.healthconnect_pro.opencagedata.model.ResponseSun;
import com.healthconnect_pro.opencagedata.model.ResponseTimezone;
import com.healthconnect_pro.opencagedata.model.ResponseUNM49;
import com.healthconnect_pro.opencagedata.model.ResponseWhat3words;
/**
 * ResponseAnnotations
 */

public class ResponseAnnotations {
  @JsonProperty("flag")
  private String flag = null;

  @JsonProperty("Mercator")
  private ResponseMercator Mercator = null;

  @JsonProperty("timezone")
  private ResponseTimezone timezone = null;

  @JsonProperty("what3words")
  private ResponseWhat3words what3words = null;

  @JsonProperty("OSM")
  private ResponseOSM OSM = null;

  @JsonProperty("DMS")
  private ResponseDMS DMS = null;

  @JsonProperty("sun")
  private ResponseSun sun = null;

  @JsonProperty("UN_M49")
  private ResponseUNM49 un_M49 = null;

  @JsonProperty("Maidenhead")
  private String Maidenhead = null;

  @JsonProperty("callingcode")
  private Integer callingcode = null;

  @JsonProperty("qibla")
  private Double qibla = null;

  @JsonProperty("geohash")
  private String geohash = null;

  @JsonProperty("currency")
  private ResponseCurrency currency = null;

  @JsonProperty("roadinfo")
  private ResponseRoadinfo roadinfo = null;

  @JsonProperty("wikidata")
  private String wikidata = null;

  @JsonProperty("MGRS")
  private String MGRS = null;

  public ResponseAnnotations flag(String flag) {
    this.flag = flag;
    return this;
  }

   /**
   * Get flag
   * @return flag
  **/
  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

  public ResponseAnnotations Mercator(ResponseMercator Mercator) {
    this.Mercator = Mercator;
    return this;
  }

   /**
   * Get Mercator
   * @return Mercator
  **/
  public ResponseMercator getMercator() {
    return Mercator;
  }

  public void setMercator(ResponseMercator Mercator) {
    this.Mercator = Mercator;
  }

  public ResponseAnnotations timezone(ResponseTimezone timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  public ResponseTimezone getTimezone() {
    return timezone;
  }

  public void setTimezone(ResponseTimezone timezone) {
    this.timezone = timezone;
  }

  public ResponseAnnotations what3words(ResponseWhat3words what3words) {
    this.what3words = what3words;
    return this;
  }

   /**
   * Get what3words
   * @return what3words
  **/
  public ResponseWhat3words getWhat3words() {
    return what3words;
  }

  public void setWhat3words(ResponseWhat3words what3words) {
    this.what3words = what3words;
  }

  public ResponseAnnotations OSM(ResponseOSM OSM) {
    this.OSM = OSM;
    return this;
  }

   /**
   * Get OSM
   * @return OSM
  **/
  public ResponseOSM getOSM() {
    return OSM;
  }

  public void setOSM(ResponseOSM OSM) {
    this.OSM = OSM;
  }

  public ResponseAnnotations DMS(ResponseDMS DMS) {
    this.DMS = DMS;
    return this;
  }

   /**
   * Get DMS
   * @return DMS
  **/
  public ResponseDMS getDMS() {
    return DMS;
  }

  public void setDMS(ResponseDMS DMS) {
    this.DMS = DMS;
  }

  public ResponseAnnotations sun(ResponseSun sun) {
    this.sun = sun;
    return this;
  }

   /**
   * Get sun
   * @return sun
  **/
  public ResponseSun getSun() {
    return sun;
  }

  public void setSun(ResponseSun sun) {
    this.sun = sun;
  }

  public ResponseAnnotations un_M49(ResponseUNM49 un_M49) {
    this.un_M49 = un_M49;
    return this;
  }

   /**
   * Get un_M49
   * @return un_M49
  **/
  public ResponseUNM49 getUnM49() {
    return un_M49;
  }

  public void setUnM49(ResponseUNM49 un_M49) {
    this.un_M49 = un_M49;
  }

  public ResponseAnnotations Maidenhead(String Maidenhead) {
    this.Maidenhead = Maidenhead;
    return this;
  }

   /**
   * Get Maidenhead
   * @return Maidenhead
  **/
  public String getMaidenhead() {
    return Maidenhead;
  }

  public void setMaidenhead(String Maidenhead) {
    this.Maidenhead = Maidenhead;
  }

  public ResponseAnnotations callingcode(Integer callingcode) {
    this.callingcode = callingcode;
    return this;
  }

   /**
   * Get callingcode
   * @return callingcode
  **/
  public Integer getCallingcode() {
    return callingcode;
  }

  public void setCallingcode(Integer callingcode) {
    this.callingcode = callingcode;
  }

  public ResponseAnnotations qibla(Double qibla) {
    this.qibla = qibla;
    return this;
  }

   /**
   * Get qibla
   * @return qibla
  **/
  public Double getQibla() {
    return qibla;
  }

  public void setQibla(Double qibla) {
    this.qibla = qibla;
  }

  public ResponseAnnotations geohash(String geohash) {
    this.geohash = geohash;
    return this;
  }

   /**
   * Get geohash
   * @return geohash
  **/
  public String getGeohash() {
    return geohash;
  }

  public void setGeohash(String geohash) {
    this.geohash = geohash;
  }

  public ResponseAnnotations currency(ResponseCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  public ResponseCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(ResponseCurrency currency) {
    this.currency = currency;
  }

  public ResponseAnnotations roadinfo(ResponseRoadinfo roadinfo) {
    this.roadinfo = roadinfo;
    return this;
  }

   /**
   * Get roadinfo
   * @return roadinfo
  **/
  public ResponseRoadinfo getRoadinfo() {
    return roadinfo;
  }

  public void setRoadinfo(ResponseRoadinfo roadinfo) {
    this.roadinfo = roadinfo;
  }

  public ResponseAnnotations wikidata(String wikidata) {
    this.wikidata = wikidata;
    return this;
  }

   /**
   * Get wikidata
   * @return wikidata
  **/
  public String getWikidata() {
    return wikidata;
  }

  public void setWikidata(String wikidata) {
    this.wikidata = wikidata;
  }

  public ResponseAnnotations MGRS(String MGRS) {
    this.MGRS = MGRS;
    return this;
  }

   /**
   * Get MGRS
   * @return MGRS
  **/
  public String getMGRS() {
    return MGRS;
  }

  public void setMGRS(String MGRS) {
    this.MGRS = MGRS;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseAnnotations Response_annotations = (ResponseAnnotations) o;
    return Objects.equals(this.flag, Response_annotations.flag) &&
        Objects.equals(this.Mercator, Response_annotations.Mercator) &&
        Objects.equals(this.timezone, Response_annotations.timezone) &&
        Objects.equals(this.what3words, Response_annotations.what3words) &&
        Objects.equals(this.OSM, Response_annotations.OSM) &&
        Objects.equals(this.DMS, Response_annotations.DMS) &&
        Objects.equals(this.sun, Response_annotations.sun) &&
        Objects.equals(this.un_M49, Response_annotations.un_M49) &&
        Objects.equals(this.Maidenhead, Response_annotations.Maidenhead) &&
        Objects.equals(this.callingcode, Response_annotations.callingcode) &&
        Objects.equals(this.qibla, Response_annotations.qibla) &&
        Objects.equals(this.geohash, Response_annotations.geohash) &&
        Objects.equals(this.currency, Response_annotations.currency) &&
        Objects.equals(this.roadinfo, Response_annotations.roadinfo) &&
        Objects.equals(this.wikidata, Response_annotations.wikidata) &&
        Objects.equals(this.MGRS, Response_annotations.MGRS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flag, Mercator, timezone, what3words, OSM, DMS, sun, un_M49, Maidenhead, callingcode, qibla, geohash, currency, roadinfo, wikidata, MGRS);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseAnnotations {\n");
    
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("    Mercator: ").append(toIndentedString(Mercator)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    what3words: ").append(toIndentedString(what3words)).append("\n");
    sb.append("    OSM: ").append(toIndentedString(OSM)).append("\n");
    sb.append("    DMS: ").append(toIndentedString(DMS)).append("\n");
    sb.append("    sun: ").append(toIndentedString(sun)).append("\n");
    sb.append("    un_M49: ").append(toIndentedString(un_M49)).append("\n");
    sb.append("    Maidenhead: ").append(toIndentedString(Maidenhead)).append("\n");
    sb.append("    callingcode: ").append(toIndentedString(callingcode)).append("\n");
    sb.append("    qibla: ").append(toIndentedString(qibla)).append("\n");
    sb.append("    geohash: ").append(toIndentedString(geohash)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    roadinfo: ").append(toIndentedString(roadinfo)).append("\n");
    sb.append("    wikidata: ").append(toIndentedString(wikidata)).append("\n");
    sb.append("    MGRS: ").append(toIndentedString(MGRS)).append("\n");
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
