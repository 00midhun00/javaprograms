class animal{
    String name;
    int age;
    String color;
    
    void show(){
       System.out.println("Name :"+name);
       System.out.println("Age :"+age);
       System.out.println("Color :"+color);
       
    }
    
    public static void main(String args[]){
          animal dog=new animal();
          animal bird=new animal();
          animal lion=new animal();
          
          dog.name="Dog";
          dog.age=18;
          dog.color="orange";
          
          bird.name="Bird";
          bird.age=5;
          bird.color="green";
          
          lion.name="Lion";
          lion.age=50;
          lion.color="orange";
          
          dog.show();
          bird.show();
          lion.show();
          
    
    }

}
