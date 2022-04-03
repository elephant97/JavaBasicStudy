package ch21;

public class ObjectCopyTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5]; //주소를 넣을 공간을 생성함
        Book[] realCopyLibrary = new Book[5];

//        for(int i = 0; i < library.length; i++){
//            System.out.println(library[i]);
//        }

        library[0] = new Book("태백산맥", "조정래");
        library[1] = new Book("태백산맥", "조정래");
        library[2] = new Book("태백산맥", "조정래");
        library[3] = new Book("태백산맥", "조정래");
        library[4] = new Book("태백산맥", "조정래");

        System.arraycopy(library, 0, copyLibrary, 0, 5); //copyLibrary의 객채를 만들지 않고 하면 주소가 복사되므로
                                                                                //서로의 주소값이 같아 하나의 데이터만 변경되어도 두개 배열의 데이터가 변경됨

        System.out.println("== libaray ==");
        for(Book book : library)
        {
            System.out.println(book);
            book.showInfo();
        }

        System.out.println("== copy libaray ==");
        for(Book book : copyLibrary)
        {
            System.out.println(book);
            book.showInfo();
        }

        for(int i = 0; i<realCopyLibrary.length; i++){
            realCopyLibrary[i] = new Book();
        }

        for(int i = 0; i<realCopyLibrary.length; i++) {
            realCopyLibrary[i].setAuthor(library[i].getAuthor());
            realCopyLibrary[i].setTitle(library[i].getTitle());
        }

        System.out.println("== real copy libaray ==");
        for(Book book : realCopyLibrary)
        {
            System.out.println(book);
            book.showInfo();
        }

   }
}
