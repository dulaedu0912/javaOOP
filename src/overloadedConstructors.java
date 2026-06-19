public class overloadedConstructors {

    String name;
    int id;
    String department;

    public overloadedConstructors(String name){
        this.name = name;
    }
    public overloadedConstructors(String name, int id){
        this.name = name;
        this.id = id;
    }
    public overloadedConstructors(String name, int id, String department){
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public void display(){
        System.out.println("Name : " + name);
        if (id != 0){
            System.out.println("Id : " + id);
        }
        if (department != null){
            System.out.println("Department : " + department);
        }
    }

    public static void main(String[] args) {
        overloadedConstructors a = new overloadedConstructors("NameOnly");
        overloadedConstructors b = new overloadedConstructors("NameAndIOnly", 1);
        overloadedConstructors c = new overloadedConstructors("Name", 2, "Engineering");

        a.display();
        b.display();
        c.display();
    }
}
