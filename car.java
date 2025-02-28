class car{
    String brand;
    int year;
    
   void display(){
         System.out.println("brand="+brand);
         System.out.println("year="+year);
    }
    
    public static void main(String args[]){
             car c1=new car();
             c1.brand="suzuki";
             c1.year=2000;
             
    }
    

}
