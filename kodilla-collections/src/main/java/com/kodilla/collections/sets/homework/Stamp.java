package com.kodilla.collections.sets.homework;


import java.util.Objects;

public class Stamp {
    private String stampName;
    private String stampMeasurements;
    private boolean stamped;


    public Stamp(String stampName, String stampMeasurements, boolean stamped) {
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

        public boolean getStamped () {
            return stamped;
        }


        @Override public boolean equals (Object o){
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Stamp stamp = (Stamp) o;
            return Boolean.compare(stamp.stamped, stamped) == 0
                    && this.stampMeasurements.equals(stamp.stampMeasurements)
                    && this.stampName.equals(stamp.stampName);
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

