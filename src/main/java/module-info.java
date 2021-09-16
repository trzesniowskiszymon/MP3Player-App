module mp3player {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires jid3lib;

    exports example.trzesniowskiszymon.mp3Player.main to javafx.graphics;
    opens example.trzesniowskiszymon.mp3Player.controller to javafx.fxml;
    opens example.trzesniowskiszymon.mp3Player.mp3 to javafx.base;
}