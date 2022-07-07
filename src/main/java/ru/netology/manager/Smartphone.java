package ru.netology.manager;

 class Smartphone extends Product {
  //private String title;
  private String manufacturer;

  public Smartphone(int id, String title, int cost,String manufacturer) {
   super(id, title, cost);
   this.manufacturer=manufacturer;
  }
 }
