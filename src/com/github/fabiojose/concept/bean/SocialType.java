package com.github.fabiojose.concept.bean;

public class SocialType extends Pair<Integer, String> {
	private static final long serialVersionUID = 8406279285403559055L;

	public static final SocialType EMAIL = new SocialType(1, "E-mail");
	public static final SocialType FACEBOOK = new SocialType(2, "Facebook");
	
	public SocialType(){
		
	}
	
	public SocialType(final Integer code, final String content){
		setCode(code);
		setContent(content);
	}
}
