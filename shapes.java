   public static double rectangleArea(double length, double width) {
        return length * width;
    }
    public static double rectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
    public static double rightTriangleArea(double base, double height) {
        return (height * base) / 2;
    }
    public static double rightTrianglePerimeter(double base, double height) {
        return base + height + (Math.pow(base, 2) + Math.pow(height, 2));
    }
    public static double boxVolume(double length, double width, double depth) {
        return length * width * depth;
    }
    public static double boxSurfaceArea(double length, double width,
                                        double depth) {
        return 2 * (length * width) + 2 * (length * depth) + 2 * (width * depth);
    }
    public static double sphereVolume(double radius) {
        return ((4.0/3.0)* Math.PI)* Math.pow(radius, 3);
    }

    public static double sphereSurfaceArea(double radius) {
        return ((4 * Math.PI)* Math.pow(radius, 2));
    }
