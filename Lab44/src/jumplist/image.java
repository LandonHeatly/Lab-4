/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumplist;

/**
 *
 * @author 01792481
 */
public class image {
    private String displayText;
    private String urlText;

    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    public String getUrlText() {
        return urlText;
    }

    public void setUrlText(String urlText) {
        this.urlText = urlText;
    }

    public image(String displayText, String urlText) {
        this.displayText = displayText;
        this.urlText = urlText;
    }
    
    public String getHTMLText(){
        StringBuilder display = new StringBuilder(64);
        display.append("<img src=\"");
        display.append(urlText);
        display.append("\" alt=\"");
        display.append(displayText);
        display.append("\">");
        return display.toString();
    }
}
