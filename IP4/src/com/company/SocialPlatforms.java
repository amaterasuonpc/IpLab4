package com.company;

public abstract class SocialPlatforms  {

  public String message;

  public String nameOfUser;

  public String emailAdress;

  public String getInformation() {
  return null;
  }

  public void getContentFromPlatfrom(String platformId) {
  }

  public void login(String name, String pass) {
    System.out.println("initialize login");
  }

  public void post() {
  }

}