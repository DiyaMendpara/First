public class dog{
    
    String dname;
    String breed;
    dog(String dname, String breed)
    {
        this.dname=dname;
        this.breed=breed;
        System.out.println("___________________________________________");
        System.out.println("Dog Name : "+dname);
        System.out.println("Dog Breed : "+breed);
    }

    public void setter(){
           dname="Lucifer";
           breed= "German Shephered";
    }
    
    public static void main(String args[])
    {
        dog dg=new dog("Lucy","Serbian Husky");
        dg.setter();
        System.out.println("___________________________________________");
        System.out.println("            Modified Values");
        System.out.println("___________________________________________");
        System.out.println("Dog Name : "+dg.dname);
        System.out.println("Dog Breed : "+dg.breed);
        System.out.println("___________________________________________");
    }
}