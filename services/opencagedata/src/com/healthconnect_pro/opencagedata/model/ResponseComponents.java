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
import java.util.ArrayList;
import java.util.List;
/**
 * ResponseComponents
 */

public class ResponseComponents {
  @JsonProperty("continent")
  private String continent = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("shop")
  private String shop = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("county")
  private String county = null;

  @JsonProperty("house_number")
  private String house_number = null;

  @JsonProperty("building")
  private String building = null;

  @JsonProperty("road")
  private String road = null;

  @JsonProperty("neighbourhood")
  private String neighbourhood = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("railway")
  private String railway = null;

  @JsonProperty("village")
  private String village = null;

  @JsonProperty("city_district")
  private String city_district = null;

  @JsonProperty("restaurant")
  private String restaurant = null;

  @JsonProperty("_type")
  private String _type = null;

  @JsonProperty("postcode")
  private String postcode = null;

  @JsonProperty("ISO_3166-1_alpha-2")
  private String isO_3166_1_alpha_2 = null;

  @JsonProperty("ISO_3166-1_alpha-3")
  private String isO_3166_1_alpha_3 = null;

  @JsonProperty("water")
  private String water = null;

  @JsonProperty("country_code")
  private String country_code = null;

  @JsonProperty("residential")
  private String residential = null;

  @JsonProperty("state_district")
  private String state_district = null;

  @JsonProperty("subdistrict")
  private String subdistrict = null;

  @JsonProperty("suburb")
  private String suburb = null;

  @JsonProperty("_category")
  private String _category = null;

  @JsonProperty("ISO_3166-2")
  private List<String> isO_3166_2 = new ArrayList<>();

  @JsonProperty("state_code")
  private String state_code = null;

  @JsonProperty("quarter")
  private String quarter = null;

  public ResponseComponents continent(String continent) {
    this.continent = continent;
    return this;
  }

   /**
   * Get continent
   * @return continent
  **/
  public String getContinent() {
    return continent;
  }

  public void setContinent(String continent) {
    this.continent = continent;
  }

  public ResponseComponents country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public ResponseComponents shop(String shop) {
    this.shop = shop;
    return this;
  }

   /**
   * Get shop
   * @return shop
  **/
  public String getShop() {
    return shop;
  }

  public void setShop(String shop) {
    this.shop = shop;
  }

  public ResponseComponents city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ResponseComponents county(String county) {
    this.county = county;
    return this;
  }

   /**
   * Get county
   * @return county
  **/
  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public ResponseComponents house_number(String house_number) {
    this.house_number = house_number;
    return this;
  }

   /**
   * Get house_number
   * @return house_number
  **/
  public String getHouseNumber() {
    return house_number;
  }

  public void setHouseNumber(String house_number) {
    this.house_number = house_number;
  }

  public ResponseComponents building(String building) {
    this.building = building;
    return this;
  }

   /**
   * Get building
   * @return building
  **/
  public String getBuilding() {
    return building;
  }

  public void setBuilding(String building) {
    this.building = building;
  }

  public ResponseComponents road(String road) {
    this.road = road;
    return this;
  }

   /**
   * Get road
   * @return road
  **/
  public String getRoad() {
    return road;
  }

  public void setRoad(String road) {
    this.road = road;
  }

  public ResponseComponents neighbourhood(String neighbourhood) {
    this.neighbourhood = neighbourhood;
    return this;
  }

   /**
   * Get neighbourhood
   * @return neighbourhood
  **/
  public String getNeighbourhood() {
    return neighbourhood;
  }

  public void setNeighbourhood(String neighbourhood) {
    this.neighbourhood = neighbourhood;
  }

  public ResponseComponents state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ResponseComponents railway(String railway) {
    this.railway = railway;
    return this;
  }

   /**
   * Get railway
   * @return railway
  **/
  public String getRailway() {
    return railway;
  }

  public void setRailway(String railway) {
    this.railway = railway;
  }

  public ResponseComponents village(String village) {
    this.village = village;
    return this;
  }

   /**
   * Get village
   * @return village
  **/
  public String getVillage() {
    return village;
  }

  public void setVillage(String village) {
    this.village = village;
  }

  public ResponseComponents city_district(String city_district) {
    this.city_district = city_district;
    return this;
  }

   /**
   * Get city_district
   * @return city_district
  **/
  public String getCityDistrict() {
    return city_district;
  }

  public void setCityDistrict(String city_district) {
    this.city_district = city_district;
  }

  public ResponseComponents restaurant(String restaurant) {
    this.restaurant = restaurant;
    return this;
  }

   /**
   * Get restaurant
   * @return restaurant
  **/
  public String getRestaurant() {
    return restaurant;
  }

  public void setRestaurant(String restaurant) {
    this.restaurant = restaurant;
  }

  public ResponseComponents _type(String _type) {
    this._type = _type;
    return this;
  }

   /**
   * Get _type
   * @return _type
  **/
  public String getType() {
    return _type;
  }

  public void setType(String _type) {
    this._type = _type;
  }

  public ResponseComponents postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

   /**
   * Get postcode
   * @return postcode
  **/
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public ResponseComponents isO_3166_1_alpha_2(String isO_3166_1_alpha_2) {
    this.isO_3166_1_alpha_2 = isO_3166_1_alpha_2;
    return this;
  }

   /**
   * Get isO_3166_1_alpha_2
   * @return isO_3166_1_alpha_2
  **/
  public String getIsO31661Alpha2() {
    return isO_3166_1_alpha_2;
  }

  public void setIsO31661Alpha2(String isO_3166_1_alpha_2) {
    this.isO_3166_1_alpha_2 = isO_3166_1_alpha_2;
  }

  public ResponseComponents isO_3166_1_alpha_3(String isO_3166_1_alpha_3) {
    this.isO_3166_1_alpha_3 = isO_3166_1_alpha_3;
    return this;
  }

   /**
   * Get isO_3166_1_alpha_3
   * @return isO_3166_1_alpha_3
  **/
  public String getIsO31661Alpha3() {
    return isO_3166_1_alpha_3;
  }

  public void setIsO31661Alpha3(String isO_3166_1_alpha_3) {
    this.isO_3166_1_alpha_3 = isO_3166_1_alpha_3;
  }

  public ResponseComponents water(String water) {
    this.water = water;
    return this;
  }

   /**
   * Get water
   * @return water
  **/
  public String getWater() {
    return water;
  }

  public void setWater(String water) {
    this.water = water;
  }

  public ResponseComponents country_code(String country_code) {
    this.country_code = country_code;
    return this;
  }

   /**
   * Get country_code
   * @return country_code
  **/
  public String getCountryCode() {
    return country_code;
  }

  public void setCountryCode(String country_code) {
    this.country_code = country_code;
  }

  public ResponseComponents residential(String residential) {
    this.residential = residential;
    return this;
  }

   /**
   * Get residential
   * @return residential
  **/
  public String getResidential() {
    return residential;
  }

  public void setResidential(String residential) {
    this.residential = residential;
  }

  public ResponseComponents state_district(String state_district) {
    this.state_district = state_district;
    return this;
  }

   /**
   * Get state_district
   * @return state_district
  **/
  public String getStateDistrict() {
    return state_district;
  }

  public void setStateDistrict(String state_district) {
    this.state_district = state_district;
  }

  public ResponseComponents subdistrict(String subdistrict) {
    this.subdistrict = subdistrict;
    return this;
  }

   /**
   * Get subdistrict
   * @return subdistrict
  **/
  public String getSubdistrict() {
    return subdistrict;
  }

  public void setSubdistrict(String subdistrict) {
    this.subdistrict = subdistrict;
  }

  public ResponseComponents suburb(String suburb) {
    this.suburb = suburb;
    return this;
  }

   /**
   * Get suburb
   * @return suburb
  **/
  public String getSuburb() {
    return suburb;
  }

  public void setSuburb(String suburb) {
    this.suburb = suburb;
  }

  public ResponseComponents _category(String _category) {
    this._category = _category;
    return this;
  }

   /**
   * Get _category
   * @return _category
  **/
  public String getCategory() {
    return _category;
  }

  public void setCategory(String _category) {
    this._category = _category;
  }

  public ResponseComponents isO_3166_2(List<String> isO_3166_2) {
    this.isO_3166_2 = isO_3166_2;
    return this;
  }

  public ResponseComponents addIsO31662Item(String isO_3166_2Item) {
    this.isO_3166_2.add(isO_3166_2Item);
    return this;
  }

   /**
   * Get isO_3166_2
   * @return isO_3166_2
  **/
  public List<String> getIsO31662() {
    return isO_3166_2;
  }

  public void setIsO31662(List<String> isO_3166_2) {
    this.isO_3166_2 = isO_3166_2;
  }

  public ResponseComponents state_code(String state_code) {
    this.state_code = state_code;
    return this;
  }

   /**
   * Get state_code
   * @return state_code
  **/
  public String getStateCode() {
    return state_code;
  }

  public void setStateCode(String state_code) {
    this.state_code = state_code;
  }

  public ResponseComponents quarter(String quarter) {
    this.quarter = quarter;
    return this;
  }

   /**
   * Get quarter
   * @return quarter
  **/
  public String getQuarter() {
    return quarter;
  }

  public void setQuarter(String quarter) {
    this.quarter = quarter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseComponents Response_components = (ResponseComponents) o;
    return Objects.equals(this.continent, Response_components.continent) &&
        Objects.equals(this.country, Response_components.country) &&
        Objects.equals(this.shop, Response_components.shop) &&
        Objects.equals(this.city, Response_components.city) &&
        Objects.equals(this.county, Response_components.county) &&
        Objects.equals(this.house_number, Response_components.house_number) &&
        Objects.equals(this.building, Response_components.building) &&
        Objects.equals(this.road, Response_components.road) &&
        Objects.equals(this.neighbourhood, Response_components.neighbourhood) &&
        Objects.equals(this.state, Response_components.state) &&
        Objects.equals(this.railway, Response_components.railway) &&
        Objects.equals(this.village, Response_components.village) &&
        Objects.equals(this.city_district, Response_components.city_district) &&
        Objects.equals(this.restaurant, Response_components.restaurant) &&
        Objects.equals(this._type, Response_components._type) &&
        Objects.equals(this.postcode, Response_components.postcode) &&
        Objects.equals(this.isO_3166_1_alpha_2, Response_components.isO_3166_1_alpha_2) &&
        Objects.equals(this.isO_3166_1_alpha_3, Response_components.isO_3166_1_alpha_3) &&
        Objects.equals(this.water, Response_components.water) &&
        Objects.equals(this.country_code, Response_components.country_code) &&
        Objects.equals(this.residential, Response_components.residential) &&
        Objects.equals(this.state_district, Response_components.state_district) &&
        Objects.equals(this.subdistrict, Response_components.subdistrict) &&
        Objects.equals(this.suburb, Response_components.suburb) &&
        Objects.equals(this._category, Response_components._category) &&
        Objects.equals(this.isO_3166_2, Response_components.isO_3166_2) &&
        Objects.equals(this.state_code, Response_components.state_code) &&
        Objects.equals(this.quarter, Response_components.quarter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(continent, country, shop, city, county, house_number, building, road, neighbourhood, state, railway, village, city_district, restaurant, _type, postcode, isO_3166_1_alpha_2, isO_3166_1_alpha_3, water, country_code, residential, state_district, subdistrict, suburb, _category, isO_3166_2, state_code, quarter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseComponents {\n");
    
    sb.append("    continent: ").append(toIndentedString(continent)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    shop: ").append(toIndentedString(shop)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    house_number: ").append(toIndentedString(house_number)).append("\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    road: ").append(toIndentedString(road)).append("\n");
    sb.append("    neighbourhood: ").append(toIndentedString(neighbourhood)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    railway: ").append(toIndentedString(railway)).append("\n");
    sb.append("    village: ").append(toIndentedString(village)).append("\n");
    sb.append("    city_district: ").append(toIndentedString(city_district)).append("\n");
    sb.append("    restaurant: ").append(toIndentedString(restaurant)).append("\n");
    sb.append("    _type: ").append(toIndentedString(_type)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    isO_3166_1_alpha_2: ").append(toIndentedString(isO_3166_1_alpha_2)).append("\n");
    sb.append("    isO_3166_1_alpha_3: ").append(toIndentedString(isO_3166_1_alpha_3)).append("\n");
    sb.append("    water: ").append(toIndentedString(water)).append("\n");
    sb.append("    country_code: ").append(toIndentedString(country_code)).append("\n");
    sb.append("    residential: ").append(toIndentedString(residential)).append("\n");
    sb.append("    state_district: ").append(toIndentedString(state_district)).append("\n");
    sb.append("    subdistrict: ").append(toIndentedString(subdistrict)).append("\n");
    sb.append("    suburb: ").append(toIndentedString(suburb)).append("\n");
    sb.append("    _category: ").append(toIndentedString(_category)).append("\n");
    sb.append("    isO_3166_2: ").append(toIndentedString(isO_3166_2)).append("\n");
    sb.append("    state_code: ").append(toIndentedString(state_code)).append("\n");
    sb.append("    quarter: ").append(toIndentedString(quarter)).append("\n");
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
