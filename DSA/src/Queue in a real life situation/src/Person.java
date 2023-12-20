public class Person {

    private boolean pregnant = false;
    private String name;
    private int age;
    private boolean pwd = false;
    boolean isPregnant(){
        return pregnant;
    }
    private String healthStatus;
    public Person(String name, int age, int status){
        setName(name);
        setAge(age);
        if(status == 1) this.healthStatus = "Normal";
        else if(status == 2) {
            setPregnant(true);
            this.healthStatus = "Pregnant";
        }
        else if(status == 3) {
            setPwd(true);
            this.healthStatus = "PWD";}
    }
    public void setPregnant(boolean preg) {
        this.pregnant = preg;
    }

    public boolean isPwd() {
        return pwd;
    }

    public void setPwd(boolean pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

}
