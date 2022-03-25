package ru.skillbox;


public class Elevator {

    private int currentFloor = 0;
    private int minFloor ;
    private int maxFloor ;


    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;

    }

    public int getCurrentFloor() {
        return currentFloor;
    }


    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;

    }

    public void moveUP() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }

    public void move(int floor) {
        boolean error = (minFloor > floor) | (floor > maxFloor);
        if (error) {
             System.out.println("Такого этажа нет!!!");
        } else {

            if (currentFloor < maxFloor & floor > currentFloor) {
                while (floor > currentFloor) {
                    moveUP();
                    System.out.println("Этаж: " + currentFloor);

                }
            } else if (currentFloor > minFloor & floor < currentFloor) {
                while (floor < currentFloor) {
                    moveDown();
                    System.out.println("Этаж: " + currentFloor);
                }


            } else {
                System.out.println("Вы на нужном этаже");
            }



        }
    }
}




