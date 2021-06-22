package com.gen.linkarvore.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "links")
public class Link {

	@Id
	@GeneratedValue
	private long id;

	@NotBlank(message = "O campo Status precisa ser preenchido")
	private int status;

	@NotBlank(message = "O campo Ordem precisa ser preenchido")
	@Column(name = "link_order")
	private int order;

	@NotBlank(message = "O campo Título precisa ser preenchido")
	private String title;

	@NotBlank(message = "O campo Link precisa ser preenchido")
	private String href;

	@NotBlank(message = "O campo Cor de Fundo precisa ser preenchido")
	@Column(name = "op_bg_color")
	private String opBgColor;

	@NotBlank(message = "O campo Cor do Texto precisa ser preenchido")
	@Column(name = "op_text_color")
	private String opTextColor;

	@Column(name = "op_border_color")
	@NotBlank(message = "O campo Tipo de Borda precisa ser preenchido")
	private String opBorderType;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "page_id")
	private Page page;

	@OneToMany(mappedBy = "link")
	private List<Click> clicks = new ArrayList<>();

	public Link() {
		super();
	}

	public Link(long id, @NotBlank(message = "O campo Status precisa ser preenchido") int status,
			@NotBlank(message = "O campo Ordem precisa ser preenchido") int order,
			@NotBlank(message = "O campo Título precisa ser preenchido") String title,
			@NotBlank(message = "O campo Link precisa ser preenchido") String href,
			@NotBlank(message = "O campo Cor de Fundo precisa ser preenchido") String opBgColor,
			@NotBlank(message = "O campo Cor do Texto precisa ser preenchido") String opTextColor,
			@NotBlank(message = "O campo Tipo de Borda precisa ser preenchido") String opBorderType, Page page,
			List<Click> clicks) {
		super();
		this.id = id;
		this.status = status;
		this.order = order;
		this.title = title;
		this.href = href;
		this.opBgColor = opBgColor;
		this.opTextColor = opTextColor;
		this.opBorderType = opBorderType;
		this.page = page;
		this.clicks = clicks;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getOpBgColor() {
		return opBgColor;
	}

	public void setOpBgColor(String opBgColor) {
		this.opBgColor = opBgColor;
	}

	public String getOpTextColor() {
		return opTextColor;
	}

	public void setOpTextColor(String opTextColor) {
		this.opTextColor = opTextColor;
	}

	public String getOpBorderType() {
		return opBorderType;
	}

	public void setOpBorderType(String opBorderType) {
		this.opBorderType = opBorderType;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public List<Click> getClicks() {
		return clicks;
	}

	public void setClicks(List<Click> clicks) {
		this.clicks = clicks;
	}

}
