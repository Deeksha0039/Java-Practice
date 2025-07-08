class DemoException {
    public static void main(String args[]) {
        try {
            System.out.println("First Line");
            int result = 5 / 10;
            System.out.println("Third Line");
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e);
        } finally {
            System.out.println("I am in final block");
        }
    }
}

