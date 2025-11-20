package LEC10;

//down casting
//classes are used of previous program

public class Main3 {

        public static void main(){
            fish obj = new shark();
            obj.eat();
            shark obj1 = (shark)obj;
            obj1.kill();
        }
}
