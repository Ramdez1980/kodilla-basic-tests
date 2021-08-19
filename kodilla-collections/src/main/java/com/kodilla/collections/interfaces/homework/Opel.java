    package com.kodilla.collections.interfaces.homework;

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
        public double increaseSpeed() {

            Random random = new Random();
            return currentSpeed + random.nextDouble() * 100 + 1;
        }

        @Override
        public double decreaseSpeed() {

            return currentSpeed / 1.8;
        }
    }
