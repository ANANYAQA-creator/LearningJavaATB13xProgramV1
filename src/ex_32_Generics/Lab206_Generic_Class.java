package ex_32_Generics;

public class Lab206_Generic_Class {

    // // T -> it is placeholder only -> it can be any data type.

    GeneriClass gc = new GeneriClass(20);
    GeneriClass gc2 =  new GeneriClass("Ananya");
    GeneriClass gc3 =  new GeneriClass(15.2);
    GeneriClass gc4 =  new GeneriClass(true);

}

class GeneriClass <T> {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public GeneriClass(T data) {
        this.data = data;
    }

}
