//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        // Создаем авторов
        Author author1 = new Author("Михаил", "Булгаков");
        Author author2 = new Author("Федор", "Достоевский");

        // Создаем книги
        Book book1 = new Book("Мастер и Маргарита", author1, 1966);
        Book book2 = new Book("Преступление и наказание", author2, 1866);

        // Выводим информацию о книгах
        System.out.println("Книга 1: " + book1.getTitle());
        System.out.println("Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());
        System.out.println("Год публикации: " + book1.getPublicationYear());

        System.out.println("Книга 2: " + book2.getTitle());
        System.out.println("Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName());
        System.out.println("Год публикации: " + book2.getPublicationYear());

        // Изменяем год публикации первой книги
        book1.setPublicationYear(1967);
        System.out.println("Обновленный год публикации книги 1: " + book1.getPublicationYear());
    }

}

