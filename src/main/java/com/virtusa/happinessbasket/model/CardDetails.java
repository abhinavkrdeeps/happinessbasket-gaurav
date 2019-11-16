package com.virtusa.happinessbasket.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name="carddetails")
public class CardDetails {
@Id@GeneratedValue(strategy=GenerationType.TABLE)
private int cardId;
private String cardNo;
private String ExpDate;
@Transient
private int cvv;
private int customerId;
////@OneToOne(cascade=CascadeType.ALL)
//private Payment payement;
public int getCardId() {
	return cardId;
}
public void setCardId(int cardId) {
	this.cardId = cardId;
}
public String getCardNo() {
	return cardNo;
}
public void setCardNo(String cardNo) {
	this.cardNo = cardNo;
}
public String getExpDate() {
	return ExpDate;
}
public void setExpDate(String expDate) {
	ExpDate = expDate;
}

public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
@Override
public String toString() {
	return "CardDetails [cardId=" + cardId + ", cardNo=" + cardNo + ", ExpDate=" + ExpDate + ", userId=" + customerId + "]";
}
public int getCvv() {
	return cvv;
}
public void setCvv(int cvv) {
	this.cvv = cvv;
}


}
