public class ObjectConstructorClass {
    public static void main(String[] args) {
        //ObjectConstructorClass student = new ObjectConstructorClass();
        Student s1 = new Student(12, "radha", 90.9f);
        s1.setdetails(12, "Radha", 88.8f);

    }
}
     class Student{
        private int rollno ;
        private String name ;
        private float percentage;
        public  Student(int r,String n, float p){

        }
        public static void setdetails(int r, String n, float p){


        }
    }

