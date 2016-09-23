package com.supermark.entity;

import javax.persistence.Entity;

@Entity
public class Provider {

	private Integer id;
	private String cName;
	private String address;
	private String linkman;
	private String linkPhone;
	private String faxes;
	private String postNum;
	private String bankNum;
	private String netAddress;
	private String emailAddress;
	private String remark;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLinkman() {
		return linkman;
	}
	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}
	public String getLinkPhone() {
		return linkPhone;
	}
	public void setLinkPhone(String linkPhone) {
		this.linkPhone = linkPhone;
	}
	public String getFaxes() {
		return faxes;
	}
	public void setFaxes(String faxes) {
		this.faxes = faxes;
	}
	public String getPostNum() {
		return postNum;
	}
	public void setPostNum(String postNum) {
		this.postNum = postNum;
	}
	public String getBankNum() {
		return bankNum;
	}
	public void setBankNum(String bankNum) {
		this.bankNum = bankNum;
	}
	public String getNetAddress() {
		return netAddress;
	}
	public void setNetAddress(String netAddress) {
		this.netAddress = netAddress;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((bankNum == null) ? 0 : bankNum.hashCode());
		result = prime * result + ((cName == null) ? 0 : cName.hashCode());
		result = prime * result + ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result + ((faxes == null) ? 0 : faxes.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((linkPhone == null) ? 0 : linkPhone.hashCode());
		result = prime * result + ((linkman == null) ? 0 : linkman.hashCode());
		result = prime * result + ((netAddress == null) ? 0 : netAddress.hashCode());
		result = prime * result + ((postNum == null) ? 0 : postNum.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Provider other = (Provider) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (bankNum == null) {
			if (other.bankNum != null)
				return false;
		} else if (!bankNum.equals(other.bankNum))
			return false;
		if (cName == null) {
			if (other.cName != null)
				return false;
		} else if (!cName.equals(other.cName))
			return false;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		if (faxes == null) {
			if (other.faxes != null)
				return false;
		} else if (!faxes.equals(other.faxes))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (linkPhone == null) {
			if (other.linkPhone != null)
				return false;
		} else if (!linkPhone.equals(other.linkPhone))
			return false;
		if (linkman == null) {
			if (other.linkman != null)
				return false;
		} else if (!linkman.equals(other.linkman))
			return false;
		if (netAddress == null) {
			if (other.netAddress != null)
				return false;
		} else if (!netAddress.equals(other.netAddress))
			return false;
		if (postNum == null) {
			if (other.postNum != null)
				return false;
		} else if (!postNum.equals(other.postNum))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Provider [id=" + id + ", cName=" + cName + ", address=" + address + ", linkman=" + linkman
				+ ", linkPhone=" + linkPhone + ", faxes=" + faxes + ", postNum=" + postNum + ", bankNum=" + bankNum
				+ ", netAddress=" + netAddress + ", emailAddress=" + emailAddress + ", remark=" + remark + "]";
	}
	
	
}
