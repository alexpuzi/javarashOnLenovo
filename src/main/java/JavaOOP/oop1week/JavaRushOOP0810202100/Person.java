package JavaOOP.oop1week.JavaRushOOP0810202100;

public class Person implements RepkaItem{

    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePadezh() {
        return namePadezh;
    }

    public void setNamePadezh(String namePadezh) {
        this.namePadezh = namePadezh;
    }
//    public void pull(Person p){
//        new Person(getName(),getNamePadezh());
//        System.out.println(p.getName() +" за " +  getNamePadezh());
//    }
    public void pull(Person second) {
        System.out.println(name + " за " + second.getNamePadezh());
    }
}
