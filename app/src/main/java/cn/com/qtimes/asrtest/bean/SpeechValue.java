package cn.com.qtimes.asrtest.bean;

/**
 * Author: JackHou
 * Date: 2017/9/30.
 * 语音识别出来的json实体
 */

public class SpeechValue {
    private int sn;
    private boolean ls = false;
    private int bg = 0;
    private int bd = 0;
    private String [] ws;

    public SpeechValue() {
    }

    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    public boolean isLs() {
        return ls;
    }

    public void setLs(boolean ls) {
        this.ls = ls;
    }

    public int getBg() {
        return bg;
    }

    public void setBg(int bg) {
        this.bg = bg;
    }

    public int getBd() {
        return bd;
    }

    public void setBd(int bd) {
        this.bd = bd;
    }

    public String[] getWs() {
        return ws;
    }

    public void setWs(String[] ws) {
        this.ws = ws;
    }
}
