package pe.com.peruInka.core.domain;

import java.io.Serializable;

import org.hibernate.type.DateType;

public class Customer extends BaseEntity implements Serializable {
	 */
		private static final long serialVersionUID = 1L;
		private String interpriceId;
		private String personId;
		private String status;
		private String createdBy;
		public String getInterpriceId() {
			return interpriceId;
		}
		public void setInterpriceId(String interpriceId) {
			this.interpriceId = interpriceId;
		}
		public String getPersonId() {
			return personId;
		}
		public void setPersonId(String personId) {
			this.personId = personId;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getCreatedBy() {
			return createdBy;
		}
		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}
		public DateType getCreated() {
			return Created;
		}
		public void setCreated(DateType created) {
			Created = created;
		}
		public DateType getDatelastUpdate() {
			return datelastUpdate;
		}
		public void setDatelastUpdate(DateType datelastUpdate) {
			this.datelastUpdate = datelastUpdate;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		private DateType Created;
		private DateType datelastUpdate;
//		private String typeDocument;
//		private String statusPerson;
//		private TypeDocument typeDocument;
//		private StatusPerson statusPerson;

	

}
