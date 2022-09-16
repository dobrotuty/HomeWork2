public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String n, String e, char g){
        name = n;
        email = e;
        gender = g;
    }
    public String GetName(){
        System.out.println(name);
        return name;
    }
    public String GetEmail(){
        System.out.println(email);
        return email;
    }
    public void SetEmail(String email){
        this.email = email;
    }
    public char GetGender(){
        System.out.println(gender);
        return gender;
    }
    public String toString(){
        return ("Your name is:" + name +", Your email is:" + email + ", your gender is:" + gender);
    }
}
