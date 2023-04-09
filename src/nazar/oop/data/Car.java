package nazar.oop.data;

public interface Car extends HasBrand{ // HasBrand for interface inheritance
    void drive();

    int getTire();

    default boolean isBigCar(){ // child class tidak wajib meng-override method ini
        return false;
    }
}
