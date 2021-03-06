package cn.edu.fudan.ss.xulvcai.fdubbs.api.restful.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * error
 * <p>
 * Details of an Error
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({ "name", "message", "information_link", "details" })
public class Error {

	/**
	 * Human readable, unique name of the error. (Required)
	 * 
	 */
	@JsonProperty("name")
	private String name;
	/**
	 * Message describing the error. (Required)
	 * 
	 */
	@JsonProperty("message")
	private String message;
	/**
	 * URI for detailed information related to this error for the developer.
	 * (Required)
	 * 
	 */
	@JsonProperty("information_link")
	private String informationLink;
	/**
	 * Additional details of the error
	 * 
	 */
	@JsonProperty("details")
	private List<Detail> details = new ArrayList<Detail>();
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Human readable, unique name of the error. (Required)
	 * 
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 * Human readable, unique name of the error. (Required)
	 * 
	 */
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	public Error withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Message describing the error. (Required)
	 * 
	 */
	@JsonProperty("message")
	public String getMessage() {
		return message;
	}

	/**
	 * Message describing the error. (Required)
	 * 
	 */
	@JsonProperty("message")
	public void setMessage(String message) {
		this.message = message;
	}

	public Error withMessage(String message) {
		this.message = message;
		return this;
	}

	/**
	 * URI for detailed information related to this error for the developer.
	 * (Required)
	 * 
	 */
	@JsonProperty("information_link")
	public String getInformationLink() {
		return informationLink;
	}

	/**
	 * URI for detailed information related to this error for the developer.
	 * (Required)
	 * 
	 */
	@JsonProperty("information_link")
	public void setInformationLink(String informationLink) {
		this.informationLink = informationLink;
	}

	public Error withInformationLink(String informationLink) {
		this.informationLink = informationLink;
		return this;
	}

	/**
	 * Additional details of the error
	 * 
	 */
	@JsonProperty("details")
	public List<Detail> getDetails() {
		return details;
	}

	/**
	 * Additional details of the error
	 * 
	 */
	@JsonProperty("details")
	public void setDetails(List<Detail> details) {
		this.details = details;
	}

	public Error withDetails(List<Detail> details) {
		this.details = details;
		return this;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public boolean equals(Object other) {
		return EqualsBuilder.reflectionEquals(this, other);
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperties(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
