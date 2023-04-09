class Shape {
    int getCorner(){
        return 0;
    }
}

class Rectangle extends Shape{
    @Override
    int getCorner() {
        return 4;
    }

    // access to the getcorner method of parent Shape using super keyword
    int getShapeCorner(){
        return super.getCorner();
    }
}
