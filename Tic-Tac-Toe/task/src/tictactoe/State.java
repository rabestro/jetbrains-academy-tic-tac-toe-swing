package tictactoe;

public enum State {
    EMPTY("Game is not started"),
    PLAYING("The turn of {0} Player ({1})"),
    DRAW("Draw"),
    X_WINS("The {0} Player (X) wins"),
    O_WINS("The {0} Player (O) wins");

    final String message;

    State(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}