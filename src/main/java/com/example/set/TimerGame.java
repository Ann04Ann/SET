package com.example.set;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TimerGame {

    private Label timerLabel;
    private Timeline timeline;
    private int timeSeconds = 0;


    public TimerGame(Label timerLabel) {

        this.timerLabel=  timerLabel;

    }

    public void start() {
        if (timeline != null) {
            timeline.stop();
        }

        //timeSeconds = 0;
        timeline = new Timeline();
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.getKeyFrames().add(
                new KeyFrame(Duration.seconds(1),
                        new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                timeSeconds++;
                                updateTimerLabel();
                                //System.out.println(timeSeconds);

                            }
                        }));
        timeline.playFromStart();
    }

    public void stop() {
        if (timeline != null) {
            timeline.stop();
        }
        //timeSeconds = 0;
        updateTimerLabel();
    }

    public void pause() {
        if (timeline != null) {
            timeline.pause();
        }
    }

    private void updateTimerLabel() {
        //int minutes = timeSeconds / 60;
        //int seconds = timeSeconds % 60;
        //timerLabel.setText(String.format("%02d:%02d", minutes, seconds));
        System.out.println(timeSeconds);
    }

    public int getTimeSeconds(){

        return timeSeconds;

    }

    public static void main(String[] args) {
        //launch(args);
    }
}
