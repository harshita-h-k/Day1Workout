class Student{
    int id;
    String name;
    void display()
    {
        System.out.println(id+""+name);
    }
    
}

class StudMain{
        public static void main(String[] args)
        {
            cons S1 = new cons();
            S1.id=101;
            S1.name="XYZ";
            S1.display();
            cons S2 = new cons();
            S2.id=102;
            S2.name="TCE";
            S2.display();
        }
}
