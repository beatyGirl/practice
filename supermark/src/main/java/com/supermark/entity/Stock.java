package com.supermark.entity;

import javax.persistence.Entity;

@Entity
public class Stock {

	private Integer id;
	private String sName;
	private String orderId;
	private String consignmengDate;
	private String baleName;
	private String count;
	private float money;
	private String lairage;


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getConsignmengDate() {
		return consignmengDate;
	}
	public void setConsignmengDate(String consignmengDate) {
		this.consignmengDate = consignmengDate;
	}
	public String getBaleName() {
		return baleName;
	}
	public void setBaleName(String baleName) {
		this.baleName = baleName;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public String getLairage() {
		return lairage;
	}
	public void setLairage(String lairage) {
		this.lairage = lairage;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((baleName == null) ? 0 : baleName.hashCode());
		result = prime * result + ((consignmengDate == null) ? 0 : consignmengDate.hashCode());
		result = prime * result + ((count == null) ? 0 : count.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lairage == null) ? 0 : lairage.hashCode());
		result = prime * result + Float.floatToIntBits(money);
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((sName == null) ? 0 : sName.hashCode());
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
		Stock other = (Stock) obj;
		if (baleName == null) {
			if (other.baleName != null)
				return false;
		} else if (!baleName.equals(other.baleName))
			return false;
		if (consignmengDate == null) {
			if (other.consignmengDate != null)
				return false;
		} else if (!consignmengDate.equals(other.consignmengDate))
			return false;
		if (count == null) {
			if (other.count != null)
				return false;
		} else if (!count.equals(other.count))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lairage == null) {
			if (other.lairage != null)
				return false;
		} else if (!lairage.equals(other.lairage))
			return false;
		if (Float.floatToIntBits(money) != Float.floatToIntBits(other.money))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (sName == null) {
			if (other.sName != null)
				return false;
		} else if (!sName.equals(other.sName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Stock [id=" + id + ", sName=" + sName + ", orderId=" + orderId + ", consignmengDate=" + consignmengDate
				+ ", baleName=" + baleName + ", count=" + count + ", money=" + money + ", lairage=" + lairage + "]";
	}
	
	
}
