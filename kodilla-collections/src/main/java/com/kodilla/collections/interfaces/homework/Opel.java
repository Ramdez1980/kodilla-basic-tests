    package com.kodilla.collections.interfaces.homework;

    import java.util.Objects;
    import java.util.Random;

    public class Opel implements Car{

        private double currentSpeed;

        public Opel(double currentSpeed) {
            this.currentSpeed = currentSpeed;
        }

        @Override
        public String getName() {
            return "Opel";
        }

        @Override
        public double getSpeed() {
            return currentSpeed;
        }

        @Override
        public void increaseSpeed() {
            currentSpeed = currentSpeed  + 10;
        }

        @Override
        public void decreaseSpeed() {
            currentSpeed = currentSpeed - 10;
        }


    }
