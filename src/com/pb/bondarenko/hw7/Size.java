package com.pb.bondarenko.hw7;

public enum Size {
    XXS("32") {
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS("34"),
    S("36"),
    M("38"),
    L("40");
    private String description;
    private String eurosize;

    Size(String eurosize, String description) {
        this.description = description;
        this.eurosize = eurosize;
    }

    Size(String eurosize) {
        this.eurosize = eurosize;
    }


    public String getDescription() {
        return "Взрослый размер";
    }

    @Override
    public String toString() {
        return '\'' +
                name() + '\'' + "- " +
                getDescription() +
                ", Евро - '" + eurosize + '\''
                ;
    }

    public String getEurosize() {
        return eurosize;
    }
}
