package cn.bdqn.enums;

public enum PayStatus {
    UNPAID("未支付",1),
    PAID("已支付",2);

    private String content;
    private int num;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    PayStatus(String content, int num) {
        this.content = content;
        this.num = num;
    }
}
