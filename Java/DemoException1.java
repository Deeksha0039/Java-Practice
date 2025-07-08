class DemoException1 {
    public void useException() throws ThePenguinException{
        String name="Penguin";
        if (name=="Penguin"){
            throw new ThePenguinException("This is my Exception");
        }
    }

public static void main (String args[]){
    DemoException1 de=new DemoException1();
    try{
        de.useException();
    }catch(Exception e){
        System.out.println(e);
    }
}
}
