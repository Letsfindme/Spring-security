package fr.formation.students.enumeration;

import java.util.Date;

public enum Days {

    FRIDAY(false){
        @Override
        public double getPlatePrice() {
            return 1;
        }

        @Override
        public int getNumberOfPlates() {
            return 2;
        }
    }, MONDAY(true){
        @Override
        public double getPlatePrice() {
            return 2;
        }
    }, SATURDAY(true){
        @Override
        public double getPlatePrice() {
            return 20;
        }
    }, SUNDAY(true){
        @Override
        public double getPlatePrice() {
            return 30;
        }
    },
    THURSDAY(true){
        @Override
        public double getPlatePrice() {
            return 20;
        }
    }, TUESDAY(true){
        @Override
        public double getPlatePrice() {
            return 10;
        }
    }, WEDNESDAY(true){
        @Override
        public double getPlatePrice() {
            return 20;
        }
    };


    private boolean workingDay;

    private Days(boolean workingDay) {
        this.workingDay = workingDay;
    }

    public boolean isWorkingDay() {
        return workingDay;
    }

    public abstract double getPlatePrice();

    public int getNumberOfPlates() {
        return 1;
    }
}
