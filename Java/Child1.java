class Child1 extends Parent1 {
    public Child1 (String message){
        super(message);
        System.out.println("Child's Constructor is called");
    }

    public static void main(String args[]){
        Child1 c=new Child1(" Hiee mee ");
    }
}
