package com.company;

public class Point {

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return x + ", " + y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getX(int x) {
            return x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getY() {
            return y;
        }

        //public void setXV(int xV){
          //  this.xV = xV;
            //if (xV == x)
              //  System.out.println("The point xV is on the x-axis");
            //else
              //  System.out.println("The point xV is not on the x axis");
            //if (x == y)
              //  System.out.println("The points have the same coordinates");
        public boolean hasSameCoordinates(int X, int Y) {
            return x == X && y == X;
        }


        //public boolean getXV(boolean xV){
          //  return xV;
        public boolean getXV(){
            return x == 0;
        }

    public int midpoint(int X, int Y) {
        //return  ((X + x) / 2)  + ((Y + y) / 2);
        return (X + Y) / 2;
    }



    private int x;
    private int y;

    }

