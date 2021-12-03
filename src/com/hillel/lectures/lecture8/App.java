package com.hillel.lectures.lecture8;

public class App {

    public static void main(String[] args) {
//        Boeing737.Boeing737Drawing boeing737Drawing = new Boeing737.Boeing737Drawing("schema 1");
//        boeing737Drawing.draw();
//
//        Bicycle merida = new Bicycle("Merida");
//        Bicycle aist = new Bicycle("Aist");
//        Bicycle.HandleBar handleBar = aist.new HandleBar(30);
//        Bicycle.Seat seat = aist.new Seat(2);
//
//        seat.seatUp();
//        aist.ride();
//        handleBar.turnLeft();
//        handleBar.turnRight();

        rotate();
    }

    public static void rotate() {
        Rotatable verticalRotatable = new Rotatable() {
            @Override
            public void rotate() {
                System.out.println("Rotate vertically");
            }
        };
        Rotatable horizontalRotatable = new Rotatable() {
            @Override
            public void rotate() {
                System.out.println("Rotate horizontally");
            }
        };

        verticalRotatable.rotate();
        horizontalRotatable.rotate();

//        VerticalRotatable verticalRotatable = new VerticalRotatable();
//        HorizontalRotatable horizontalRotatable = new HorizontalRotatable();
//
//        verticalRotatable.rotate();
//        horizontalRotatable.rotate();
    }

}