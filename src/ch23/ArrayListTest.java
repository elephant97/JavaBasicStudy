package ch23;

import ch21.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) { // 이클립스에서 f1에서 사용가능 API를 사용할 수 있는지 확인 가능.
        ArrayList<Book> library = new ArrayList<Book>();//jre 5.0부터 지원 어떤 객채를 사용할지 지정하는 것이 좋음.
        library.add(new Book("태백산맥1", "조정래"));
        library.add(new Book("태백산맥2", "조정래"));
        library.add(new Book("태백산맥3", "조정래"));
        library.add(new Book("태백산맥4", "조정래"));

        for(int i = 0; i<library.size(); i++){
            library.get(i).showInfo();
        }
    }
}
