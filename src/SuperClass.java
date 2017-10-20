abstract class SuperClass {  
    private int number;  
  
  
    public SuperClass() {  
          
    }  
  
  
    public SuperClass(int number) {  
        this.number = number;  
    //	number=0;
    }  
  
 
    public int getNumber() {  
        number++;  
        return number;  
    }  
}  
  
class SubClass1 extends SuperClass {  
    public SubClass1(int number) {  
        
    }  
  
}  
  
class SubClass2 extends SuperClass {  
    private int number;  
  
  
    public SubClass2(int number) {  
        super(number);  
        this.number=number;
    }  
  
}  