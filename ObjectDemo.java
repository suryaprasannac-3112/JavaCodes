class Add{
    int a;
    int b;
    Add(int a, int b){
        this.a = a;
        this.b = b;
    }
    void sum(){
        System.out.println("The sum is: " + (a+b));
    }
}


public class ObjectDemo {
    public static void main(String[] args){
        Add obj = new Add(5, 10);
        obj.sum();
    }
}