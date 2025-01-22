package com.caiosoares.dslist.projections;

public interface GameMiniProjection {
	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
}
