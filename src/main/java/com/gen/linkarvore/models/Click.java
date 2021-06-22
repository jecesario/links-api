package com.gen.linkarvore.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "clicks")
public class Click {

	@Id
	@GeneratedValue
	private long id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date click_date = new java.sql.Date(System.currentTimeMillis());

	@NotBlank
	private int total;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "link_id")
	private Link link;

	public Click() {
		super();
	}

	public Click(long id, Date click_date, @NotBlank int total, Link link) {
		super();
		this.id = id;
		this.click_date = click_date;
		this.total = total;
		this.link = link;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getClick_date() {
		return click_date;
	}

	public void setClick_date(Date click_date) {
		this.click_date = click_date;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Link getLink() {
		return link;
	}

	public void setLink(Link link) {
		this.link = link;
	}

}
