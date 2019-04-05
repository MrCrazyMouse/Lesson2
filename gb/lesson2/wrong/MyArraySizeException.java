package gb.lesson2.wrong;

class MyArraySizeException extends Exception {
    MyArraySizeException(){
        super("Несоответствие размера массива");
    }
}