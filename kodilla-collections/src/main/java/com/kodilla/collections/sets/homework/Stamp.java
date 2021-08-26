package com.kodilla.collections.sets.homework;


import java.util.Objects;

public class Stamp {
    private String stampName;
    private String stampMeasurements;
    private String stamped;


    public Stamp(String stampName, String stampMeasurements, String stamped) {
        this.stampName = stampName;
        this.stampMeasurements = stampMeasurements;
        this.stamped = stamped;

        }

        public String getStampName () {
            return stampName;
        }

        public String getStampMeasurements () {
            return stampMeasurements;
        }

        public String getStamped () {
            return stamped;
        }


        @Override public boolean equals (Object o){
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Stamp stamp = (Stamp) o;
            return this.stampName.equals(stamp.stampName)
                    && this.stampMeasurements.equals(stamp.stampMeasurements)
                    && this.stamped.equals(stamp.stamped);
        }

        @Override public int hashCode() {
            return Objects.hash(stampName, stampMeasurements, stamped );
        }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampMeasurements='" + stampMeasurements + '\'' +
                ", stamped='" + stamped + '\'' +
                '}';
    }
}

