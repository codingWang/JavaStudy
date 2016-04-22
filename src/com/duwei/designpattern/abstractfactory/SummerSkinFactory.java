package com.duwei.designpattern.abstractfactory;

//Summer皮肤工厂：具体工厂  
class SummerSkinFactory implements SkinFactory {  
  public Button createButton() {  
      return new SummerButton();  
  }  

  public TextField createTextField() {  
      return new SummerTextField();  
  }  

  public ComboBox createComboBox() {  
      return new SummerComboBox();  
  }  
}  