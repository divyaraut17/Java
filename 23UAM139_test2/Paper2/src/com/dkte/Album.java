package com.dkte;
import java.util.Scanner;
public class Album {
   private int album_id;
   private String title;
   
   public Album() {
  
   }

   public Album(int album_id, String title) {
	super();
	this.album_id = album_id;
	this.title = title;
   }

   public int getAlbum_id() {
	return album_id;
   }

   public void setAlbum_id(int album_id) {
	this.album_id = album_id;
   }

   public String getTitle() {
	return title;
   }

   public void setTitle(String title) {
	this.title = title;
   }

   @Override
   public String toString() {
	return "Album [album_id=" + album_id + ", title=" + title + "]";
   }
   public void accept(Scanner sc) {
	   System.out.println("Enter Album Id:");
	   album_id=sc.nextInt();
	   System.out.println("Enter Title:");
	   title=sc.next();
	   }
}
