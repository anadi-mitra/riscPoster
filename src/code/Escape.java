static Point g1;   //some global variable

void foo(MyClass c){

    Point p1= new Point(32,6);  //O1
    Point p2= new Point(16,4);  //O2
    Point p3= new Point(8,3);   //O3

    //passing O1 and O2 to bar
    bar(p1,p2);
    //we don't have implementation of foobar at static time
    c.foobar(p3);   //O3 escapes or not?
}

void bar(Point q1, Point q2){

    //only displaying fields of q1 hence O1 does not escape
    System.out.println("("+q1.x+","+q1.y+")");

    g1=q2;  //p2 is escaping to global space via g1

}


