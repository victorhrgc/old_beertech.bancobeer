package beertech.becks.api.model;

public enum TypeOperation {

    DEPOSITO("D"),
    SAQUE("S");

    private String description;

    TypeOperation(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}

