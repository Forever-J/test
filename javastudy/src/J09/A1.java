package J09;

public class A1 extends  Apple<String>{
    public String getInfo(){
        return "子类"+super.getInfo();
    }

    public static void main(String[] args) {
        A1 a=new A1();
        System.out.println(a.getInfo());
    }
}
