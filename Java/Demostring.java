class DemoString{
    public static void main(String args[]){
            String str1="MIET";
            String str2=new String("MIET");

            if(str1==str2){
                System.out.println("Same");
            }
            else{
                System.out.println("Not Same");
            }

            if(str1.equals(str2)){
                System.out.println("Same");
            }
            else{
                System.out.println("Not Same");
            }
    }
}
