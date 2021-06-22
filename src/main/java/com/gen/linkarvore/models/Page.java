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

import org.hibernate.validator.constraints.UniqueElements;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "pages")
public class Page {

	@Id
	@GeneratedValue
	private long id;

	@NotBlank(message = "O campo Nome da Página precisa ser preenchido")
	@UniqueElements
	private String slug;

	@NotBlank(message = "O campo Cor da Fonte precisa ser preenchido")
	@Column(name = "op_font_color")
	private String opFontColor;

	@NotBlank(message = "O campo Tipo do Background precisa ser preenchido")
	@Column(name = "op_bg_type")
	private String opBgType;

	@NotBlank(message = "O campo Valor do Background precisa ser preenchido")
	@Column(name = "op_bg_value")
	private String opBgValue;

	@NotBlank(message = "O campo Imagem de Perfil precisa ser preenchido")
	@Column(name = "op_profile_image")
	private String opProfileImage;

	@NotBlank(message = "O campo Descrição precisa ser preenchido")
	@Column(name = "op_description")
	private String opDescription;

	@Column(name = "op_fb_pixel")
	private String opFbPixel;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@OneToMany(mappedBy = "page")
	private List<Link> links = new ArrayList<>();

	@OneToMany(mappedBy = "page")
	private List<View> views = new ArrayList<>();

	public Page() {
		super();
	}

	public Page(long id,
			@NotBlank(message = "O campo Nome da Página precisa ser preenchido") @UniqueElements String slug,
			@NotBlank(message = "O campo Cor da Fonte precisa ser preenchido") String opFontColor,
			@NotBlank(message = "O campo Tipo do Background precisa ser preenchido") String opBgType,
			@NotBlank(message = "O campo Valor do Background precisa ser preenchido") String opBgValue,
			@NotBlank(message = "O campo Imagem de Perfil precisa ser preenchido") String opProfileImage,
			@NotBlank(message = "O campo Descrição precisa ser preenchido") String opDescription, String opFbPixel,
			User user, List<Link> links, List<View> views) {
		super();
		this.id = id;
		this.slug = slug;
		this.opFontColor = opFontColor;
		this.opBgType = opBgType;
		this.opBgValue = opBgValue;
		this.opProfileImage = opProfileImage;
		this.opDescription = opDescription;
		this.opFbPixel = opFbPixel;
		this.user = user;
		this.links = links;
		this.views = views;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getOpFontColor() {
		return opFontColor;
	}

	public void setOpFontColor(String opFontColor) {
		this.opFontColor = opFontColor;
	}

	public String getOpBgType() {
		return opBgType;
	}

	public void setOpBgType(String opBgType) {
		this.opBgType = opBgType;
	}

	public String getOpBgValue() {
		return opBgValue;
	}

	public void setOpBgValue(String opBgValue) {
		this.opBgValue = opBgValue;
	}

	public String getOpProfileImage() {
		return opProfileImage;
	}

	public void setOpProfileImage(String opProfileImage) {
		this.opProfileImage = opProfileImage;
	}

	public String getOpDescription() {
		return opDescription;
	}

	public void setOpDescription(String opDescription) {
		this.opDescription = opDescription;
	}

	public String getOpFbPixel() {
		return opFbPixel;
	}

	public void setOpFbPixel(String opFbPixel) {
		this.opFbPixel = opFbPixel;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	public List<View> getViews() {
		return views;
	}

	public void setViews(List<View> views) {
		this.views = views;
	}

}
