package com.caiosoares.dslist.dto;

import com.caiosoares.dslist.entities.Game;
import com.caiosoares.dslist.projections.GameMiniProjection;

public class GameMiniDTO {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMiniDTO() {
		
	}

	public GameMiniDTO(Game entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
	}
	
	public GameMiniDTO(GameMiniProjection projection) {
		this.id = projection.getId();
		this.title = projection.getTitle();
		this.year = projection.getYear();
		this.imgUrl = projection.getImgUrl();
		this.shortDescription = projection.getShortDescription();
	}	

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
}
