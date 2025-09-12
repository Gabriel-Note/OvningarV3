public class Exercise1_3 {
    String name;
    int age;

    public Exercise1_3 (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getFullPresentation(){
        return "Ditt namn är " + getName() + " och du är " + getAge() + " år gammal";
    }
}
