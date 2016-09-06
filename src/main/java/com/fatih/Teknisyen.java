package com.fatih;
public class Teknisyen {
	
	private String ad="ali";
	private String soyad="can";
	private int yas=25;
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}
	
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	public int getYas() {
		return yas;
	}
	
	public void setYas(int yas) {
		this.yas = yas;
	}

	@Override
	public String toString() {
		return "Teknisyen [ad=" + ad + ", soyad=" + soyad + ", yas=" + yas + "]";
	}
	
	
	

}
