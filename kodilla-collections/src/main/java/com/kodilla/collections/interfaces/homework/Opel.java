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
        public double increaseSpeed() {
            {return currentSpeed * 1.5; }
        }

        @Override
        public double decreaseSpeed() {

            return currentSpeed / 1.8;
        }

        //4.3//


        @Override
        public String toString() {
            return "Opel{" +
                    "currentSpeed=" + currentSpeed +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Opel opel = (Opel) o;
            return Double.compare(opel.currentSpeed, currentSpeed) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(currentSpeed);
        }
    }
