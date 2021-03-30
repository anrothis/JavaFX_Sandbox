package exampleWebView;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;

public class Controller implements Initializable {

    @FXML
    private Button reloadButton, refreshButton, historyButton;
    @FXML
    private TextField textField;
    @FXML
    private WebView webView;

    private WebEngine engine;
    private WebHistory webHistory;
    private String homePage;
    private double webZoom;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        engine = webView.getEngine();
        homePage = "www.google.de";
        textField.setText(homePage);
        webZoom = 1;
        loadPage();
    }

    public void loadPage() {
        engine.load("http://" + textField.getText());
    }

    public void refreshPage() {
        engine.reload();
    }

    public void zoomIn() {
        webZoom += 0.25;
        webView.setZoom(webZoom);
    }

    public void zoomOut() {
        webZoom -= 0.25;
        webView.setZoom(webZoom);
    }

    public void displayHistory() {
        webHistory = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = webHistory.getEntries();
        for (WebHistory.Entry entry : entries) {

            // System.out.println(entry);
            System.out.println(entry.getUrl() + " " + entry.getLastVisitedDate());
        }
    }

    public void backward() {
        webHistory = engine.getHistory();
        try {
            ObservableList<WebHistory.Entry> entries = webHistory.getEntries();
            webHistory.go(-1);
            textField.setText(entries.get(webHistory.getCurrentIndex()).getUrl());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public void forward() {
        webHistory = engine.getHistory();
        try {
            ObservableList<WebHistory.Entry> entries = webHistory.getEntries();
            webHistory.go(1);
            textField.setText(entries.get(webHistory.getCurrentIndex()).getUrl());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public void executeJS() {
        engine.executeScript("window.location = 'https://www.youtube.com';");
    }
}
