package pe.com.peruInka.core.domain;

import org.hibernate.type.DateType;

public class Ticket extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private DateType dateIni;
	private DateType dateEn;
	private DateType customerId;
	private DateType  createdBy;
	private DateType dateCreated;
	public DateType getDateIni() {
		return dateIni;
	}
	public void setDateIni(DateType dateIni) {
		this.dateIni = dateIni;
	}
	public DateType getDateEn() {
		return dateEn;
	}
	public void setDateEn(DateType dateEn) {
		this.dateEn = dateEn;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public DateType getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(DateType dateCreated) {
		this.dateCreated = dateCreated;
	}
	public DateType getDateLastUpdated() {
		return dateLastUpdated;
	}
	public void setDateLastUpdated(DateType dateLastUpdated) {
		this.dateLastUpdated = dateLastUpdated;
	}
	public DateType getLastUpdatedBy() {
		return LastUpdatedBy;
	}
	public void setLastUpdatedBy(DateType lastUpdatedBy) {
		LastUpdatedBy = lastUpdatedBy;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	private DateType dateLastUpdated;
	private DateType LastUpdatedBy;
	private String version;
	public static long getSerialversionuid() {
		return serialVersionUID;

}
