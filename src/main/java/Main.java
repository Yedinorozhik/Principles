public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.middleName = "Иванович";
        post.surname = "Иванов";
        post.passport = "4444 № 44444444";
        post.phone = "+7 (999)-999-99-99";
        post.subscription = Boolean.parseBoolean("true");
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 12;
        post.birthday.year = 1999;
    }
}