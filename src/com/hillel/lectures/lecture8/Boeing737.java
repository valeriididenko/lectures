package com.hillel.lectures.lecture8;

public class Boeing737 {

    private final static String MODEL = "Boeing 737";
    private String serialNumber;
    public String color;

    public Boeing737(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public static class Boeing737Drawing {
        private String schema;

        public Boeing737Drawing(String schema) {
            this.schema = schema;
        }

        public static void draw() {
            System.out.println(MODEL);
            System.out.println();
        }

        public String getSchema() {
            return schema;
        }

        public void setSchema(String schema) {
            this.schema = schema;
        }

    }

    private String info() {
        return "boeing info";
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

}
