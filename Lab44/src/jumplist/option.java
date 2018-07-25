
package jumplist;

public class option {
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

    public option(String displayText, String urlText) {
        this.displayText = displayText;
        this.urlText = urlText;
    }
    
    public String getHTMLText(){
        StringBuilder display = new StringBuilder(64);
        display.append("<a href =\"");
        display.append(urlText);
        display.append("\">");
        display.append(displayText);
        display.append("</a>");
        return display.toString();
    }
}
