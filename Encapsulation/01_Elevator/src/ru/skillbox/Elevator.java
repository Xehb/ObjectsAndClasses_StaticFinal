package ru.skillbox;


public class Elevator {

    private int currentFloor = 0;
    private int minFloor = -1;
    private int maxFloor = 10;


    public Elevator(int minFloor, int maxFloor) {
        return;

    }

    public int getCurrentFloor() {
        errorFloor();
                return currentFloor;
    }

    public int errorFloor(int floor) {
        boolean error = (minFloor > floor) || (floor > maxFloor);
        if (error = true) {
            System.out.println("Введен неверный этаж");

        } else {

        }
        return floor;
    }



        public void moveDown () {

            currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;

        }

        public void moveUP () {
            currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
        }

        public void move ( int floor){
            if (currentFloor < maxFloor && floor > currentFloor) {
                while (floor > currentFloor) {
                    moveUP();
                    getCurrentFloor();
                    System.out.println("Этаж: " + currentFloor);

                }
            } else if (currentFloor > minFloor && floor < currentFloor) {
                while (floor < currentFloor) {
                    moveDown();
                    getCurrentFloor();
                    System.out.println("Этаж: " + currentFloor);
                }


            } else {
                System.out.println("Вы на нужном этаже");
            }


        }
    }




