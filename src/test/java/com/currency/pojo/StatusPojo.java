package com.currency.pojo;

public class StatusPojo {
    private String timestamp;
    private String error_code;
    private String error_message;
    private String elapsed;
    private String credit_count;
    private String notice;


    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getError_message() {
        return error_message;
    }

    public void setError_message(String error_message) {
        this.error_message = error_message;
    }

    public String getElapsed() {
        return elapsed;
    }

    public void setElapsed(String elapsed) {
        this.elapsed = elapsed;
    }

    public String getCredit_count() {
        return credit_count;
    }

    public void setCredit_count(String credit_count) {
        this.credit_count = credit_count;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }


    @Override
    public String toString() {
        return "StatusPojo{" +
                "timestamp='" + timestamp + '\'' +
                ", error_code='" + error_code + '\'' +
                ", error_message='" + error_message + '\'' +
                ", elapsed='" + elapsed + '\'' +
                ", credit_count='" + credit_count + '\'' +
                ", notice='" + notice + '\'' +
                '}';
    }
}
