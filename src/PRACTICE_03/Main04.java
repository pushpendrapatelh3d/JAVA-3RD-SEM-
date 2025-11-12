package PRACTICE_03;

public class Main04 {
    static class Employee{
        String name;
        String id;
        float Salary;

        void Disp(){
            System.out.println("Name :"+this.name);
            System.out.println("ID :"+this.id);
            System.out.println("Salary :"+this.Salary);
        }

        void increment(){
            float isalary = (float)(Salary + ((Salary*5)/100));
            System.out.println("Name :"+this.name);
            System.out.println("ID :"+this.id);
            System.out.println("Salary after incrementation :"+isalary);
        }

    }
    public static void main(){
        Employee obj = new Employee();
        obj.name="Harry";
        obj.id="ID2026-1234";
        obj.Salary=60000f;
        obj.Disp();
        obj.increment();

    }
}


