public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Billy","Herrington@mail.ru", 'M');
        a1.SetEmail("VanD@mail.ru");
        a1.GetEmail();
        a1.GetName();
        a1.GetGender();
        System.out.println(a1);
    }
}
