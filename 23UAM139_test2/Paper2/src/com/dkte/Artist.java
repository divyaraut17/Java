package com.dkte;
import java.util.Scanner;

public class Artist {
   private int artist_id;
   private String name;
   
   public Artist() {
	   
   }
   public Artist(int artist_id, String name) {
	
	this.artist_id = artist_id;
	this.name = name;
   }
   public int getArtist_id() {
	return artist_id;
   }
   public void setArtist_id(int artist_id) {
	this.artist_id = artist_id;
   }
   public String getName() {
	return name;
   }
   public void setName(String name) {
	this.name = name;
   }
   @Override
   public String toString() {
	return "Artist [artist_id=" + artist_id + ", name=" + name + "]";
   }
   
   public void accpet(Scanner sc) {
	  System.out.println("Enter Artist ID :");
	  artist_id=sc.nextInt();
	  System.out.println("Enter Nmae:");
	  name=sc.next();
   }
}
