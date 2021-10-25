package com.kodilla.parametrized_tests.homework;


    import java.lang.*;

    public class Calculate {

        private double heightInMeters;
        private double weightInKilogram;

        public Calculate(double weightInKilogram, double heightInMeters) {
            this.heightInMeters = heightInMeters;
            this.weightInKilogram = weightInKilogram;
        }



        public String bmi() {
            // Use `Math.pow` to get the power of the height
            double bmi = weightInKilogram / Math.pow(heightInMeters, 2);

            if (bmi<=18.5) {
                return "Underweight";
            }
            if (bmi<=25.0) return "Normal";
            if (bmi<=30.0) return "Overweight";
            if (bmi>30) return "Obese";

            // We should never get here..
            return "";
        }
    }

