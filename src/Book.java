public class Book {
    String name;
    Genre genre;
    String author;

    public Book(String name, Genre genre, String author) {
        this.name = name;
        this.genre = genre;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                ", author='" + author + '\'' +
                '}';
    }
}


enum Genre {
    dsfg,
    asdfg,
    sadfasdf

}

