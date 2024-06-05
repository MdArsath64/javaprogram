package Abstraction;

// import javapackages.pack1;

public class InnerClass {
    public static void main(String[] args) {
        AbstractClass ac=new AbstractClass(){
            void show1(){
                System.out.println("from show 1");
            }
            void show2(){
                System.out.println("from show 2");
            }
        };
        ac.show1();
        ac.show2();
        // pack1 p=new pack1();//packages implementation from the packages folder and import
	// 	p.add(5,10);
     }
}
