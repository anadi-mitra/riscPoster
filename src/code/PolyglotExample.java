void java-python(String anotherScript) {
    //API to manage polyglot environment
    Context context = Context.newBuilder().build();

    Point generatorPoint= new Point(32,54);//cartesian point

    String pythonScript =
        "def pointDoubling(point):\n" +
                "\tslope= (3* point.x* point.x- 3)/(2* point.y)\n" +
                "\tx= slope*slope-2*point.x\n" +
                "\ty= slope*(point.x-x)-point.y\n" +
                "\treturn Point.newPoint(x, y)\n"; //object created

    //context is API for managing polyglot runtime
    context.eval(Source.newBuilder("python", pythonScript).build());

    Value pythonBindings = context.getBindings("python");
    //get the python function in java
    Value pointDoubling = pythonBindings.getMember("pointDoubling");
    //pass the point object to python and store the results
    Value result = pointDoubling.execute(generatorPoint);

    showResults(result);
}

