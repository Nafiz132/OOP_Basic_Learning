
package polymorphism;

 class Rectangle extends Shape{
    double lenght,width;
    
    Rectangle(double lenght,double width){
        this.lenght=lenght;
        this.width=width;
    }
    
    double area(){
        System.out.print("Area of rectangle : ");
        return lenght*width;
    }
}
