class Car extends Vehicle{
    String Brand;

    Car(int wheels, String Brand){
        this.Brand=Brand;
        this.wheels=wheels;
    }

    void drive(){
        System.out.println("Brand of my car is " + Brand);
    }
}
