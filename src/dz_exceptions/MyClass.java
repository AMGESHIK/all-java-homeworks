package dz_exceptions;


public class MyClass {
    int enter;

    public MyClass(int enter) throws SmallNumberException, BigNumberException {
        int size = 20;
        int diapazon[] = new int[size];
        for (int i = 0; i < size; i++) {
            diapazon[i] = i + 40;
        }
        if (enter >= diapazon[0] && enter <= diapazon[size - 1]) {
            this.enter = enter;
        } else if (enter < diapazon[0]) {
            throw new SmallNumberException("Число " + Integer.toString(enter) + " находится за границей диапазона(слева)");
        } else {
            throw new BigNumberException("Число " + Integer.toString(enter) + " находится за границей диапазона(справа)");
        }
    }

}
